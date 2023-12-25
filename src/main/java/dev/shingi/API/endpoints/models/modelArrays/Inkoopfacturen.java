package dev.shingi.api.endpoints.models.modelArrays;

import java.util.List;

import dev.shingi.api.endpoints.models.ModelEndpoint;
import dev.shingi.api.endpoints.models.OData.Inkoopfactuur;

public class Inkoopfacturen extends ModelEndpoint<Inkoopfactuur> {

    List<Inkoopfactuur> inkoopfacturen;

    public Inkoopfacturen(String uriExtension, Class<Inkoopfactuur> clazz, String bearerToken) {
        super("inkoopfacturen", Inkoopfactuur.class, bearerToken);

        inkoopfacturen = getModelArray();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();

        sb.append("\nOpenstaande inkoopfacturen:");
        for (Inkoopfactuur inkoopfactuur : inkoopfacturen) {
            if (inkoopfactuur.getOpenstaandSaldo() > 0 || inkoopfactuur.getOpenstaandSaldo() < 0) { 
                sb.append("\n" + inkoopfactuur);
            }
        }
        return sb.toString();
    }

    public List<Inkoopfactuur> getInkoopfacturen() {
        return inkoopfacturen;
    }

    public void setInkoopfacturen(List<Inkoopfactuur> inkoopfacturen) {
        this.inkoopfacturen = inkoopfacturen;
    }
}