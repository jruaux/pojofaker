package org.ruaux.pojofaker.model;

import com.github.javafaker.Faker;

public class Zelda {

	private com.github.javafaker.Zelda zelda;

	public Zelda(Faker faker) {
		this.zelda = faker.zelda();
	}

	public String getGame() {
		return zelda.game();
	}

	public String getCharacter() {
		return zelda.character();
	}
}
