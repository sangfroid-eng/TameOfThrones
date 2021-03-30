package com.geekTrust.challenges.tameOfThrones;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.List;

public class TameOfThrones {

	TameOfThronesConstants tameOfThronesConstants;

	EncodeKingdomService encodeKingdomService;

	Universe universe;

	TameOfThrones() {
		tameOfThronesConstants = new TameOfThronesConstants();
		encodeKingdomService = new EncodeKingdomService();
		universe = new Universe();

	}

	private LinkedHashSet<String> processMessage(String fileloc) {

		LinkedHashSet<String> allies = new LinkedHashSet<String>();

		try {

			List<String> lines = Files.readAllLines(Paths.get(fileloc));

			for (String line : lines) {

				int spaceIndex = line.indexOf(TameOfThronesConstants.SPACE);

				String kingdom = line.substring(0, spaceIndex);
				StringBuilder message = new StringBuilder(line.substring(spaceIndex + 1));

				if (isValidMessageSent(kingdom, message)) {

					allies.add(kingdom);
				}

			}

		} catch (IOException e) {
			System.out.println("Unable to read file: " + e.getMessage());
		}

		return allies;

	}

	private boolean isValidMessageSent(String kingdom, StringBuilder message) {
		HashMap<String, Kingdom> encodedKingdoms = encodeKingdomService.mapKingdomNameToEncodedKingdom();
		Kingdom encodedKingdom = encodedKingdoms.get(kingdom);
		String encodedEmblem = encodedKingdom.getEmblem();

		for (int i = 0; i < encodedEmblem.length(); i++) {
			char character = encodedEmblem.charAt(i);
			if (message.indexOf(Character.toString(character)) < 0) {
				return false;

			} else
				message = message.deleteCharAt(message.indexOf(Character.toString(character)));

		}
		return true;
	}

	public String findAllies(String fileLocation) {

		String result = universe.getRulername();

		LinkedHashSet<String> allies = processMessage(fileLocation);

		if (allies.size() >= TameOfThronesConstants.MINIMUM_NUMBER_OF_ALLIES) {
			for (String ally : allies) {

				result = result + TameOfThronesConstants.SPACE + ally;
			}

			return result;
		}
		return TameOfThronesConstants.NONE;

	}

}
