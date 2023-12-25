package dev.shingi.utils;

import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;

import dev.shingi.api.Endpoint;

public class HttpClientUtil {
    
    public static String executeHttpGet(String uri, String bearerToken) {
        try (CloseableHttpClient httpClient = HttpClients.createDefault()) {
            HttpGet httpGet = new HttpGet(uri);
            httpGet.setHeader("Authorization", "Bearer " + bearerToken);
            httpGet.setHeader("Ocp-Apim-Subscription-Key", Endpoint.SUBSCRIPTION_KEY);

            org.apache.http.HttpResponse response = httpClient.execute(httpGet);

            // Check for the HTTP status code and handle it appropriately
            int statusCode = response.getStatusLine().getStatusCode();
            if (statusCode == 200) {
                // Parse the JSON response
                return EntityUtils.toString(response.getEntity());
            } else {
                // Handle other status codes appropriately
                System.out.println("Error: Received status code " + statusCode);
                return null;
            }
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}
