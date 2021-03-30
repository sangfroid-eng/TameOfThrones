package com.geekTrust.challenges.tameOfThrones;




public class Demo {
	
		public static void main(String[] args) {
			
			Singelton s1= Singelton.getInstance();
			Singelton s2= Singelton.getInstance();
			System.out.println(s1.equals(s2));
			
			
		}
	}


