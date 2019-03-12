package com.dylan.oc;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int choixMenu; //Variable de navigation dans le menu
        int reponse;//Réponse de l'utilisateur
        char exit; // Variable pour quitter un jeu ou non a la fin

        do { // Menu de Départ
            System.out.println("Bienvenue ! Que voulez-vous faire ?");
            System.out.println("1 - Jouer au jeu du code secret");
            System.out.println("2 - Quitter");
            System.out.println("---------------------------------------------------");
            choixMenu = scan.nextInt();

            switch (choixMenu) {

                case 1:

                    do { // Lancement du jeu 1

                        CodeGame jeu = new CodeGame();
                        System.out.println();
                        System.out.println("NOMBRE SECRET ACTIVE");
                        System.out.println("Serez-vous assez fort pour le trouver ?");

                        do {//Boucle tans que l'on a pas trouvé le nombre secret

                            System.out.println();
                            System.out.println("Veuillez entrer un nombre : (entre 0 et 9999)");
                            reponse = scan.nextInt();
                            jeu.check(reponse);


                        } while (reponse != jeu.getNombreCaché());//Condition de sortie du jeu

                        System.out.println();
                        System.out.println("Voulez-vous recommencer ? O/N");
                        scan.nextLine();
                        String str = scan.nextLine();
                        exit = str.charAt(0);

                    } while (exit != 'N' && exit =='O'); //Recommencer ou non le jeu

                    System.out.println();

                    break;
            }

        } while (choixMenu != 2);//Sortir du menu de départ

        System.out.println("Au revoir ^^");

	}
}
