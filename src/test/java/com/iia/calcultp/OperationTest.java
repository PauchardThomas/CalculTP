package com.iia.calcultp;

import org.junit.Assert;

import com.iia.calcultp.Operation;

public class OperationTest {

    @org.junit.Test
    public void testAdd() {
        double i =2 , j=3;

        double k = Operation.add(i,j);

        Assert.assertEquals(k,5,0.01);
    }

    @org.junit.Test
    public void testSubstract() {
        double i =4 , j=3;

        double k = Operation.substract(i,j);

        Assert.assertEquals(k,1,0.01);
    }

    @org.junit.Test
    public void testMultiply() {
        double i =4 , j=3;

        double k = Operation.multiply(i,j);

        Assert.assertEquals(k,12,0.01);
    }

    @org.junit.Test
    public void testMultiplyByZero() {
        double i =4 , j=0;

        double k = Operation.multiply(i,j);

        Assert.assertEquals(k,0,0.01);
    }

    @org.junit.Test
    public void testDivide() {
        double i =12 , j=2;

        double k = Operation.divide(i,j);

        Assert.assertEquals(k,6,0.01);
    }

    @org.junit.Test(expected=java.lang.ArithmeticException.class)
    public void testDivideByZero() {
        double i =12 , j=0;

       Operation.divide(i,j);
    }

    @org.junit.Test
    public void testModulo() {
        double i =8 , j=3;

        double k = Operation.modulo(i,j);
        Assert.assertEquals(k,2,0.01);
    }

    @org.junit.Test
    public void testpourcentage() {
        double i = 80;

        double k = Operation.pourcentage(i);
        Assert.assertEquals(k,0.8,0.01);
    }
    
    @org.junit.Test
    public void testSinus() {
        double i = 1;

        double k = Operation.sinus(i);
        Assert.assertEquals(k,0.84,0.01);
    }
}
