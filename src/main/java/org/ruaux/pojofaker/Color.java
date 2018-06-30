package org.ruaux.pojofaker;

import com.github.javafaker.Faker;

public class Color {

	private com.github.javafaker.Color color;

	protected Color(Faker faker) {
		this.color = faker.color();
	}

	public String getName() {
		return color.name();
	}
}