package com.dylan.oc;

import java.util.Random;


public class CodeGame {

    Random r = new Random();//Création de la variable aléatoire

    private int nombreCache;//Code secret a trouvé
    private int nombreDeChiffre = 4;//Nombre de chiffre composant le nombre secret par défault


    //Getters & Setters

    public int getNombreCache() {
        return nombreCache;
    }

    public int getNombreDeChiffre() {
        return nombreDeChiffre;
    }



    //Constructeur

    public CodeGame() {

        String strNombreCache = "";//String pour rassembler tout les chiffre aléatoire

        for (int i = 0; i < nombreDeChiffre; i++){//On ne dépasse pas la param utilisateur

            int c = r.nextInt(9);

            strNombreCache += c;//Ajoute 1 par 1 les chiffre aléatoire a la String

        }

        nombreCache = Integer.parseInt(strNombreCache);//Convertit la String en Integer

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

            } else {//Si réponse OK

                strIndication += "=";//Ajouter un =

            }

        }

        System.out.println(strIndication);//Affiche la ligne composé de + - =

    }

    public void paramUtilisateur(int nombreUtilisateur) {

        this.nombreDeChiffre = nombreUtilisateur;
        String strNombreCache = "";//String pour rassembler tout les chiffre aléatoire

        for (int i = 0; i < nombreDeChiffre; i++){//On ne dépasse pas la param utilisateur

            int c = r.nextInt(9);

            strNombreCache += c;//Ajoute 1 par 1 les chiffre aléatoire a la String

        }

        nombreCache = Integer.parseInt(strNombreCache);//Convertit la String en Integer

    }

}

