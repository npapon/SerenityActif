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


 public void ecrireFichier(String texte) {

     texte = "Numéro Affaire" + this.affaire.getNumeroAffaire()+"%n"
             +"Statut" + this.affaire.isStatutAffaire()+ "%n"
             +"Titre Legal Affaire" +this.affaire.getTitreLegalAffaire()+"%n"
             +"Titre Traduit Affaire" +this.affaire.getTitreTraduitAffaire()+"%n"
             +"Identifiants Externes" + this.affaire.afficherIdentifiantExterneAffaire() +"%n"+
     ;

     try {
         Files.write(fichier, String.format(texte).getBytes());
     } catch (IOException e) {
         e.printStackTrace();
     }
 }
}
