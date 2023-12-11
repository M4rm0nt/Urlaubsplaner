package de.marmont.urlaubsplaner.model;

public class Urlaubsantrag {
    private int antragsID;
    private int mitarbeiterID;
    private String startdatum;
    private String enddatum;
    private String status;

    public Urlaubsantrag(int antragsID, int mitarbeiterID, String startdatum, String enddatum, String status) {
        this.antragsID = antragsID;
        this.mitarbeiterID = mitarbeiterID;
        this.startdatum = startdatum;
        this.enddatum = enddatum;
        this.status = status;
    }

    public int getAntragsID() {
        return antragsID;
    }

    public void setAntragsID(int antragsID) {
        this.antragsID = antragsID;
    }

    public int getMitarbeiterID() {
        return mitarbeiterID;
    }

    public void setMitarbeiterID(int mitarbeiterID) {
        this.mitarbeiterID = mitarbeiterID;
    }

    public String getStartdatum() {
        return startdatum;
    }

    public void setStartdatum(String startdatum) {
        this.startdatum = startdatum;
    }

    public String getEnddatum() {
        return enddatum;
    }

    public void setEnddatum(String enddatum) {
        this.enddatum = enddatum;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}