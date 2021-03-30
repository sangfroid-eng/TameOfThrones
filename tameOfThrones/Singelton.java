package com.geekTrust.challenges.tameOfThrones;

public class Singelton {
	
	private static Singelton instance= null;
	
	public String s1 = "Hi";
	
	private Singelton() {
		
	}

	
	public static Singelton getInstance() {
		
		synchronized(Singelton.class) {
		if(instance == null)
		{
			
			instance = new Singelton();
			return instance;
		}
		}
		
		return instance;
		
	}

}


