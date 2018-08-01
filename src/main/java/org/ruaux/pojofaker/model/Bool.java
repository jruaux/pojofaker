package org.ruaux.pojofaker.model;

import com.github.javafaker.Faker;

public class Bool {

	private com.github.javafaker.Bool bool;

	public Bool(Faker faker) {
		this.bool = faker.bool();
	}

	public boolean isBool() {
		return bool.bool();
	}
}
