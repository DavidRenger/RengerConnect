package dev.shingi.api.endpoints.models.modelArrays;

import java.util.Collections;
import java.util.List;

import dev.shingi.api.endpoints.models.ModelEndpoint;
import dev.shingi.api.endpoints.models.OData.Grootboek;
import dev.shingi.utils.UriUtils;

public class Grootboeken {

    private static Class<Grootboek> clazz = Grootboek.class;
    private static String endpoint = "grootboeken";

    public static List<Grootboek> readObjects(String bearerToken, UriUtils uriUtils) {
        // Get objects
        List<Grootboek> grootboeken = ModelEndpoint.getHttpRequest(bearerToken, uriUtils.getUriExtension(endpoint), clazz);

        // Apply sorting
        Collections.sort(grootboeken);

        // Return list
        return grootboeken;
    }

    // @Override
    // public String toString() {
    //     StringBuilder sb = new StringBuilder();

    //     // Top line
    //     sb.append("Grootboeken:\n");

    //     // Body
    //     for (Grootboek grootboek : this.grootboeken) {
    //         sb.append(grootboek);
    //         sb.append("\n");
    //     }

    //     return sb.toString();
    // }
}