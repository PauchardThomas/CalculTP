package com.iia.calcultp;

import org.junit.Assert;
import org.junit.Test;

import junit.framework.TestCase;

public class SelectOperationTest extends TestCase {

    @Test
    public void testSwitchTwoNumber() {
        //Addition
        assertTrue(SelectOperation.selectOptionWithTwoNumbers(1,1,1) == 2);
        //Soustraction
        assertTrue(SelectOperation.selectOptionWithTwoNumbers(2,1,1) == 0);
        //Multiplication
        assertTrue(SelectOperation.selectOptionWithTwoNumbers(3,1,1) == 1);
        //Division
        assertTrue(SelectOperation.selectOptionWithTwoNumbers(4,1,1) == 1);
        //Division
        assertTrue(SelectOperation.selectOptionWithTwoNumbers(4,1,0) == -1);
        //Modulo
        assertTrue(SelectOperation.selectOptionWithTwoNumbers(5,1,1) == 0);
        //Default
        assertTrue(SelectOperation.selectOptionWithTwoNumbers(8,1,1) == -1);
        
    }
    
    @Test
    public void testSwitchOneNumber() {
        //Percent
        assertTrue(SelectOperation.selectOption(6, 10) == 0.1);
        //Sinus
        assertTrue(SelectOperation.selectOption(7, 1) == 0.84);
        //Cosinus
        assertTrue(SelectOperation.selectOption(8, 1) == 0.54);
        //Tangente
        assertTrue(SelectOperation.selectOption(9, 1) == 1.56);
        
    }
    
}
