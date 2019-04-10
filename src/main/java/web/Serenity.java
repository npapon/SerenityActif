package web;

import com.ocr.nicolas.Affaire;
import com.ocr.nicolas.CreationCompte;
import com.ocr.nicolas.Programme;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.Connection;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Serenity extends HttpServlet {

    List<Affaire> affaires = new ArrayList<>();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
resp.setContentType("text/html");
        if(req.getQueryString() ==null)
        {afficherFormulaire(resp);}

    else
    {afficherResultatFormulaire(req, resp);
    }
    }



    @Override
    public void init() throws ServletException {


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
    }




    private void afficherFormulaire(HttpServletResponse resp) throws IOException {
        String form =
                "<form action=\"home\">"
                        +"<label for=\"nom\">Nom : </label><input type=\"text\" name=\"nom\" id=\"nom\"/>"
                        +"<br/>"
                        +"<label for=\"prenom\">Prenom : </label><input type=\"text\" name=\"prenom\" id=\"prenom\"/>"
                        +"<br/>"
                        +"<label for=\"login\">Login : </label><input type=\"text\" name=\"login\" id=\"login\"/>"
                        +"<br/>"
                        +"<label for=\"password\">Mot de passe : </label><input type=\"password\" name=\"password\" " +
                        "id=\"password\" placeholder=\"code secret\"/>"
                        +"<br/>"
                        +"<p>Quel est votre affaire préférée</p>";


                         for(int i =0;i<affaires.size();i++)
                             {form+= "<input type=\"radio\" name=\"affaires\" value=\"" +i+"\" id=\"affaire"+i+"\">" +
                                     "<label for=\"affaire"+i+"\">" +
                                     affaires.get(i).getTitreLegalAffaire()
                                     + "</label>";}

        form+= "<br/><br/><input type=\"submit\" name=\"compteCreation\" value=\"Creer\"></form>";

        resp.getWriter().println("<b>PAGE DE CREATION DE COMPTE</b>"
                +"<br/><br/>"
        + "CREER VOTRE COMPTE EN REMPLISSANT LE FORMULAIRE"
                + form
        );

    }

    private void afficherResultatFormulaire(HttpServletRequest req, HttpServletResponse resp) throws IOException {


       Map<String,String>  mapChampsFormulaire = this.mapChampsFormulaire(req.getQueryString());
    CreationCompte creationCompte = new CreationCompte(mapChampsFormulaire.get("login"),
               mapChampsFormulaire.get("password"),affaires.get(Integer.parseInt(mapChampsFormulaire.get("affaires"))),
                mapChampsFormulaire.get("prenom"),mapChampsFormulaire.get("nom"));
    String compteCree ="<p>"
            + "COMPTE CREER AVEC SUCCES"
            +"<br/>"
            +"login : " + creationCompte.getLogin()
            +"<br/>"
            +"mot de passe : " + creationCompte.getMotDePasse()
            +"<br/>"
            +"prenom : " + creationCompte.getPrenom()
            +"<br/>"
            +"nom : " + creationCompte.getNom()
             +"<br/>"
                +"affaire préférée : " + creationCompte.getAffaireFavorite().getTitreLegalAffaire();

        resp.getWriter().println(compteCree);

    }

    //on va stocker grace à une méthode dans une map chaque couple champ/resulat de ça
    // nom=Papon&prenom=Nicolas&login=npapon&password=Patapoun123&affaires=affaire2
// cette méthode prend en paramètre un string (met on l'appliquera avec le req en haut
    public Map<String,String> mapChampsFormulaire( String queryString)
    {      //on stocke dans un table les champ=resultat
        String[] champsResultatsConcat = queryString.split("&");
       //on stockera dans la map les couples champ /resultat
        Map<String,String> champsResultats = new HashMap<>();
// pour chaque élément String du tableau  champsResultatsConcat (un élément champResultatConcat étant
        //par ex nom=Papon
        for(String champResultatConcat : champsResultatsConcat )
        {// on stocke dans un tableau à 2 entrées le champ et le resultat
            String[] champResultatNonConcat = champResultatConcat.split("=");
         if(champResultatNonConcat.length==2)
         //qu'on ajoute directement les éléments dans la hashMap
         { champsResultats.put(champResultatNonConcat[0],champResultatNonConcat[1]);}
        }

        return champsResultats; }

}
