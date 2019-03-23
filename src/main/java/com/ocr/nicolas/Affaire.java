package com.ocr.nicolas;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Affaire {

    private int numeroAffaire;
    private String titreLegalAffaire;
    private String titreTraduitAffaire;
    private Map<String,Integer> identifiantsExternesAffaire ;
    private boolean statutAffaire;
    private List<String> caracteriquesAffaire;


    public Affaire(int numeroAffaire, String titreLegalAffaire, String titreTraduitAffaire, HashMap<String,Integer> identifiantsExternesAffaire, boolean statutAffaire, ArrayList<String> caracteriquesAffaire)
    {this.numeroAffaire = numeroAffaire;
    this.titreLegalAffaire=titreLegalAffaire;
    this.titreTraduitAffaire=titreTraduitAffaire;
    this.identifiantsExternesAffaire=identifiantsExternesAffaire;
    this.statutAffaire=statutAffaire;
    this.caracteriquesAffaire=caracteriquesAffaire;}

    public int getNumeroAffaire() {
        return numeroAffaire;
    }

    public String getTitreLegalAffaire() {
        return titreLegalAffaire;
    }

    public String getTitreTraduitAffaire() {
        return titreTraduitAffaire;
    }

    public void setNumeroAffaire(int numeroAffaire) {
        this.numeroAffaire = numeroAffaire;
    }

    public void setTitreLegalAffaire(String titreLegalAffaire) {
        this.titreLegalAffaire = titreLegalAffaire;
    }

    public void setTitreTraduitAffaire(String titreTraduitAffaire) {
        this.titreTraduitAffaire = titreTraduitAffaire;
    }

    public boolean isStatutAffaire() {
        return statutAffaire;
    }

    public void setStatutAffaire(boolean statutAffaire) {
        this.statutAffaire = statutAffaire;
    }

    public Map<String,Integer> getIdentifiantsExternesAffaire()
    {return identifiantsExternesAffaire;}

    public void addIdentifiantExterneAffaire(String typeIdentifiantExterne,int numeroIdentifiantExterne){
        this.identifiantsExternesAffaire.put(typeIdentifiantExterne,numeroIdentifiantExterne);
    }




    public void afficherIdentifiantExterneAffaire(){
                for(Map.Entry<String,Integer> entry : this.identifiantsExternesAffaire.entrySet()) {
        System.out.println(entry.getKey() + " : " +entry.getValue());
    }
    }

    public List<String> getCaracteriquesAffaire() {
        return caracteriquesAffaire;
    }

    public void addCaracteristiqueAffaire(String caracteristique)
    {this.caracteriquesAffaire.add(caracteristique);}

    public void afficherCaracteristiquesAffaire()
    {
        for(int i=0;i<this.caracteriquesAffaire.size();i++) {

            String listElement = this.caracteriquesAffaire.get(i);
            int listIndex = this.caracteriquesAffaire.indexOf(this.caracteriquesAffaire.get(i));
            System.out.println(listIndex + " - " + listElement);
        }

}
}
