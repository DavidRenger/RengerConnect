package dev.shingi.api.endpoints.models;

import java.lang.reflect.Type;
import java.util.*;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import dev.shingi.Main;
import dev.shingi.utils.HttpClientUtil;

public class ModelEndpoint {

    public static Gson gson = new Gson();

    public static <T> List<T> getHttpRequest(String bearerToken, String uriExtension, Class<T> clazz) {
        String jsonResponse = HttpClientUtil.executeHttpGet(Main.BASE_URI + uriExtension, bearerToken);

        if (jsonResponse != null) {
            return parseJsonResponse(jsonResponse, clazz);
        } else {
            return null;
        }
    }
    
    public static <T> List<T> parseJsonResponse(String jsonResponse, Class<T> clazz) {
        Type listType = TypeToken.getParameterized(List.class, clazz).getType();
        return gson.fromJson(jsonResponse, listType);
    }
}