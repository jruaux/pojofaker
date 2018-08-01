package org.ruaux.pojofaker.model;

import com.github.javafaker.Faker;

public class Business {

	private com.github.javafaker.Business business;

	public Business(Faker faker) {
		this.business = faker.business();
	}

	public String getCreditCardNumber() {
		return business.creditCardNumber();
	}

	public String getCreditCardType() {
		return business.creditCardType();
	}

	public String getCreditCardExpiry() {
		return business.creditCardExpiry();
	}
}