/* Copyright Pauchard Thomas 07/06/20 */

package com.iia.calcultp;

import java.util.Scanner;

/**
 * My main Application.
 * @author Thomas
 * @version 1.0
 */
public final class Application {


    private Application() {
        super();
    }

    /**
     * Entry point of application.
     * @param args Arguments from CLI.
     */
    public static void main(final String[] args) {
       
        showMenu();
        
        final String userInput = prompt("Veuillez saisir une option :");
        
        if ("q".equals(userInput)) {
            System.out.println("Au revoir!");
            System.exit(0);
        } else {
            if(!Utils.tryParseInt(userInput)) {
                Utils.message("Veuillez saisir une valeur entre 1 et 8 (q = quitter)");
            } else {
                selectOption(userInput);
            }
        }
    }
    /**
     * Get User input string.
     * @param promptMessage prompt description.
     * @return user prompt.
     */
    public static String prompt(final String promptMessage) {
        final Scanner scanner = new Scanner(System.in);
        System.out.println(promptMessage);
        return scanner.nextLine().toString();
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
     * Select the option according user prompt.
     * @param userInput.
     */
    public static void selectOption(final String userInput) {
        
        int number1 = getNumber();
        int number2 = getNumber();
        int result = 0;
        boolean operationDone = true;
        
        switch (Integer.parseInt(userInput)) {
        case 1:
            // addition
            result = Operation.add(number1, number2);
            break;
        case 2:
            // soustraction
            result = Operation.substract(number1, number2);
            break;
        case 3:
            //multiplication
            result = Operation.multiply(number1, number2);
            
            break;
        case 4:
            //division
            if(number2 == 0) {
                Utils.message("Division par 0 impossible");
                operationDone = false;
            }else {
                result = Operation.divide(number1, number2);
            }
            break;
        case 5:
            // modulo
            result = Operation.modulo(number1, number2);
            break;
        case 6:
            // pourcentage
            result = Operation.pourcentage(number1);
            break;
        case 7:
            // sin cos tang
            Utils.message("En construction...");
            operationDone = false;
            break;
        case 8:
            // historique
            Utils.message("En construction....");
            operationDone = false;
            break;
        default:
            // Choix invalide
            Utils.message("Choix invalide");
            operationDone = false;
            break;
        } 
        if(operationDone) {
            Utils.message("Résultat de l'opération : " + result);
        }
    }    
    /**
     * Add two value.
     * @return result of addition.
     */
    public static int getNumber() {
        String number;
        do
        {
            number = prompt("Saisir une nombre");
        }while(!Utils.tryParseInt(number));
        
        return Integer.parseInt(number);
    }
}
