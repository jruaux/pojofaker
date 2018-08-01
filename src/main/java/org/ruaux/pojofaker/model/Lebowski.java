package org.ruaux.pojofaker.model;

import com.github.javafaker.Faker;

public class Lebowski {

	private com.github.javafaker.Lebowski lebowski;

	public Lebowski(Faker faker) {
		this.lebowski = faker.lebowski();
	}

	public String getActor() {
		return lebowski.actor();
	}

	public String getCharacter() {
		return lebowski.character();
	}

	public String getQuote() {
		return lebowski.quote();
	}
}
