package com.tactfactory.tp1;

import org.junit.Assert;

public final class UtilsTest {
    
    

    @org.junit.Test
    public void testTryParseIntWithInt() {
        String str = "1";
        
        boolean isInt = Utils.tryParseInt(str);
        Assert.assertEquals(isInt,true);
    }
    
    @org.junit.Test
    public void testTryParseIntWithString() {
        String str = "a";
        
        boolean isInt = Utils.tryParseInt(str);
        Assert.assertEquals(isInt,false);
    }
    
}
