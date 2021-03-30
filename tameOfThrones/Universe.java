package com.geekTrust.challenges.tameOfThrones;

import java.util.ArrayList;

public class Universe {
	
	 final ArrayList<Kingdom> kingdoms = new ArrayList<Kingdom>();
	
	 final String rulerName ="SPACE";
	
	 final String rulerEmblem ="GORILLA";
	
	public ArrayList<Kingdom> getKingdoms() {

		kingdoms.add(new Kingdom("LAND", "PANDA"));
		kingdoms.add(new Kingdom("WATER", "OCTOPUS"));
		kingdoms.add(new Kingdom("ICE", "MAMMOTH"));
		kingdoms.add(new Kingdom("AIR", "OWL"));
		kingdoms.add(new Kingdom("FIRE", "DRAGON"));
		kingdoms.add(new Kingdom("SPACE", "GORILLA"));

		return kingdoms;

	}

	public String getRulername() {
		return this.rulerName;
	}

	public String getRuleremblem() {
		return this.rulerEmblem;
	}

}
