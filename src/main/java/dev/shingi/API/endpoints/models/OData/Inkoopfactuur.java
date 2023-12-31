package dev.shingi.api.endpoints.models.OData;

import dev.shingi.api.endpoints.models.submodels.BaseModel;

public class Inkoopfactuur extends BaseModel {
    Relatie relatie;
    Inkoopboeking inkoopboeking;

    String modifiedOn;
    Double openstaandSaldo;
    String factuurnummer;
    String vervalDatum;
    String factuurDatum;
    Double factuurBedrag;

    @Override
    public String toString() {
        return  "Bedrag: EUR " + factuurBedrag + ": openstaand saldo: EUR " + openstaandSaldo + " factuurdatum: " + factuurDatum.substring(0, 10) + " factuurnummer: " + factuurnummer;

        // Everything
        // return "Inkoopfacturen [relatieIdentifierModel=" + relatieIdentifierModel + ", inkoopboekingIdentifierModel="
        //         + inkoopboekingIdentifierModel + ", modifiedOn=" + modifiedOn + ", openstaandSaldo=" + openstaandSaldo
        //         + ", factuurnummer=" + factuurnummer + ", vervalDatum=" + vervalDatum + ", factuurDatum=" + factuurDatum
        //         + ", factuurBedrag=" + factuurBedrag + ", id=" + id + ", uri=" + uri + "]";
    }

    public String getModifiedOn() {
        return modifiedOn;
    }

    public void setModifiedOn(String modifiedOn) {
        this.modifiedOn = modifiedOn;
    }

    public Double getOpenstaandSaldo() {
        return openstaandSaldo;
    }

    public void setOpenstaandSaldo(Double openstaandSaldo) {
        this.openstaandSaldo = openstaandSaldo;
    }

    public String getFactuurnummer() {
        return factuurnummer;
    }

    public void setFactuurnummer(String factuurnummer) {
        this.factuurnummer = factuurnummer;
    }

    public String getVervalDatum() {
        return vervalDatum;
    }

    public void setVervalDatum(String vervalDatum) {
        this.vervalDatum = vervalDatum;
    }

    public String getFactuurDatum() {
        return factuurDatum;
    }

    public void setFactuurDatum(String factuurDatum) {
        this.factuurDatum = factuurDatum;
    }

    public Double getFactuurBedrag() {
        return factuurBedrag;
    }

    public void setFactuurBedrag(Double factuurBedrag) {
        this.factuurBedrag = factuurBedrag;
    }
}