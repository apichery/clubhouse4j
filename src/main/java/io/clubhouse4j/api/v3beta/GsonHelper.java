package io.clubhouse.api.v3beta;

import java.lang.reflect.Type;
import java.time.Instant;
import java.util.UUID;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonPrimitive;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer;

public class GsonHelper {
    public static final Gson GSON = gsonParser();
    public static final String APPLICATION_JSON = "application/json";

    public static Gson gsonParser() {
        GsonBuilder result = new GsonBuilder();
        result.registerTypeAdapter(Instant.class, new InstantSerializer());
        result.registerTypeAdapter(UUID.class, new UUIDSerializer());
        return result.create();
    }

    public static class InstantSerializer implements JsonSerializer<Instant>, JsonDeserializer<Instant> {
        @Override
        public JsonElement serialize(Instant src, Type typeOfSrc, JsonSerializationContext context) {
            String str = src.toString();
            return new JsonPrimitive(str);
        }

        @Override
        public Instant deserialize(JsonElement json, Type typeOfT, JsonDeserializationContext context) {
            String str = json.getAsString();
            return Instant.parse(str);
        }
    }

    public static class UUIDSerializer implements JsonSerializer<UUID>, JsonDeserializer<UUID> {
        @Override
        public JsonElement serialize(UUID src, Type typeOfSrc, JsonSerializationContext context) {
            String str = src.toString();
            return new JsonPrimitive(str);
        }

        @Override
        public UUID deserialize(JsonElement json, Type typeOfT, JsonDeserializationContext context) {
            String str = json.getAsString();
            return UUID.fromString(str);
        }
    }
}
