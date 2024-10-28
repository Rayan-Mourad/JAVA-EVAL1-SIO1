package com.sio;

package com.sio;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Main {
    private static final Scanner scanner = new Scanner(System.in);
    private static final String GREEN = "\u001B[32m";
    private static final String RESET = "\u001B[0m";

    public static void main(String[] args) {
        System.out.println(GREEN);
        System.out.println("#############################################");
        System.out.println("            JAVA EVAL 1 SIO 1 ALT            ");
        System.out.println("#############################################");

        while(true){
            System.out.println("#############################################");
            System.out.println("1. Exercice 1");
            System.out.println("2. Exercice 2");
            System.out.println("3. Exercice 3");
            System.out.println("4. Exercice 4");
            System.out.println("0. Quitter le programme");
            System.out.println("#############################################");
            System.out.print("Entrer votre choix: ");

            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice){
                case 1:
                    System.out.println("---------------------------------------------");
                    System.out.println("Exercice 1");
                    System.out.println("---------------------------------------------");
                    //Exercice 1 : Entrer votre code ici
                    Scanner scanner = new Scanner(System.in);
                    System.out.print("Entrer un nombre");
                    int nombre = scanner.nextInt();
                    System.out.print("Entrer une puissance");
                    double Puissance = scanner.nextInt();
                    Scanner.nextInt();
                    System.out.print("La puissance doit etre superieur ou egale à 0");
                    System.out.print("Entrer une valeur");
                    double resultat = Math.pow(nombre, Puissance);
                    System.out.print("le resultat de "nombre "a la puissance "Puissance"est" resultat);





                    System.out.println("---------------------------------------------");
                    break;
                case 2:
                    System.out.println("---------------------------------------------");
                    System.out.println("Exercice 2");
                    System.out.println("---------------------------------------------");
                    //Exercice 2 : Entrer votre code ici

                    Scanner scanner = new Scanner(System.in);
                    System.out.print("Entrer le nombre de kilomètres parcourus par le client: ");
                    int kilomètres = scanner.nextInt();
                    double tarifparkm = 0.20;
                    double montantPayer = kilomètres * tarifparkm ;
                    System.out.print("Le montant à payer par le client est :" montantPayer);

                    System.out.print("Entrer le nombre de kilomètres parcourus par le client: ");
                    int kilomètres = scanner.nextInt();
                    double tarifparkm = 0.50;
                    double montantPayer = kilomètres * tarifparkm ;
                    System.out.print("Le montant à payer par le client est :" montantPayer);

                    System.out.print("Entrer le nombre de kilomètres parcourus par le client: ");
                    int kilomètres = scanner.nextInt();
                    System.out.print("Le nombre de kilomètres doit etre superieur à 0");
                    System.out.print("Entrer le nombre de kilomètres parcourus par le client: ");
                    double kilparcourus = scanner.nextInt();
                    double montantPayer = kilomètres - 102,40
                    System.out.print("Le montant à payer par le client est:" montantPayer);









                    System.out.println("---------------------------------------------");
                    break;
                case 3:
                    System.out.println("---------------------------------------------");
                    System.out.println("Exercice 3");
                    System.out.println("---------------------------------------------");
                    //Exercice 3 : Entrer votre code ici
                    Scanner scanner = new Scanner(System.in);
                    System.out.print("Entrer la longueur du rectangle :");
                    Int longueur = scanner.nextInt();
                    System.out.print("la largeur doit etre superieur ou egale à 0");
                    System.out.print("Entrer la largeur du rectangle:");
                    Int largeur = scanner.nextInt();
                    System.out.print("Entrer la hauteur du rectangle:");
                    Int hauteur = scanner.nextInt();
                    System.out.print("La hauteur doit etre supérieur ou égale à 0 ");
                    System.out.print("Entrer la hauteur du rectangle");
                    Int hauteur = scanner.nextInt();







                    System.out.println("---------------------------------------------");

                    break;
                case 4:
                    System.out.println("---------------------------------------------");
                    System.out.println("Exercice 4");
                    System.out.println("---------------------------------------------");
                    //Exercice 4 : Entrer votre code ici
                    Scanner.scanner = new Scanner(System.in);
                    System.out.print("Entrer un nombre :");
                    Int nombre = scanner.nextInt();
                    System.out.print("Le nombre doit etre superieur ou égale a 0");
                    System.out.print("Entrer un nombre :");
                    int factoriel = scanner.nextInt();
                    char factoriel = n;
                    if (n > 0);
                    do n-- ;
                    else ;
                    n = 0;
                    System.out.print(" Le factoriel de "nombre" est" n);










                    System.out.println("---------------------------------------------");
                    break;
                case 0:
                    System.out.println(RESET);
                    System.exit(0);
                    break;
            }
        }
    }
}