package com.dylan.oc;

import java.util.Random;


public class CodeGame {

    Random r = new Random();//Création de la variable aléatoire

    private int nombreCache;//Code secret a trouvé
    private int nombreDeChiffre = 4;//Nombre de chiffre composant le nombre secret par défault
    private int nombreEssai = 10;//Nombre d'éssais par défault
    private int valeurMin = 0;//Valeur min lors des essais de l'ordi
    private int valeurMax = 10;//Valeur max lors des essais de l'ordi
    private int nombreTest;//Nombre testé par l'ordi


    //Getters & Setters

    public int getNombreCache() {
        return nombreCache;
    }

    public int getNombreDeChiffre() {
        return nombreDeChiffre;
    }

    public int getNombreEssai() {
        return nombreEssai;
    }

    public int getNombreTest() {
        return nombreTest;
    }

    //Constructeurs

    public CodeGame() {

    }

    //Méthodes

    /**
     * L'ordinateur créer un nombre aléatoire
     */
    public void modChallenger(){

            String strNombreCache = "";//String pour rassembler tout les chiffre aléatoire

            for (int i = 0; i < nombreDeChiffre; i++){//On ne dépasse pas la param utilisateur

                int c = r.nextInt(9);

                strNombreCache += c;//Ajoute 1 par 1 les chiffre aléatoire a la String

            }

            nombreCache = Integer.parseInt(strNombreCache);//Convertit la String en Integer

    }

    /**
     * L'utilisateur choisis le code secret
     * @param codeUtil Nombre choisit
     */
    public void modDefenseur(int codeUtil){

        this.nombreCache = codeUtil;

    }



    /**
     * Compare le nombre saisie avec le nombre caché
     * @param reponseUtilisateur Nombre saisie par l'utilisateur
     */
    public void checkOrdi(int reponseUtilisateur){

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
        nombreEssai --;

    }

    /**
     * L'utilisateur indique a l'ordinateur les + - =
     * @param reponseOrdi Le nombre donné par l'ordinateur
     */
    public void checkUser(int reponseOrdi){



    }

    /**
     * Donne un nombre aléatoire entre 2 bornes et de longueur définie
     */
    public void essaiOrdi(){

        String strNombreTest = "";//Voir modChallenger

        for (int i = 0; i < nombreDeChiffre; i++){//Boucle pour rester dans le paramètre voulu

            int c = valeurMin + r.nextInt(valeurMax - valeurMin);

            strNombreTest += c;

        }

        nombreTest = Integer.parseInt(strNombreTest);
        System.out.println(nombreTest);

    }

    /**
     * Paramètre le nombre de chiffre a trouver
     * @param nombreUtilisateur Le nombre definit par l'utilisateur
     */
    public void paramNbrChiffre(int nombreUtilisateur) {

        this.nombreDeChiffre = nombreUtilisateur;


    }

    /**
     * Paramètre le nombre d'essais
     * @param essaiUtilisateur Nombre d'essais voulu
     */
    public void paramNbrEssais(int essaiUtilisateur){

        this.nombreEssai = essaiUtilisateur;

    }

}

