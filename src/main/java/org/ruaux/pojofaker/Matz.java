package org.ruaux.pojofaker;

import com.github.javafaker.Faker;

public class Matz {

	private com.github.javafaker.Matz matz;

	protected Matz(Faker faker) {
		this.matz = faker.matz();
	}

	public String getQuote() {
		return matz.quote();
	}
}