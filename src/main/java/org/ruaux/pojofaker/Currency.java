package org.ruaux.pojofaker;

import com.github.javafaker.Faker;

public class Currency {

	private com.github.javafaker.Currency currency;

	public Currency(Faker faker) {
		this.currency = faker.currency();
	}

	public String getName() {
		return currency.name();
	}

	public String getCode() {
		return currency.code();
	}
}
