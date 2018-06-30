package org.ruaux.pojofaker;

import com.github.javafaker.Faker;

public class Bool {

	private com.github.javafaker.Bool bool;

	protected Bool(Faker faker) {
		this.bool = faker.bool();
	}

	public boolean isBool() {
		return bool.bool();
	}
}
