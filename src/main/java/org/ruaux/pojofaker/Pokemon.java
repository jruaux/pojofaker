package org.ruaux.pojofaker;

import com.github.javafaker.Faker;

public class Pokemon {

	private com.github.javafaker.Pokemon pokemon;

	protected Pokemon(Faker faker) {
		this.pokemon = faker.pokemon();
	}

	public String getName() {
		return pokemon.name();
	}

	public String getLocation() {
		return pokemon.location();
	}
}
