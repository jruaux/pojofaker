package org.ruaux.pojofaker.model;

import com.github.javafaker.Faker;

public class ChuckNorris {

	private com.github.javafaker.ChuckNorris chuckNorris;

	public ChuckNorris(Faker faker) {
		this.chuckNorris = faker.chuckNorris();
	}

	public String getFact() {
		return chuckNorris.fact();
	}
}