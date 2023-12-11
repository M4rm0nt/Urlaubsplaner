package de.marmont.urlaubsplaner.model;

public class Mitarbeiter {
    private int mitarbeiterID;
    private String name;
    private String abteilung;
    private String position;

    public Mitarbeiter(int mitarbeiterID, String name, String abteilung, String position) {
        this.mitarbeiterID = mitarbeiterID;
        this.name = name;
        this.abteilung = abteilung;
        this.position = position;
    }

    public int getMitarbeiterID() {
        return mitarbeiterID;
    }

    public void setMitarbeiterID(int mitarbeiterID) {
        this.mitarbeiterID = mitarbeiterID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAbteilung() {
        return abteilung;
    }

    public void setAbteilung(String abteilung) {
        this.abteilung = abteilung;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }
}