package org.ruaux.pojofaker;

import com.github.javafaker.Faker;

public class Superhero {

	private com.github.javafaker.Superhero superhero;

	protected Superhero(Faker faker) {
		this.superhero = faker.superhero();
	}

	public String getName() {
		return superhero.name();
	}

	public String getPrefix() {
		return superhero.prefix();
	}

	public String getSuffix() {
		return superhero.suffix();
	}

	public String getPower() {
		return superhero.power();
	}

	public String getDescriptor() {
		return superhero.descriptor();
	}
}
