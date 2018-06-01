package io.clubhouse4j.api.v3beta;

import static io.clubhouse4j.api.v3beta.GsonHelper.APPLICATION_JSON;
import static io.clubhouse4j.api.v3beta.GsonHelper.GSON;

import java.io.IOException;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;

import com.google.api.client.http.ByteArrayContent;
import com.google.api.client.http.GenericUrl;
import com.google.api.client.http.HttpContent;
import com.google.api.client.http.HttpMethods;
import com.google.api.client.http.HttpRequest;
import com.google.api.client.http.HttpRequestFactory;
import com.google.api.client.http.HttpResponse;
import com.google.api.client.http.HttpResponseException;
import com.google.api.client.http.HttpTransport;
import com.google.api.client.json.JsonFactory;
import com.google.api.client.json.JsonObjectParser;
import com.google.api.client.json.gson.GsonFactory;
import com.google.common.base.Charsets;
import io.clubhouse4j.api.client.http.javanet.NetHttpTransport;

public class ClubhouseService {
    private static final Logger logger = Logger.getLogger("io.clubhouse.api.v3beta.ClubhouseService");
    private static final HttpTransport HTTP_TRANSPORT = new NetHttpTransport();
    private static final JsonFactory JSON_FACTORY = new GsonFactory();
    private static final HttpRequestFactory HTTP_REQUEST_FACTORY = HTTP_TRANSPORT.createRequestFactory(request -> request.setParser(new JsonObjectParser(JSON_FACTORY)));

    protected ClubhouseClient client;

    public ClubhouseService(ClubhouseClient client) {
        this.client = client;
    }

    protected <T> T executeGet(String url, Class<T> classOfT) throws IOException {
        HttpResponse response;
        do {
            HttpRequest request = HTTP_REQUEST_FACTORY.buildGetRequest(new GenericUrl(url));
            request.setThrowExceptionOnExecuteError(false);
            response = request.execute();
        } while (retry(response));
        if (!response.isSuccessStatusCode()) {
            throw new HttpResponseException(response);
        }
        return GSON.fromJson(response.parseAsString(), classOfT);
    }

    protected <T, U> T executePost(String url, U params, Class<T> classOfT) throws IOException {
        String body = GSON.toJson(params);
        HttpContent httpContent = new ByteArrayContent(APPLICATION_JSON, body.getBytes(Charsets.UTF_8));

        HttpResponse response;
        do {
            HttpRequest request = HTTP_REQUEST_FACTORY.buildPostRequest(new GenericUrl(url), httpContent);
            request.setThrowExceptionOnExecuteError(false);
            response = request.execute();
        } while (retry(response));
        if (!response.isSuccessStatusCode()) {
            throw new HttpResponseException(response);
        }
        return GSON.fromJson(response.parseAsString(), classOfT);
    }

    protected <T, U> T executePut(String url, U params, Class<T> classOfT) throws IOException {
        String body = GSON.toJson(params);
        HttpContent httpContent = new ByteArrayContent(APPLICATION_JSON, body.getBytes(Charsets.UTF_8));

        HttpResponse response;
        do {
            HttpRequest request = HTTP_REQUEST_FACTORY.buildPutRequest(new GenericUrl(url), httpContent);
            request.setThrowExceptionOnExecuteError(false);
            response = request.execute();
        } while (retry(response));
        if (!response.isSuccessStatusCode()) {
            throw new HttpResponseException(response);
        }
        return GSON.fromJson(response.parseAsString(), classOfT);
    }

    protected void executeDelete(String url) throws IOException {
        HttpResponse response;
        do {
            HttpRequest request = HTTP_REQUEST_FACTORY.buildDeleteRequest(new GenericUrl(url));
            request.setThrowExceptionOnExecuteError(false);
            response = request.execute();
        } while (retry(response));
        if (!response.isSuccessStatusCode()) {
            throw new HttpResponseException(response);
        }
    }

    protected <T> void executeDelete(String url, T params) throws IOException {
        String body = GSON.toJson(params);
        HttpContent httpContent = new ByteArrayContent(APPLICATION_JSON, body.getBytes(Charsets.UTF_8));

        HttpResponse response;
        do {
            HttpRequest request = HTTP_REQUEST_FACTORY.buildRequest(HttpMethods.DELETE, new GenericUrl(url), httpContent);
            request.setThrowExceptionOnExecuteError(false);
            response = request.execute();
        } while (retry(response));
        if (!response.isSuccessStatusCode()) {
            throw new HttpResponseException(response);
        }
    }

    private boolean retry(HttpResponse response) {
        if (response.getStatusCode() == 429) {
            // Retry
            try {
                int delay = 30 + new Random().nextInt(30);
                logger.log(Level.FINE, "Throttling..." + Thread.currentThread().getName() + " for " + delay + " sec");
                Thread.sleep(delay * 1000);
                return true;
            } catch (InterruptedException interruptedException) {
                Thread.currentThread().interrupt();
                throw new RuntimeException("Interrupted while throttling Clubhouse Rest API.");
            }
        } else {
            return false;
        }
    }
}
