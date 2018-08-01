package org.ruaux.pojofaker.model;

import com.github.javafaker.Faker;

public class Shakespeare {

	private com.github.javafaker.Shakespeare shakespeare;

	public Shakespeare(Faker faker) {
		this.shakespeare = faker.shakespeare();
	}

	public String getHamletQuote() {
		return shakespeare.hamletQuote();
	}

	public String getAsYouLikeItQuote() {
		return shakespeare.asYouLikeItQuote();
	}

	public String getKingRichardIIIQuote() {
		return shakespeare.kingRichardIIIQuote();
	}

	public String getRomeoAndJulietQuote() {
		return shakespeare.romeoAndJulietQuote();
	}

}