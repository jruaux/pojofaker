package org.ruaux.pojofaker.model;

import com.github.javafaker.Faker;

public class University {

	private com.github.javafaker.University university;

	public University(Faker faker) {
		this.university = faker.university();
	}

	public String getName() {
		return university.name();
	}

	public String getPrefix() {
		return university.prefix();
	}

	public String getSuffix() {
		return university.suffix();
	}
}
