package org.ruaux.pojofaker.model;

import com.github.javafaker.Faker;

public class Color {

	private com.github.javafaker.Color color;

	public Color(Faker faker) {
		this.color = faker.color();
	}

	public String getName() {
		return color.name();
	}
}