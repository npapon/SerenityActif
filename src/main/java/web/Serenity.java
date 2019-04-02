package web;

import com.ocr.nicolas.Affaire;
import com.ocr.nicolas.Programme;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Serenity extends HttpServlet {

    List<Affaire> affaires = new ArrayList<>();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
resp.setContentType("text/html");
        if(req.getQueryString() ==null)
        {afficherFormulaire(resp);}

    else
    {afficherResultatFormulaire();}
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
    }




    private void afficherFormulaire(HttpServletResponse resp) throws IOException {
        resp.getWriter().println("Formulaire");
    }

    private void afficherResultatFormulaire() {
    }
}
