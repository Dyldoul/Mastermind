package com.dylan.oc;

import java.util.Random;
import java.util.Scanner;

public class CodeGame {

    Random r = new Random();//Création de la variable aléatoire
    Scanner scan = new Scanner(System.in);

    private int nombreCaché;
    private int réponse;


    //Getters & Setters

    public int getNombreCaché() {
        return nombreCaché;
    }

    public void setNombreCaché(int nombreCaché) {
        this.nombreCaché = nombreCaché;
    }

    public int getRéponse() {
        return réponse;
    }

    public void setRéponse(int réponse) {
        this.réponse = réponse;
    }


    //Constructeur

    public CodeGame() {
        this.nombreCaché = r.nextInt(999); //Choix du nombre aléatoire de 0 à 999
    }

    //Méthodes

    /**
     * Lance le jeu du code secret
     */
    public void laucnhGame(){

        System.out.println();
        System.out.println("NOMBRE SECRET ACTIVE");
        System.out.println("Serez-vous assez fort pour le trouver ?");

        do {
            System.out.println();
            System.out.println("Veuillez entrer un nombre :");
            setRéponse(scan.nextInt());

            if (getRéponse() > getNombreCaché()) {

                System.out.println();
                System.out.println("Vous êtes au dessus du nombre secret");

            } else if (getRéponse() < getNombreCaché()) {

                System.out.println();
                System.out.println("Vous êtes en dessous du nombre secret");
            }

        } while (getRéponse() != getNombreCaché());

        System.out.println();
        System.out.println("Félicitation vous avez trouvé le nombre secret !");

    }
}

