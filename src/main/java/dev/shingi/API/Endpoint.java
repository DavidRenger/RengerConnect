package dev.shingi.api;

import com.google.gson.Gson;

import dev.shingi.Main;

public abstract class Endpoint {
    protected String uri;


    public abstract void getHttpRequest(String bearerToken);
    public abstract void parseJsonResponse(String jsonResponse);

    public Endpoint(String uriExtension) {
        this.uri = Main.BASE_URI + uriExtension;
    }
}
