package dev.shingi.API.endpoints.models.modelArrays;

import java.lang.reflect.Type;
import java.util.*;

import com.google.gson.reflect.TypeToken;

import dev.shingi.API.endpoints.Endpoint;
import dev.shingi.utils.HttpClientUtil;

public abstract class AbstractModelEndpoint<T> implements Endpoint<T> {
    protected String uri;
    protected Class<T> clazz;
    protected List<T> objects;

    public AbstractModelEndpoint(String uriExtension, Class<T> clazz) {
        this.uri = BASE_URI + uriExtension; // BASE_URI is defined in the Endpoint interface
        this.clazz = clazz;
    }

    public void getHttpRequest(String bearerToken) {
        String jsonResponse = HttpClientUtil.executeHttpGet(uri, bearerToken);

        if (jsonResponse != null) {
            parseJsonResponse(jsonResponse);
        }
    }
    
    public void parseJsonResponse(String jsonResponse) {
        Type listType = TypeToken.getParameterized(List.class, this.clazz).getType();
        this.objects = gson.fromJson(jsonResponse, listType);
    }

    public abstract String toString();

}