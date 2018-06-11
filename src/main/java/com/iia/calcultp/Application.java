/* Copyright Pauchard Thomas 07/06/20 */

package com.iia.calcultp;

import java.util.Scanner;

/**
 * My main Application.
 * @author Thomas
 * @version 1.0
 */
public final class Application {

    /** Max menu number for an operation with 2 numbers. */
    private static final int MAX_NUMBER_MENU = 5;
    /**User input number.*/
    private static String number = "";
    /**User input first number.*/
    private static double number1;
    /**User input second number.*/
    private static double number2;
    /** Operation result. */
    private static double result;

    /**
     * Constructor.
     */
    private Application() {
        super();
    }

    /**
     * Entry point of application.
     * @param args Arguments from CLI.
     */
    public static void main(final String[] args) {
       
        showMenu();
        
        Utils.message("Veuillez saisir une option : ");
        final String userInput = new Scanner(System.in, "UTF-8").nextLine();
        
        if ("q".equals(userInput)) {
            exitApp();
        } else {
            if (Utils.tryParseDouble(userInput)) {
                final int userNumber = Integer.parseInt(userInput);
                if (userNumber <= MAX_NUMBER_MENU) {
                   number1 = getNumber();
                   number2 = getNumber();
                   result =  SelectOperation.selectOptionWithTwoNumbers(userInput, number1, number2);
                } else {
                   number1 = getNumber();
                   result = SelectOperation.selectOption(userInput, number1);
                }
                displayResultOperation(result);
            } else {
                Utils.message("Veuillez saisir une valeur entre 1 et 8 (q = quitter)");
            }
        }
    }
    /**
     * Affiche le résultat de l'opération.
     * @param result
     */
    public static void displayResultOperation(final double result) {
        if (result != -1) {
           Utils.message("resultat de l'opération :" + result); 
        }
    }
    
    /**
     * Exit the calculator.
     */
    public static void exitApp() {
        System.out.print("Au revoir!");
        System.exit(0);
    }
    
    /**
     * Show application menu.
     */
    public static void showMenu() {
        System.out.print("\r\n*************************************** \r\n");
        System.out.print("* Bienvenue dans votre calculatrice ! * \r\n");
        System.out.print("*************************************** \r\n \r\n");
        
        System.out.print("1- Addition \r\n");
        System.out.print("2- Soustraction\r\n");
        System.out.print("3- Multiplication\r\n");
        System.out.print("4- Division\r\n");
        System.out.print("5- Modulo\r\n");
        System.out.print("6- Pourcentage\r\n");
        System.out.print("7- sin cos tang\r\n");
        System.out.print("8- Historique des opérations\r\n");
    }
    
    /**
     * Show submenu.
     */
    public static void showSubMenu() {
        System.out.print("0- Retour au menu \r\n");
        System.out.print("1- Nouvelle opération\r\n");
    }
    
    /**
     * Get user prompt number.
     * @return user prompt number
     */
    public static double getNumber() {
        Utils.message("Saisir un nombre : ");
        final Scanner scannerInputUser = new Scanner(System.in, "UTF-8");
        do {
            try {
                number = scannerInputUser.nextLine();
            } catch (Exception e) {
                Utils.message(e.getMessage());
            }
        }while(!Utils.tryParseDouble(number));

        return Double.parseDouble(number);
    }
}
