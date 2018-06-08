package com.tactfactory.tp1;

import org.junit.Assert;

public class OperationTest {

    @org.junit.Test
    public void testAdd() {
            int i =2 , j=3;
            
            int k = Operation.add(i,j);
            
            Assert.assertEquals(k,5);
    }
    
    @org.junit.Test
    public void testSubstract() {
            int i =4 , j=3;
            
            int k = Operation.substract(i,j);
            
            Assert.assertEquals(k,1);
    }
    
    @org.junit.Test
    public void testMultiply() {
            int i =4 , j=3;
            
            int k = Operation.multiply(i,j);
            
            Assert.assertEquals(k,12);
    }
    
    @org.junit.Test
    public void testMultiplyByZero() {
            int i =4 , j=0;
            
            int k = Operation.multiply(i,j);
            
            Assert.assertEquals(k,0);
    }
    
    @org.junit.Test
    public void testDivide() {
            int i =12 , j=2;
            
            int k = Operation.divide(i,j);
            
            Assert.assertEquals(k,6);
    }
    
    @org.junit.Test(expected=java.lang.ArithmeticException.class)
    public void testDivideByZero() {
            int i =12 , j=0;
            
            Operation.divide(i,j);
    }
    
    
    
}
