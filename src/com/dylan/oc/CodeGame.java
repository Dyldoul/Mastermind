package com.dylan.oc;

import java.util.Random;

public class CodeGame {

    Random r = new Random();//Création de la variable aléatoire

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
        this.nombreCaché = r.nextInt(9999);
    }

    //Méthodes


}

