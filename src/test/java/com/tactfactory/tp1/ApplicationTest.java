package com.tactfactory.tp1;
import org.junit.Assert;

import com.tactfactory.tp1.Application;

public class ApplicationTest {

	@org.junit.Test
	public void testAdd() {
		int i =2 , j=3;
		
		int k = Application.add(i,j);
		
		Assert.assertEquals(k,5);
	}
}
