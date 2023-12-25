package dev.shingi;

import dev.shingi.api.Endpoint;
import dev.shingi.api.endpoints.models.ModelEndpoint;
import dev.shingi.api.endpoints.models.OData.Grootboek;
import dev.shingi.services.*;
import dev.shingi.utils.*;

import java.io.*;

public class Main {

    public static final String SUBSCRIPTION_KEY = "328669a875374b17925cbe5e726ef89e";
    public static final String BASE_URI = "https://b2bapi.snelstart.nl/v2/";
    // public static HashMap<Class<T>, String> ENDPOINT_MAP;
    
    public static void main(String[] args) throws IOException {

        Endpoint grootboeken = new ModelEndpoint<Grootboek>("grootboeken", Grootboek.class);


    }
}