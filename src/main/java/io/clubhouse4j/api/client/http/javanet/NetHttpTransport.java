package io.clubhouse4j.api.client.http.javanet;

import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.Proxy;
import java.net.URL;
import java.security.GeneralSecurityException;
import java.security.KeyStore;
import java.security.cert.CertificateFactory;
import java.util.Arrays;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocketFactory;

import com.google.api.client.http.HttpMethods;
import com.google.api.client.http.HttpTransport;
import com.google.api.client.http.javanet.ConnectionFactory;
import com.google.api.client.http.javanet.DefaultConnectionFactory;
import com.google.api.client.util.Beta;
import com.google.api.client.util.Preconditions;
import com.google.api.client.util.SecurityUtils;
import com.google.api.client.util.SslUtils;

/**
 * Copy of {@link com.google.api.client.http.javanet.NetHttpTransport}, changed to authorize DELETE requests with payloads
 */
public final class NetHttpTransport extends HttpTransport {

    /**
     * All valid request methods as specified in {@link HttpURLConnection#setRequestMethod}, sorted in
     * ascending alphabetical order.
     */
    private static final String[] SUPPORTED_METHODS = {HttpMethods.DELETE,
            HttpMethods.GET,
            HttpMethods.HEAD,
            HttpMethods.OPTIONS,
            HttpMethods.POST,
            HttpMethods.PUT,
            HttpMethods.TRACE};

    static {
        Arrays.sort(SUPPORTED_METHODS);
    }

    /**
     * Factory to produce connections from {@link URL}s
     */
    private final ConnectionFactory connectionFactory;

    /**
     * SSL socket factory or {@code null} for the default.
     */
    private final SSLSocketFactory sslSocketFactory;

    /**
     * Host name verifier or {@code null} for the default.
     */
    private final HostnameVerifier hostnameVerifier;

    /**
     * Constructor with the default behavior.
     * <p>
     * <p>
     * Instead use {@link NetHttpTransport.Builder} to modify behavior.
     * </p>
     */
    public NetHttpTransport() {
        this((ConnectionFactory) null, null, null);
    }

    /**
     * @param proxy            HTTP proxy or {@code null} to use the proxy settings from <a
     *                         href="http://docs.oracle.com/javase/7/docs/api/java/net/doc-files/net-properties.html">
     *                         system properties</a>
     * @param sslSocketFactory SSL socket factory or {@code null} for the default
     * @param hostnameVerifier host name verifier or {@code null} for the default
     */
    NetHttpTransport(
            Proxy proxy, SSLSocketFactory sslSocketFactory, HostnameVerifier hostnameVerifier) {
        this(new DefaultConnectionFactory(proxy), sslSocketFactory, hostnameVerifier);
    }

    /**
     * @param connectionFactory factory to produce connections from {@link URL}s; if {@code null} then
     *                          {@link DefaultConnectionFactory} is used
     * @param sslSocketFactory  SSL socket factory or {@code null} for the default
     * @param hostnameVerifier  host name verifier or {@code null} for the default
     * @since 1.20
     */
    NetHttpTransport(ConnectionFactory connectionFactory,
                     SSLSocketFactory sslSocketFactory, HostnameVerifier hostnameVerifier) {
        this.connectionFactory =
                connectionFactory == null ? new DefaultConnectionFactory() : connectionFactory;
        this.sslSocketFactory = sslSocketFactory;
        this.hostnameVerifier = hostnameVerifier;
    }

    @Override
    public boolean supportsMethod(String method) {
        return Arrays.binarySearch(SUPPORTED_METHODS, method) >= 0;
    }

    @Override
    protected NetHttpRequest buildRequest(String method, String url) throws IOException {
        Preconditions.checkArgument(supportsMethod(method), "HTTP method %s not supported", method);
        // connection with proxy settings
        URL connUrl = new URL(url);
        HttpURLConnection connection = connectionFactory.openConnection(connUrl);
        connection.setRequestMethod(method);
        // SSL settings
        if (connection instanceof HttpsURLConnection) {
            HttpsURLConnection secureConnection = (HttpsURLConnection) connection;
            if (hostnameVerifier != null) {
                secureConnection.setHostnameVerifier(hostnameVerifier);
            }
            if (sslSocketFactory != null) {
                secureConnection.setSSLSocketFactory(sslSocketFactory);
            }
        }
        return new NetHttpRequest(connection);
    }

    /**
     * Builder for {@link NetHttpTransport}.
     * <p>
     * <p>
     * Implementation is not thread-safe.
     * </p>
     *
     * @since 1.13
     */
    public static final class Builder {

        /**
         * SSL socket factory or {@code null} for the default.
         */
        private SSLSocketFactory sslSocketFactory;

        /**
         * Host name verifier or {@code null} for the default.
         */
        private HostnameVerifier hostnameVerifier;

        /**
         * HTTP proxy or {@code null} to use the proxy settings from <a
         * href="http://docs.oracle.com/javase/7/docs/api/java/net/doc-files/net-properties.html">system
         * properties</a>.
         */
        private Proxy proxy;

        /**
         * {@link ConnectionFactory} or {@code null} to use a DefaultConnectionFactory. This value is
         * only used if proxy is unset.
         */
        private ConnectionFactory connectionFactory;

        /**
         * Sets the HTTP proxy or {@code null} to use the proxy settings from <a
         * href="http://docs.oracle.com/javase/7/docs/api/java/net/doc-files/net-properties.html">system
         * properties</a>.
         * <p>
         * <p>
         * For example:
         * </p>
         * <p>
         * <pre>
         * setProxy(new Proxy(Proxy.Type.HTTP, new InetSocketAddress("127.0.0.1", 8080)))
         * </pre>
         */
        public NetHttpTransport.Builder setProxy(Proxy proxy) {
            this.proxy = proxy;
            return this;
        }

        /**
         * Sets the {@link ConnectionFactory} or {@code null} to use a {@link DefaultConnectionFactory}.
         * <b>This value is ignored if the {@link #setProxy} has been called with a non-null value.</b>
         * <p>
         * <p>
         * If you wish to use a {@link Proxy}, it should be included in your {@link ConnectionFactory}
         * implementation.
         * </p>
         *
         * @since 1.20
         */
        public NetHttpTransport.Builder setConnectionFactory(ConnectionFactory connectionFactory) {
            this.connectionFactory = connectionFactory;
            return this;
        }

        /**
         * Sets the SSL socket factory based on root certificates in a Java KeyStore.
         * <p>
         * <p>
         * Example usage:
         * </p>
         * <p>
         * <pre>
         * trustCertificatesFromJavaKeyStore(new FileInputStream("certs.jks"), "password");
         * </pre>
         *
         * @param keyStoreStream input stream to the key store (closed at the end of this method in a
         *                       finally block)
         * @param storePass      password protecting the key store file
         * @since 1.14
         */
        public NetHttpTransport.Builder trustCertificatesFromJavaKeyStore(InputStream keyStoreStream, String storePass)
                throws GeneralSecurityException, IOException {
            KeyStore trustStore = SecurityUtils.getJavaKeyStore();
            SecurityUtils.loadKeyStore(trustStore, keyStoreStream, storePass);
            return trustCertificates(trustStore);
        }

        /**
         * Sets the SSL socket factory based root certificates generated from the specified stream using
         * {@link CertificateFactory#generateCertificates(InputStream)}.
         * <p>
         * <p>
         * Example usage:
         * </p>
         * <p>
         * <pre>
         * trustCertificatesFromStream(new FileInputStream("certs.pem"));
         * </pre>
         *
         * @param certificateStream certificate stream
         * @since 1.14
         */
        public NetHttpTransport.Builder trustCertificatesFromStream(InputStream certificateStream)
                throws GeneralSecurityException, IOException {
            KeyStore trustStore = SecurityUtils.getJavaKeyStore();
            trustStore.load(null, null);
            SecurityUtils.loadKeyStoreFromCertificates(
                    trustStore, SecurityUtils.getX509CertificateFactory(), certificateStream);
            return trustCertificates(trustStore);
        }

        /**
         * Sets the SSL socket factory based on a root certificate trust store.
         *
         * @param trustStore certificate trust store (use for example {@link SecurityUtils#loadKeyStore}
         *                   or {@link SecurityUtils#loadKeyStoreFromCertificates})
         * @since 1.14
         */
        public NetHttpTransport.Builder trustCertificates(KeyStore trustStore) throws GeneralSecurityException {
            SSLContext sslContext = SslUtils.getTlsSslContext();
            SslUtils.initSslContext(sslContext, trustStore, SslUtils.getPkixTrustManagerFactory());
            return setSslSocketFactory(sslContext.getSocketFactory());
        }

        /**
         * {@link Beta} <br/>
         * Disables validating server SSL certificates by setting the SSL socket factory using
         * {@link SslUtils#trustAllSSLContext()} for the SSL context and
         * {@link SslUtils#trustAllHostnameVerifier()} for the host name verifier.
         * <p>
         * <p>
         * Be careful! Disabling certificate validation is dangerous and should only be done in testing
         * environments.
         * </p>
         */
        @Beta
        public NetHttpTransport.Builder doNotValidateCertificate() throws GeneralSecurityException {
            hostnameVerifier = SslUtils.trustAllHostnameVerifier();
            sslSocketFactory = SslUtils.trustAllSSLContext().getSocketFactory();
            return this;
        }

        /**
         * Returns the SSL socket factory.
         */
        public SSLSocketFactory getSslSocketFactory() {
            return sslSocketFactory;
        }

        /**
         * Sets the SSL socket factory or {@code null} for the default.
         */
        public NetHttpTransport.Builder setSslSocketFactory(SSLSocketFactory sslSocketFactory) {
            this.sslSocketFactory = sslSocketFactory;
            return this;
        }

        /**
         * Returns the host name verifier or {@code null} for the default.
         */
        public HostnameVerifier getHostnameVerifier() {
            return hostnameVerifier;
        }

        /**
         * Sets the host name verifier or {@code null} for the default.
         */
        public NetHttpTransport.Builder setHostnameVerifier(HostnameVerifier hostnameVerifier) {
            this.hostnameVerifier = hostnameVerifier;
            return this;
        }

        /**
         * Returns a new instance of {@link NetHttpTransport} based on the options.
         */
        public NetHttpTransport build() {
            return proxy == null
                    ? new NetHttpTransport(connectionFactory, sslSocketFactory, hostnameVerifier)
                    : new NetHttpTransport(proxy, sslSocketFactory, hostnameVerifier);
        }
    }
}
