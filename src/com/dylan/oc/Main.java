package com.dylan.oc;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int choixMenu; //Variable de navigation dans le menu
        int reponse;//Réponse de l'utilisateur
        char exit; // Variable pour quitter un jeu ou non a la fin

        do { // Menu de Départ
            System.out.println("Bienvenue !");
            System.out.println("1 - Code secret");
            System.out.println("2 - Quitter");
            System.out.println("---------------------------------------------------");
            choixMenu = scan.nextInt();

            switch (choixMenu) {

                case 1:

                    CodeGame jeu = new CodeGame();

                    do {//Menu du jeu

                        System.out.println();
                        System.out.println("Que voulez-vous faire ?");
                        System.out.println("1 - Jouer");
                        System.out.println("2 - Paramétrer");
                        System.out.println("3- Retour");
                        System.out.println("---------------------------------------------------");
                        choixMenu = scan.nextInt();

                        switch (choixMenu) {

                            case 1:// Lancement du jeu 1

                                do {
                                    System.out.println("NOMBRE SECRET ACTIVE");
                                    System.out.println("Serez-vous assez fort pour le trouver ?");

                                    do {//Boucle tans que l'on a pas trouvé le nombre secret

                                        System.out.println();
                                        System.out.println("Veuillez entrer un nombre a "+jeu.getNombreDeChiffre()+" chiffres");
                                        System.out.println("--------------------------------------------------");
                                        reponse = scan.nextInt();
                                        jeu.check(reponse);
                                        System.out.println();


                                    } while (reponse != jeu.getNombreCache());//Condition de sortie du jeu

                                    System.out.println();
                                    System.out.println("Félicitation vous avez trouvé le nombre secret !");
                                    System.out.println();
                                    System.out.println("Voulez-vous recommencer ? O/N");
                                    scan.nextLine();
                                    String str = scan.nextLine();
                                    exit = str.charAt(0);

                                } while (exit != 'N' && exit == 'O'); //Recommencer ou non le jeu

                                System.out.println();

                                break;

                            case 2: //Paramétrer le jeu

                                System.out.println("Le nombre de chiffre a trouver est de " + jeu.getNombreDeChiffre());
                                System.out.println("Voulez voulez vous le modifier ?");
                                System.out.println("1 - Oui");
                                System.out.println("2 - Non");
                                System.out.println("--------------------------------------------------");
                                choixMenu = scan.nextInt();

                                if (choixMenu == 1) {

                                    int paramUtil;
                                    System.out.println();
                                    System.out.println("Combien de chiffre voulez chercher ?");
                                    paramUtil = scan.nextInt();
                                    jeu.setNombreDeChiffre(paramUtil);
                                    System.out.println("Vous aller devoir trouver " + jeu.getNombreDeChiffre() + " chiffres !");

                                }

                                System.out.println();

                                break;

                        }//Fin du switch du menu du jeu

                    } while (choixMenu != 3);//Sortir du menu du jeu CodeGame

            }//Fin du switch du menu de départ

        } while (choixMenu != 2);//Sortir du menu de départ

        System.out.println("Au revoir ^^");

	}
}
