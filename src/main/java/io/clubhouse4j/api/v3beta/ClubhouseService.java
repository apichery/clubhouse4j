package io.clubhouse.api.v3beta;

import static io.clubhouse.api.v3beta.GsonHelper.APPLICATION_JSON;
import static io.clubhouse.api.v3beta.GsonHelper.GSON;
import static javax.ws.rs.core.MediaType.APPLICATION_JSON_TYPE;

import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.ws.rs.ClientErrorException;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.Entity;
import javax.ws.rs.core.Response;

import com.google.common.util.concurrent.UncheckedExecutionException;

public class ClubhouseService {
    private static final Logger logger = Logger.getLogger("io.clubhouse.api.v3beta.ClubhouseService");

    protected ClubhouseClient client;

    public ClubhouseService(ClubhouseClient client) {
        this.client = client;
    }

    protected <T> T executeGet(String url, Class<T> classOfT) {
        while (true) {
            try {
                String response = ClientBuilder.newClient().target(url).request(APPLICATION_JSON).get(String.class);
                return GSON.fromJson(response, classOfT);
            } catch (javax.ws.rs.ClientErrorException e) {
                handleException(e);
            }
        }
    }

    protected <T, U> T executePost(String url, U params, Class<T> classOfT) {
        String body = GSON.toJson(params);
        Entity<String> entity = Entity.entity(body, APPLICATION_JSON_TYPE);

        while (true) {
            try {
                String response = ClientBuilder.newClient().target(url).request(APPLICATION_JSON).post(entity, String.class);
                return GSON.fromJson(response, classOfT);
            } catch (javax.ws.rs.ClientErrorException e) {
                handleException(e);
            }
        }
    }

    protected <T, U> T executePut(String url, U params, Class<T> classOfT) {
        String body = GSON.toJson(params);
        Entity<String> entity = Entity.entity(body, APPLICATION_JSON_TYPE);

        while (true) {
            try {
                String response = ClientBuilder.newClient().target(url).request(APPLICATION_JSON).put(entity, String.class);
                return GSON.fromJson(response, classOfT);
            } catch (javax.ws.rs.ClientErrorException e) {
                handleException(e);
            }
        }
    }

    protected void executeDelete(String url) {
        while (true) {
            try {
                Response response = ClientBuilder.newClient().target(url).request(APPLICATION_JSON).delete();
                if (response.getStatus() < 200 || response.getStatus() >= 300) {
                    throw new ClientErrorException(response);
                }
                return;
            } catch (javax.ws.rs.ClientErrorException e) {
                handleException(e);
            }
        }
    }

    protected <T> void executeDelete(String url, T params) {
        String body = GSON.toJson(params);
        Entity<String> entity = Entity.entity(body, APPLICATION_JSON_TYPE);

        while (true) {
            try {
                Response response = ClientBuilder.newClient().target(url).request(APPLICATION_JSON).build("DELETE", entity).invoke();
                if (response.getStatus() < 200 || response.getStatus() >= 300) {
                    throw new ClientErrorException(response);
                }
                return;
            } catch (javax.ws.rs.ClientErrorException e) {
                handleException(e);
            }
        }
    }

    private void handleException(ClientErrorException e) {
        if (e.getResponse().getStatus() == 429) {
            // Retry
            try {
                int delay = new Random().nextInt(30000);
                logger.log(Level.FINE, "Throttling..." + Thread.currentThread().getName() + " for " + delay + " sec");
                Thread.sleep(delay);
            } catch (InterruptedException interruptedException) {
                Thread.currentThread().interrupt();
                throw new RuntimeException("Interrupted while throttling Clubhouse Rest API.", e);
            }
        } else {
            throw e;
        }
    }
}
