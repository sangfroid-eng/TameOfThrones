package com.geekTrust.challenges.tameOfThrones;

import java.util.ArrayList;
import java.util.HashMap;

public class EncodeKingdomService {

	TameOfThronesConstants tameOfThronesConstants;
	Universe universe;

	EncodeKingdomService() {
		tameOfThronesConstants = new TameOfThronesConstants();
		universe=new Universe();
	}

	public HashMap<String, Kingdom> mapKingdomNameToEncodedKingdom() {

		ArrayList<Kingdom> kingdoms = universe.getKingdoms();
		HashMap<String, Kingdom> kingdomAndEncodedEmblem = new HashMap<String, Kingdom>();

		for (Kingdom kingdom : kingdoms) {
			String encodedEmblem = encodeByRotating(kingdom.getEmblem(), kingdom.getEmblem().length());
			kingdom.setEmblem(encodedEmblem);

			kingdomAndEncodedEmblem.put(kingdom.getName(), kingdom);
		}

		return kingdomAndEncodedEmblem;

	}

	private String encodeByRotating(String originalEmblem, int length) {
		String encodedEmblem = "";
		for (int i = 0; i < length; i++) {
			int newChar = originalEmblem.charAt(i) + length;
			if (newChar > TameOfThronesConstants.UPPERCASE_END)
				newChar = TameOfThronesConstants.UPPERCASE_START + newChar - TameOfThronesConstants.UPPERCASE_END;
			encodedEmblem = encodedEmblem + (char) newChar;
		}

		return encodedEmblem;
	}

}
