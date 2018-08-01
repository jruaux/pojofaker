package org.ruaux.pojofaker.model;

import com.github.javafaker.Faker;

public class RickAndMorty {

	private com.github.javafaker.RickAndMorty rickAndMorty;

	public RickAndMorty(Faker faker) {
		this.rickAndMorty = faker.rickAndMorty();
	}

	public String getCharacter() {
		return rickAndMorty.character();
	}

	public String getLocation() {
		return rickAndMorty.location();
	}

	public String getQuote() {
		return rickAndMorty.quote();
	}
}
