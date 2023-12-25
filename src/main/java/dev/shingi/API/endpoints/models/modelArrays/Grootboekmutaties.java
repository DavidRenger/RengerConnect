package dev.shingi.api.endpoints.models.modelArrays;

import dev.shingi.api.endpoints.models.ModelEndpoint;
import dev.shingi.api.endpoints.models.OData.GrootboekMutatie;

public class Grootboekmutaties extends ModelEndpoint<GrootboekMutatie> {

    public Grootboekmutaties(String uriExtension, Class<GrootboekMutatie> objectClass, String bearerToken) {
        super("grootboekmutaties", GrootboekMutatie.class, bearerToken);
        //TODO Auto-generated constructor stub
    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'toString'");
    }
    
}
