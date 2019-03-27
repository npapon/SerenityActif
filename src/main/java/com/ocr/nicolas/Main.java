package com.ocr.nicolas;

import java.util.ArrayList;
import java.util.HashMap;

public class Main {

    public static void main(String[] args) {
        // write your code here

        Affaire StarWars = new Affaire(1,"Star Wars a new hope","Star Wars",new HashMap<String, Integer>(),true,new ArrayList<String>(),new ArrayList<Programme>());
        Programme StarWars1 = new Programme (StarWars,1,"StarWars a new Hope","StarWars;");
        StarWars.getIdentifiantsExternesAffaire().put("BDDPE",3);
        StarWars.getIdentifiantsExternesAffaire().put("MVS",3212);;
        StarWars.addCaracteristiqueAffaire("Placement de produit");
        StarWars.addCaracteristiqueAffaire("Geek");
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
   extractionDescriptionAffaire.ecrireFichier();



    }
}
