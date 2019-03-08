package com.dylan.oc;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int choixMenu; //Variable de navigation dans le menu
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
                        jeu.laucnhGame();
                        System.out.println();
                        System.out.println("Voulez-vous recommencer ? O/N");
                        scan.nextLine();
                        String str = scan.nextLine();
                        exit = str.charAt(0);

                    } while (exit == 'N');

                    break;

            }
        } while (choixMenu != 2);

        System.out.println("Au revoir ^^");

	}
}
