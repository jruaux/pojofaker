package org.ruaux.pojofaker.model;

import com.github.javafaker.Faker;

public class Yoda {

	private com.github.javafaker.Yoda yoda;

	public Yoda(final Faker faker) {
		this.yoda = faker.yoda();
	}

	public String getQuote() {
		return yoda.quote();
	}
}