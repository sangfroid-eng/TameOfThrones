package com.geekTrust.challenges.tameOfThrones;

public class Geektrust {

	public static void main(String[] args) {

		String filelocation = args[0];
		TameOfThrones tameOfThrones = new TameOfThrones();
		System.out.println(tameOfThrones.findAllies(filelocation));

	}

}
