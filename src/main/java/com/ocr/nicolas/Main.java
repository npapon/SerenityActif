package com.ocr.nicolas;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {

    public static void main(String[] args) {

        List<Affaire> affaires = new ArrayList<>();
        Affaire StarWars = new Affaire(3,"StarWars","StarWars un nouvel Espoir",
                new HashMap<String, Integer>(),true,new ArrayList<String>(),new ArrayList<Programme>());


        StarWars.addCaracteristiqueAffaire("Placement de produit");
        StarWars.addCaracteristiqueAffaire("Destiné au mineur");
        StarWars.addIdentifiantExterneAffaire("BDDPE",100);
        Programme StarWarsProgramme = new Programme(StarWars,1,"StarWars","StarWars un nouvel Espoir");
        StarWars.addProgrammesAffaire(StarWarsProgramme);

        Affaire Braquo = new Affaire(4,"Braquo",null,new HashMap<String, Integer>(),
                true,new ArrayList<>(),new ArrayList<>());
        Programme BraquoProgramme1 = new Programme(Braquo,1,"Max",null);
        Programme BraquoProgramme2 = new Programme(Braquo,2,"Emy",null);
        Braquo.addProgrammesAffaire(BraquoProgramme1);
        Braquo.addProgrammesAffaire(BraquoProgramme2);
        Affaire residentEvil = new Affaire(4,"Resident Evil","",
                new HashMap<String, Integer>(),true,new ArrayList<String>(),new ArrayList<Programme>());
        Programme residentEvilProgramme = new Programme(StarWars,1,"StarWars","StarWars un nouvel Espoir");
        residentEvil.addProgrammesAffaire(residentEvilProgramme);

        affaires.add(StarWars);
        affaires.add(Braquo);
        affaires.add(residentEvil);

        System.out.println(affaires.get(1).getTitreLegalAffaire());
        String nicolas = "lol";
        nicolas.length();


    }
}
