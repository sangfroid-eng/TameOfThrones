package com.geekTrust.challenges.tameOfThrones;

import org.junit.Assert;
import org.junit.Test;

public class GeektrustTest {
	
	
	TameOfThrones tameOfThrones=new TameOfThrones();

	@Test
	public void test() {
		
		String fileloc = "C:\\Users\\Hp\\Documents\\input1.txt";
		String result = tameOfThrones.findAllies(fileloc);
		Assert.assertEquals("SPACE FIRE AIR WATER", result);
		
		String fileloc2 = "C:\\Users\\Hp\\Documents\\input2.txt";
		String result2 = tameOfThrones.findAllies(fileloc2);
		Assert.assertEquals("NONE", result2);
		
		String fileloc3 = "C:\\Users\\Hp\\Documents\\input3.txt";
		String result3 = tameOfThrones.findAllies(fileloc3);
		Assert.assertEquals("SPACE LAND ICE FIRE", result3);

	}

}
