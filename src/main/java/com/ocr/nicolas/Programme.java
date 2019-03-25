package com.ocr.nicolas;

public class Programme {
    private Affaire affaire;
    private int numeroProgramme;
    private String titreLegalProgramme;
    private String titreTraduitProgramme;


    public Programme(Affaire affaire, int numeroProgramme, String titreLegalProgramme, String titreTraduitProgramme) {
        this.affaire = affaire;
        this.numeroProgramme = numeroProgramme;
        this.titreLegalProgramme = titreLegalProgramme;
        this.titreTraduitProgramme = titreTraduitProgramme;


    }

    public Affaire getAffaire() {
        return affaire;
    }

    public int getNumeroProgramme() {
        return numeroProgramme;
    }


    public String getTitreLegalProgramme() {
        return titreLegalProgramme;
    }

    public void setTitreLegalProgramme(String titreLegalProgramme) {
        this.titreLegalProgramme = titreLegalProgramme;
    }

    public String getTitreTraduitProgramme() {
        return titreTraduitProgramme;
    }

    public void setTitreTraduitProgramme(String titreTraduitProgramme) {
        this.titreTraduitProgramme = titreTraduitProgramme;
    }

}