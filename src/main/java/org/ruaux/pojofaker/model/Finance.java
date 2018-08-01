package org.ruaux.pojofaker.model;

import com.github.javafaker.CreditCardType;
import com.github.javafaker.Faker;

public class Finance {

	private com.github.javafaker.Finance finance;

	public Finance(Faker faker) {
		this.finance = faker.finance();
	}

	public String creditCard(CreditCardType creditCardType) {
		return finance.creditCard(creditCardType);
	}

	public String getCreditCard() {
		return finance.creditCard();
	}

	public String getBic() {
		return finance.bic();
	}

	public String getIban() {
		return finance.iban();
	}

	public String iban(String countryCode) {
		return finance.iban(countryCode);
	}

}