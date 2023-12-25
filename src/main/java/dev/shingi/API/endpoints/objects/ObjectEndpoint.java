package dev.shingi.api.endpoints.objects;

import dev.shingi.api.Endpoint;
import dev.shingi.utils.HttpClientUtil;

public abstract class ObjectEndpoint<T> extends Endpoint {
    protected String uri;
    protected Class<T> clazz;

    private T object;

    public ObjectEndpoint(String uriExtension, Class<T> clazz) {
        super(uriExtension);
        this.clazz = clazz;
    }

    public void getHttpRequest(String bearerToken) {
        String jsonResponse = HttpClientUtil.executeHttpGet(uri, bearerToken);

        if (jsonResponse != null) {
            parseJsonResponse(jsonResponse);
        }
    }
    
    public void parseJsonResponse(String jsonResponse) {
        this.object = gson.fromJson(jsonResponse, this.clazz);
    }

    public T getObject() {
        return object;
    }

    public void setObject(T object) {
        this.object = object;
    }
}