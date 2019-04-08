package com.ocr.nicolas;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {

    public static void main(String[] args) {
        // write your code here

        Map<String,String> compte = new HashMap<>();
        compte.put("login","npapon");
        System.out.println(compte.get("login"));

        List<String> famille = new ArrayList<String>();
        famille.add("Valentine");
        famille.add("Leslie");



        /*
       Affaire TerminatorDeux = new Affaire(1,"Terminator Judgment day","Terminotor 2",new HashMap<String, Integer>(),true,new ArrayList<String>(),new ArrayList<Programme>());
       Programme TermintorDeux1 = new Programme(TerminatorDeux,1,"Terminator Judgment day","Terminotor 2");
       Programme TerminatorDeux2=  new Programme(TerminatorDeux,2,"Terminator doublon", null);

        TerminatorDeux.getIdentifiantsExternesAffaire().put("BDDPE",3);
        TerminatorDeux.getIdentifiantsExternesAffaire().put("MVS",3212);
        TerminatorDeux.addCaracteristiqueAffaire("Placement de produit");
       TerminatorDeux.addCaracteristiqueAffaire("Geek");
       TerminatorDeux.addProgrammesAffaire(TermintorDeux1);
  TerminatorDeux.addProgrammesAffaire(TerminatorDeux2);
   ExtractionDescriptionAffaire extractionDescriptionAffaire = new ExtractionDescriptionAffaire(TerminatorDeux);
   extractionDescriptionAffaire.definirCheminFichier("fichier.csv");
   extractionDescriptionAffaire.ecrireFichier();*/



    }
}
