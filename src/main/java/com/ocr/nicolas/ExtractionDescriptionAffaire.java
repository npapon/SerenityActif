package com.ocr.nicolas;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class ExtractionDescriptionAffaire {

    private Affaire affaire;
   private Path fichier;

public ExtractionDescriptionAffaire(Affaire affaire)
{this.affaire=affaire;}



    public void definirCheminFichier(String chemin){
       this.fichier = Paths.get(chemin);
   };


 public void ecrireFichier() {

    String texte = "Numero Affaire : " + this.affaire.getNumeroAffaire()+"%n"
             +"Statut : " + this.affaire.isStatutAffaire()+ "%n"
             +"Titre Legal Affaire : " +this.affaire.getTitreLegalAffaire()+"%n"
             +"Titre Traduit Affaire : " +this.affaire.getTitreTraduitAffaire()+"%n"
             +"Identifiants Externes : " +"%n"+ this.affaire.retournerIdentifiantExterneAffaire()
             +"Caracteristiques Affaire : "  +"%n"+ this.affaire.retournerCaracteristiquesAffaire()+"%n"
             +"Programmes : "+"%n"+ this.affaire.retournerListProgrammesAffaire();

     ;

     System.out.println(String.format(texte));
     try {
         Files.write(fichier, String.format(texte).getBytes());
     } catch (IOException e) {
         e.printStackTrace();
     }
 }
}
