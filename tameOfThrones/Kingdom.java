package com.geekTrust.challenges.tameOfThrones;

public class Kingdom {

	String name;
	String emblem;

	public Kingdom(String name, String emblem) {
		super();
		this.name = name;
		this.emblem = emblem;

	}

	public String getName() {
		return name;
	}

	public String getEmblem() {
		return emblem;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setEmblem(String emblem) {
		this.emblem = emblem;
	}

}
