package dev.shingi.API.endpoints.models.modelArrays;

import dev.shingi.API.endpoints.models.OData.Grootboek;

public class Grootboeken extends AbstractModelEndpoint<Grootboek> {

    public Grootboeken(String uriExtension, Class<Grootboek> objectClass) {
        super(uriExtension, objectClass);
        //TODO Auto-generated constructor stub
    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'toString'");
    }

    @Override
    public Grootboek readData(String bearerToken) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'readData'");
    }
    
}
