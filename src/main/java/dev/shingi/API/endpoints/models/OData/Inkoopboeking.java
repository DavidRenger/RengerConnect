package dev.shingi.api.endpoints.models.OData;

import java.util.List;
import java.util.UUID;

public class Inkoopboeking {
    private String modifiedOn;
    private String boekstuk;
    private boolean gewijzigdDoorAccountant;
    private boolean markering;
    private String factuurdatum;
    private String factuurnummer;
    private Leverancier leverancier;
    private String omschrijving;
    private double factuurbedrag;
    private List<Boekingsregel> boekingsregels;
    private List<Btw> btw;
    private List<Document> documents;
    private UUID id;
    private String uri;

    // Getters and setters...
}
