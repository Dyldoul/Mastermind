package com.dylan.oc;

import java.util.Random;


public class CodeGame {

    Random r = new Random();//Création de la variable aléatoire

    private int nombreCache;//Code secret a trouvé




    //Getters & Setters

    public int getNombreCache() {
        return nombreCache;
    }

    public void setNombreCache(int nombreCache) {
        this.nombreCache = nombreCache;
    }


    //Constructeur

    public CodeGame() {
        this.nombreCache = r.nextInt(9999); //Choix du nombre aléatoire de 00 à 99

    }

    //Méthodes

    /**
     * Compare le nombre saisie avec le nombre caché
     * @param reponseUtilisateur Nombre saisie par l'utilisateur
     */
    public void check(int reponseUtilisateur){

        String strNbrCache = Integer.toString(nombreCache);//Transforme le nombre secret en String
        String strNbrUser = Integer.toString(reponseUtilisateur);//Transforme le nombre saisie en String

        for (int i = 0; i < strNbrCache.length(); i++){//Boucle pour traité tout les caractère de la String

            String chiffreSecret = strNbrCache.substring(i);//Prend 1 par 1 les caractère de la chaine strNbrCache
            String chiffreUser = strNbrUser.substring(i);//Prend 1 par 1 les caractère de la chaine strNbrUser

            int chfrSec = Integer.parseInt(chiffreSecret);//Passe la String chiffreSecret en int
            int chfrUser = Integer.parseInt(chiffreUser);//Passe la String chiffreUser en int

            if ( chfrUser > chfrSec) {//Si réponse trop haute

                System.out.print("-");

            } else if ( chfrUser < chfrSec) {//Si réponse trop bas

                System.out.print("+");

            } else if (chfrUser == chfrSec){//Si réponse OK

                System.out.print("=");

            }

        }

    }
}

