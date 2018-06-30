package org.ruaux.pojofaker;

import com.github.javafaker.Faker;

public class RockBand {

	private com.github.javafaker.RockBand rockBand;

	protected RockBand(Faker faker) {
		this.rockBand = faker.rockBand();
	}

	public String getName() {
		return rockBand.name();
	}
}