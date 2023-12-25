package dev.shingi.utils;

import java.util.Collections;
import java.util.List;

import dev.shingi.api.endpoints.lines.KolommenBalansRegel;
import dev.shingi.api.endpoints.models.OData.Grootboek;
import dev.shingi.api.endpoints.models.OData.GrootboekMutatie;
import dev.shingi.api.endpoints.models.OData.Inkoopfactuur;
import dev.shingi.api.endpoints.models.OData.Relatie;
import dev.shingi.api.endpoints.objects.CompanyInfo;

public class SnelstartReader {

    public static void readKolommenBalans(String bearerToken, String startDate, String endDate) {
        // Fetch logic
        List<KolommenBalansRegel> kolommenBalansList = SnelstartUtils.getModelHttpRequest(bearerToken, KolommenBalansRegel.class, "https://b2bapi.snelstart.nl/v2/rapportages/kolommenbalans?start=" + startDate + "&end=" + endDate);

        // Sort list
        Collections.sort(kolommenBalansList);

        // Printing logic
        System.out.println("\nKolommenbalans:");
        for (KolommenBalansRegel regel : kolommenBalansList) {
            System.out.println(regel + "\n");
        }
        System.out.println("Debet Winst&Verlies, Credit Winst&Verlies, Debet Balans, Credit Balans\n");
    }

    public static CompanyInfo readCompanyInfo(String bearerToken) {
        return (CompanyInfo) SnelstartUtils.getObjectHttpRequest(bearerToken, CompanyInfo.class, "https://b2bapi.snelstart.nl/v2/companyInfo");
    }

    public static List<Relatie> readRelatieInfo(String bearerToken) {
        // Fetch logic
        List<Relatie> relaties = SnelstartUtils.getModelHttpRequest(bearerToken, Relatie.class, "https://b2bapi.snelstart.nl/v2/relaties");

        // Printing logic
        try {
            for (Relatie relatie : relaties) {
                if (relatie.getRelatiesoort().get(0).equals("Klant")) {
                    System.out.println("\nNaam klant: " + relatie.getNaam());
                    if (relatie.getMemo() != null) {
                        if (!relatie.getMemo().isEmpty()) {
                            System.out.println("Memo\n" + relatie.getMemo() + "\n");
                        } else {
                            System.out.println("Heeft geen memo.\n");
                        }
                    } else {
                        System.out.println("Heeft geen memo.\n");
                    }
                }
            }
            return relaties;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public static List<GrootboekMutatie> readGrootboekMutaties(String bearerToken) {
        return null;
    }
}
