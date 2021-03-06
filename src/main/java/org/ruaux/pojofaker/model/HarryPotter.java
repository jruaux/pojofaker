package org.ruaux.pojofaker.model;

import com.github.javafaker.Faker;

public class HarryPotter {

	private com.github.javafaker.HarryPotter harryPotter;

	public HarryPotter(Faker faker) {
		this.harryPotter = faker.harryPotter();
	}

	public String getCharacter() {
		return harryPotter.character();
	}

	public String getLocation() {
		return harryPotter.location();
	}

	public String getQuote() {
		return harryPotter.quote();
	}

	public String getBook() {
		return harryPotter.book();
	}
}
