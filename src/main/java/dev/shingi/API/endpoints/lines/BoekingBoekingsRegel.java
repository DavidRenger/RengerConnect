package dev.shingi.api.endpoints.lines;

import dev.shingi.api.endpoints.models.submodels.BaseModel;

public class BoekingBoekingsRegel {
    private BaseModel boekingId;
    private String omschrijving;
    private double debet;
    private double credit;

    public BaseModel getBoekingId() {
        return boekingId;
    }
    public void setBoekingId(BaseModel boekingId) {
        this.boekingId = boekingId;
    }
    public String getOmschrijving() {
        return omschrijving;
    }
    public void setOmschrijving(String omschrijving) {
        this.omschrijving = omschrijving;
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
}
