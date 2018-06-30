package org.ruaux.pojofaker;

import com.github.javafaker.Faker;

public class Yoda {

	private com.github.javafaker.Yoda yoda;

	protected Yoda(final Faker faker) {
		this.yoda = faker.yoda();
	}

	public String getQuote() {
		return yoda.quote();
	}
}