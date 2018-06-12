package com.iia.calcultp;

import java.io.ByteArrayOutputStream;
import java.io.OutputStream;
import java.io.PrintStream;

import org.junit.Assert;
import org.junit.Test;

public class ApplicationTest {

    /**
     * Test to see Menu
     */
    @org.junit.Test
    public void testShowmenu() {
        
        OutputStream os = new ByteArrayOutputStream();
        PrintStream ps = new PrintStream(os);
        System.setOut(ps);

        Application.showMenu();
        Assert.assertEquals("\r\n*************************************** \r\n"
                + "* Bienvenue dans votre calculatrice ! * \r\n"
                + "*************************************** \r\n \r\n"
                + "1- Addition \r\n"
                + "2- Soustraction\r\n"
                + "3- Multiplication\r\n"
                + "4- Division\r\n"
                + "5- Modulo\r\n"
                + "6- Pourcentage\r\n"
                + "7- sin\r\n"
                + "8- cos\r\n"
                + "9- tang\r\n"
                + "10- Historique des opérations\r\n"
                + "11- Opération libre\r\n", os.toString());
    }
    
    @org.junit.Test
    public void testShowSubMenu() {
        
        OutputStream os = new ByteArrayOutputStream();
        PrintStream ps = new PrintStream(os);
        System.setOut(ps);

        Application.showSubMenu();
      /*  Assert.assertEquals("\r\n0- Retour au menu \r\n"
                + "1- Nouvelle opération\r\n", os.toString());*/
    }
    
    @org.junit.Test
    public void testDisplayResultOperation() {
        
        OutputStream os = new ByteArrayOutputStream();
        PrintStream ps = new PrintStream(os);
        System.setOut(ps);
        
        final double result = 10;
        
        Application.displayResultOperation(result);
        
        Assert.assertEquals("\r\nresultat de l'opération : " + result, os.toString());
    }
    
    @org.junit.Test
    public void testIsContainDoubleOperator() {
        String str = "2(3)";
        boolean result = Application.isContainDoubleOperator(str);
        Assert.assertEquals(result,true);
        
        String str2 = "2*(4-3)";
        boolean result2 = Application.isContainDoubleOperator(str2);
        Assert.assertEquals(result2,false);
        
        String str3 = "(2+3)(4-3)";
        boolean result3 = Application.isContainDoubleOperator(str3);
        Assert.assertEquals(result3,true);
        
        String str4 = "2+3*4";
        boolean result4 = Application.isContainDoubleOperator(str4);
        Assert.assertEquals(result4,false);
    }
    
    @org.junit.Test
    public void testIsMathsExpression() {
        String str = "2**2";
        boolean result = Application.isMathsExpression(str);
        Assert.assertEquals(result,false);
        
        String str2 = "p*p";
        boolean result2 = Application.isMathsExpression(str2);
        Assert.assertEquals(result2,false);
        
        String str3 = "2+3-77pk";
        boolean result3 = Application.isMathsExpression(str3);
        Assert.assertEquals(result3,false);
        
        String str4 = "4*6-4+3/7";
        boolean result4 = Application.isMathsExpression(str4);
        Assert.assertEquals(result4,true);
        
        String str5 = "2(3)";
        boolean result5 = Application.isMathsExpression(str5);
        Assert.assertEquals(result5,false);
    }
    
  /*  @org.junit.Test
    public void testExecuteTwoNumbersOperation() {
        
       int userChoice = 1;
       int number1 = 2 ,  number2 = 3;
       double result = Application.executeTwoNumbersOperation(userChoice,number1,number2);
        
        Assert.assertEquals(result,5,0.01);
    }
    
    @org.junit.Test
    public void testExecuteOneNumbersOperation() {
        
       int userChoice = 6;
       int number1 = 20;
       double result = Application.executeOneNumberOperation(userChoice,number1);
        
        Assert.assertEquals(result,0.2,0.01);
    }*/

    /*@org.junit.Test
    public void testGetNumber() {
        
       String userPromptNumber = "6";
       double result = Application.getNumber(userPromptNumber);
        
        Assert.assertEquals(result,6,0.01);
    }*/
}
