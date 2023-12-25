
package dev.shingi.api.endpoints.models.submodels;

public class Adres {
    private String contactpersoon;
    private String straat;
    private String postcode;
    private String plaats;
    private BaseModel land;

    public String getContactpersoon() {
        return contactpersoon;
    }
    public void setContactpersoon(String contactpersoon) {
        this.contactpersoon = contactpersoon;
    }
    public String getStraat() {
        return straat;
    }
    public void setStraat(String straat) {
        this.straat = straat;
    }
    public String getPostcode() {
        return postcode;
    }
    public void setPostcode(String postcode) {
        this.postcode = postcode;
    }
    public String getPlaats() {
        return plaats;
    }
    public void setPlaats(String plaats) {
        this.plaats = plaats;
    }
    public BaseModel getLand() {
        return land;
    }
    public void setLand(BaseModel land) {
        this.land = land;
    }
}

