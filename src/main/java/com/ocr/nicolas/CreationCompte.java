package com.ocr.nicolas;

import java.util.List;

public class CreationCompte {

    private String login;
    private String motDePasse;
    private String nom;
    private String prenom;
    private Affaire affaireFavorite;


    public CreationCompte(String login,String motDePasse,Affaire affaireFavorite,String prenom,String nom)
    {this.login =login;
    this.motDePasse=motDePasse;
    this.prenom=prenom;
    this.nom = nom;
    this.affaireFavorite=affaireFavorite;}


    public String getLogin() {
        return login;
    }

    public String getMotDePasse() {
        return motDePasse;
    }

    public String getNom() {
        return nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public Affaire getAffaireFavorite() {
        return affaireFavorite;
    }



}
