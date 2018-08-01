package org.ruaux.pojofaker.model;

import com.github.javafaker.Faker;

public class Matz {

	private com.github.javafaker.Matz matz;

	public Matz(Faker faker) {
		this.matz = faker.matz();
	}

	public String getQuote() {
		return matz.quote();
	}
}