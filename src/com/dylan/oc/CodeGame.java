package com.dylan.oc;

import java.util.Random;


public class CodeGame {

    Random r = new Random();//Création de la variable aléatoire

    private int nombreCaché;//Code secret a trouvé
    private int reponseUtilisateur;



    //Getters & Setters

    public int getNombreCaché() {
        return nombreCaché;
    }

    public void setNombreCaché(int nombreCaché) {
        this.nombreCaché = nombreCaché;
    }

    public int getReponseUtilisateur() {
        return reponseUtilisateur;
    }

    public void setReponseUtilisateur(int reponseUtilisateur) {
        this.reponseUtilisateur = reponseUtilisateur;
    }

    //Constructeur

    public CodeGame() {
        this.nombreCaché = r.nextInt(9999); //Choix du nombre aléatoire de 0 à 9999

    }

    //Méthodes

    /**
     * Lance le jeu du code secret
     */
    public void check(int reponseUtilisateur){

        if ( reponseUtilisateur > getNombreCaché()) {//Si réponse trop haute

                System.out.println();
                System.out.println("Vous êtes au dessus du nombre secret");

        } else if ( reponseUtilisateur < getNombreCaché()) {//Si réponse trop bas

                System.out.println();
                System.out.println("Vous êtes en dessous du nombre secret");
        }
    }
}

