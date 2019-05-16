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

public class Serenity2 extends HttpServlet {
    CreationCompte Nicolas2 = new CreationCompte("npapon","Valentine",
            new Affaire(1083040,"Avatar","Avatar",null,
                    true,null,null),"Nicolas","Papon");

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html");
        afficherFormulaire(resp);

    }

    @Override
    public void init() throws ServletException {


    }
    private void afficherFormulaire(HttpServletResponse resp) throws IOException {
        String form ="<form action=\"home2\">"
                +"<label for=\"jeux\">Game : </label><input type=\"text\" name=\"jeux\" id=\"jeux\"/>"
        +"</form>";
        String javascript=

              "<script >" +
             "jeuxChamp =document.getElementById('jeux');"+
             "var req = new XMLHttpRequest();\n" +
                      "req.open('GET', 'http://localhost/javascript-web-srv/data/games.txt');" +

                      "req.addEventListener('load', function () {\n" +
                      "    if (req.status >= 200 && req.status < 400) { // Le serveur a réussi à traiter la requête\n" +
                      "        console.log(req.responseText);\n" +
                      "        jeuxChamp.setAttribute('value',req.responseText);\n"+
                      "\n" +
                      "    } else {// Affichage des informations sur l'échec du traitement de la requête\n" +
                      "        \n" +
                      "        console.error(req.status + ' ' + req.statusText);\n" +
                      "       \n" +
                      "    }\n" +
                      "});\n" +
                      "\n" +
                      "req.addEventListener('error', function () {// La requête n'a pas réussi à atteindre le serveur\n" +
                      "    \n" +
                      "    console.error('Erreur réseau');\n" +
                      "   \n" +
                      "});\n" +
                      "req.send(null);"+

        "</script>";
resp.getWriter().println(form + javascript);

    }




}
