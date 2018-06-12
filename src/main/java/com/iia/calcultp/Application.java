/* Copyright Pauchard Thomas 07/06/20 */

package com.iia.calcultp;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * My main Application.
 * @author Thomas
 * @version 1.0
 */
public final class Application {

    /** Max menu number for an operation with 2 numbers. */
    private static final int MAX_TWO_NB_OPE = 5;
    /** Max menu number for an operation with 1 numbers. */
    private static final int MAX_ONE_NB_OPE = 9;
    /**User input number.*/
    private static String number = "";
    /**User input first number.*/
    private static double number1;
    /**User input second number.*/
    private static double number2;
    /** Operation result. */
    private static double result;
    /** Previous char. */
    private static char previousChar = '\0';
    /** operators list. */
    private static String operatorList = "+-*/^";
    /** parenthesis list. */
    private static String parentheseList = "()";
    /** Not found in indexof. */
    private static final int NOT_FOUND = -1;
    /** matcher. */
    private static Matcher matcher;
    /** pattern. */
    private static Pattern pattern; 

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
        manageMenu(prompt());
    }

    /**
     * Manage operation .
     * @param userOperationChoice user operation choice
     */
    private static void manageOperation(final int userOpeChoice) {
        if (userOpeChoice <= MAX_TWO_NB_OPE) {
            Utils.message("Saisir un nombre : ");
            number1 = getNumber();
            Utils.message("Saisir un nombre : ");
            number2 = getNumber();
            //result =  executeTwoNumbersOperation(userOpeChoice, number1, number2);
            result = SelectOperation.selectOptionWithTwoNumbers(userOpeChoice, number1, number2);
        } else if (userOpeChoice <= MAX_ONE_NB_OPE) {
            Utils.message("Saisir un nombre : ");
            number1 = getNumber();
            //result = executeOneNumberOperation(userOpeChoice, number1);
            result = SelectOperation.selectOption(userOpeChoice, number1);

        } else {
            Utils.message("Saisir votre opération : ");
            final String prompt = prompt();
            if (isMathsExpression(prompt)) {
                result = Calcul.eval(prompt);
            } else {
                System.out.print("Expression invalide");
                result = -1;
            }
        }
        displayResultOperation(result);
        showSubMenu();
        manageSubMenu(userOpeChoice, prompt());
    }

    /**
     * Check if user prompt is a valid math expression.
     * @param str string to verify 
     * @return boolean if is math expression
     */
    public static boolean isMathsExpression(final String str) {

        boolean isValid;
        pattern = Pattern.compile("((\\d*\\.\\d+)|(\\d+)|([\\+\\-\\*/\\(\\)\\^]))");
        matcher = pattern.matcher(str);
        final StringBuilder output = new StringBuilder();
        while (matcher.find()) {
            output.append(matcher.group());
        }
        if (output.length() == str.length() &&
                output.length() != 0 && !isContainDoubleOperator(str)) {
            isValid = true;
        } else {
            isValid = false;
        }
        return isValid;
    }

    /**
     * Check if String contain two consecutive operators.
     * @param str string to verify
     * @return boolean is contain double operator 
     */
    public static boolean isContainDoubleOperator(final String str) {
        boolean isDoubleOperator = false;
        for (final char ch: str.toCharArray()) {
            
            if (ch == previousChar && operatorList.indexOf(ch) != NOT_FOUND
                    || (parentheseList.indexOf(ch) != NOT_FOUND && (parentheseList.indexOf(previousChar) != -1))
                    || (operatorList.indexOf(previousChar) == NOT_FOUND && ch == '(')
                    ) {
                isDoubleOperator = true;
                break;
            }
            
            previousChar = ch;
        }

        return isDoubleOperator;
    }

    /**
     * Display operation result.
     * @param result
     */
    public static void displayResultOperation(final double result) {
        if (result == -1) {
            Utils.message("Pas de résultat");
        } else {
            Utils.message("resultat de l'opération : " + result); 
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
        System.out.print("7- sin\r\n");
        System.out.print("8- cos\r\n");
        System.out.print("9- tang\r\n");
        System.out.print("10- Historique des opérations\r\n");
        System.out.print("11- Opération libre\r\n");
    }

    /**
     * Manage menu.
     */
    private static void manageMenu(final String userInput) {        
        if ("q".equals(userInput)) {
            exitApp();
        } else {
            if (Utils.tryParseDouble(userInput)) {
                final int userNumber = Integer.parseInt(userInput);
                manageOperation(userNumber);
            } else {
                Utils.message("Veuillez saisir une valeur entre 1 et 11 (q = quitter)");
                manageMenu(prompt());
            }
        }
    }

    /**
     * Show submenu.
     */
    public static void showSubMenu() {
        System.out.print("\r\n0- Retour au menu \r\n");
        System.out.print("1- Nouvelle opération\r\n");
    }

    /**
     * Manage submenu.
     * @param currentOperation currentOperation
     */
    private static void manageSubMenu(final int currentOperation, final String userInput) {
        if (Utils.tryParseDouble(userInput)) {
            final int userSubMenuChoice = Integer.parseInt(userInput);
            switch (userSubMenuChoice) {
            case 0:
                showMenu();
                manageMenu(prompt());
                break;
            case 1:
                manageOperation(currentOperation);
                break;
            default:
                break;
            }
        } else {
            Utils.message("Veuillez saisir une valeur entre 0 et 1");
            System.lineSeparator();
            manageSubMenu(currentOperation, prompt());
        }
    }

    /**
     * Get user prompt number.
     * @return user prompt number
     */
    public static double getNumber() {
        do {
            number = prompt();
            if (number.contains(",")) {
                number = number.replaceAll(",", ".");
            }
        }while(!Utils.tryParseDouble(number));

        return Double.parseDouble(number);
    }
    /**
     * User prompt.
     * @return user prompt
     */
    public static String prompt() {
        final Scanner scannerInputUser = new Scanner(System.in, "UTF-8");
        return scannerInputUser.nextLine();
    }
}
