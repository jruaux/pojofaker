package org.ruaux.pojofaker.model;

import com.github.javafaker.Faker;

public class LordOfTheRings {

	private com.github.javafaker.LordOfTheRings lordOfTheRings;

	public LordOfTheRings(Faker faker) {
		this.lordOfTheRings = faker.lordOfTheRings();
	}

	public String getCharacter() {
		return lordOfTheRings.character();
	}

	public String getLocation() {
		return lordOfTheRings.location();
	}
}
