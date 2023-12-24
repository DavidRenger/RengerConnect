package dev.shingi.API.endpoints;

import com.google.gson.Gson;

public interface Endpoint<T> {
    String BASE_URI = "https://b2bapi.snelstart.nl/v2/";
    String SUBSCRIPTION_KEY = "328669a875374b17925cbe5e726ef89e";

    Gson gson = new Gson();

    void getHttpRequest();
    void parseJsonResponse();

    T readData(String bearerToken);
    String toString();
}