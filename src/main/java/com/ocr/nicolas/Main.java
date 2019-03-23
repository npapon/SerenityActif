package com.ocr.nicolas;

import java.util.ArrayList;
import java.util.HashMap;

public class Main {

    public static void main(String[] args) {
        // write your code here

        Affaire StarWars = new Affaire(1,"Star Wars a new hope","Star Wars",new HashMap<String, Integer>(),true,new ArrayList<String>());

        StarWars.getIdentifiantsExternesAffaire().put("BDDPE",3);
        StarWars.getIdentifiantsExternesAffaire().put("MVS",3212);
        StarWars.afficherIdentifiantExterneAffaire();
        StarWars.addCaracteristiqueAffaire("Placement de produit");
        StarWars.addCaracteristiqueAffaire("Geek");
        StarWars.afficherIdentifiantExterneAffaire();
    }
}
