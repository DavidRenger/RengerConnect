package dev.shingi.API.endpoints.objects;

import dev.shingi.API.endpoints.Endpoint;
import dev.shingi.utils.HttpClientUtil;

public abstract class AbstractObjectEndpoint<T> implements Endpoint<T> {
    protected String uri;
    protected Class<T> clazz;
    protected Object object;

    public AbstractObjectEndpoint(String uriExtension, Class<T> clazz) {
        this.uri = BASE_URI + uriExtension; // BASE_URI is defined in the Endpoint interface
        this.clazz = clazz;
    }

    @Override
    public void getHttpRequest(String bearerToken) {
        String jsonResponse = HttpClientUtil.executeHttpGet(uri, bearerToken);

        if (jsonResponse != null) {
            parseJsonResponse(jsonResponse);
        }
    }
    
    @Override
    public void parseJsonResponse(String jsonResponse) {
        this.object = gson.fromJson(jsonResponse, this.clazz);
    }

    public abstract String toString();
}