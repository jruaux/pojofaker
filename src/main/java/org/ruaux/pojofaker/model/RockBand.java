package org.ruaux.pojofaker.model;

import com.github.javafaker.Faker;

public class RockBand {

	private com.github.javafaker.RockBand rockBand;

	public RockBand(Faker faker) {
		this.rockBand = faker.rockBand();
	}

	public String getName() {
		return rockBand.name();
	}
}