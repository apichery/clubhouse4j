package io.clubhouse.api.v3beta;

import com.google.common.base.Joiner;

public class ClubhouseClient {
    public static final String BASE_URL_V2 = "https://api.clubhouse.io/api/beta/";

    private String baseUrl = BASE_URL_V2;
    private String apiToken;

    public ClubhouseClient() {
    }

    public ClubhouseClient(String apiToken) {
        this.apiToken = apiToken;
    }

    public String getBaseUrl() {
        return baseUrl;
    }

    public void setBaseUrl(String baseUrl) {
        this.baseUrl = baseUrl;
    }

    public void setApiToken(String apiToken) {
        this.apiToken = apiToken;
    }

    public String buildUrl(Object... fragments) {
        return baseUrl + Joiner.on("/").join(fragments) + "?token=" + apiToken;
    }
}
