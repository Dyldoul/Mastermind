package com.dylan.oc;

import jdk.swing.interop.SwingInterOpUtils;

import java.util.Random;


public class CodeGame {

    Random r = new Random();//Création de la variable aléatoire

    private int nombreCache;//Code secret a trouvé
    private int nombreDeChiffre = 4;//Nombre de chiffre composant le nombre secret


    //Getters & Setters

    public int getNombreCache() {
        return nombreCache;
    }

    public void setNombreCache(int nombreCache) {
        this.nombreCache = nombreCache;
    }

    public int getNombreDeChiffre() {
        return nombreDeChiffre;
    }

    public void setNombreDeChiffre(int nombreDeChiffre) {
        this.nombreDeChiffre = nombreDeChiffre;
    }

    //Constructeur

    public CodeGame() {


        for (int i = 0; i < nombreDeChiffre; i++){//On ne dépasse pas la param utilisateur

            int c = r.nextInt(9);//Donne un chiffre entre 0 et 9
            nombreCache += c;//Rassemble les chiffre aléatoire pour formé un nombre

        }

    }

    //Méthodes

    /**
     * Compare le nombre saisie avec le nombre caché
     * @param reponseUtilisateur Nombre saisie par l'utilisateur
     */
    public void check(int reponseUtilisateur){

        String strNbrCache = Integer.toString(nombreCache);//Transforme le nombre secret en String
        String strNbrUser = Integer.toString(reponseUtilisateur);//Transforme le nombre saisie en String
        String strIndication = "";//Initialisation de la ligne d'indication

        for (int i = 0; i < strNbrCache.length(); i++){//Boucle pour traité tout les caractère de la String

            String chiffreSecret = strNbrCache.substring(i);//Prend 1 par 1 les caractère de la chaine strNbrCache
            String chiffreUser = strNbrUser.substring(i);//Prend 1 par 1 les caractère de la chaine strNbrUser

            int chfrSec = Integer.parseInt(chiffreSecret);//Passe la String chiffreSecret en int
            int chfrUser = Integer.parseInt(chiffreUser);//Passe la String chiffreUser en int

            if ( chfrUser > chfrSec) {//Si réponse trop haute

                strIndication += "-";//Ajouter un -

            } else if ( chfrUser < chfrSec) {//Si réponse trop bas

                strIndication += "+";//Ajouter un +

            } else if (chfrUser == chfrSec){//Si réponse OK

                strIndication += "=";//Ajouter un =

            }

        }

        System.out.println(strIndication);//Affiche la ligne composé de + - =

    }

    /**
     * Choix du nombre de chiffre à trouver définit par l'utilisateur
     * @param paramUtilisateur Nombre donnée par l'utilisateur
     */
    public void paramNbrChiffre(int paramUtilisateur){

        this.nombreDeChiffre = paramUtilisateur;

    }
}

