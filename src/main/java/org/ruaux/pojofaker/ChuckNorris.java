package org.ruaux.pojofaker;

import com.github.javafaker.Faker;

public class ChuckNorris {

	private com.github.javafaker.ChuckNorris chuckNorris;

	protected ChuckNorris(Faker faker) {
		this.chuckNorris = faker.chuckNorris();
	}

	public String getFact() {
		return chuckNorris.fact();
	}
}