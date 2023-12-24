package dev.shingi.API.endpoints.lines;

import dev.shingi.API.endpoints.models.*;
import dev.shingi.API.endpoints.models.OData.Grootboek;
import dev.shingi.API.endpoints.models.submodels.Kostenplaats;
public class GrootboekBoekingsRegel {
    private String omschrijving;
    private Grootboek grootboek;
    private Kostenplaats kostenplaats;
    private double debet;
    private double credit;
    private String btwSoort;

    public String getOmschrijving() {
        return omschrijving;
    }
    public void setOmschrijving(String omschrijving) {
        this.omschrijving = omschrijving;
    }
    public Grootboek getGrootboek() {
        return grootboek;
    }
    public void setGrootboek(Grootboek grootboek) {
        this.grootboek = grootboek;
    }
    public Kostenplaats getKostenplaats() {
        return kostenplaats;
    }
    public void setKostenplaats(Kostenplaats kostenplaats) {
        this.kostenplaats = kostenplaats;
    }
    public double getDebet() {
        return debet;
    }
    public void setDebet(double debet) {
        this.debet = debet;
    }
    public double getCredit() {
        return credit;
    }
    public void setCredit(double credit) {
        this.credit = credit;
    }
    public String getBtwSoort() {
        return btwSoort;
    }
    public void setBtwSoort(String btwSoort) {
        this.btwSoort = btwSoort;
    }
}