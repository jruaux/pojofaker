package org.ruaux.pojofaker.model;

import com.github.javafaker.Faker;

public class Witcher {

	private com.github.javafaker.Witcher witcher;

	public Witcher(Faker faker) {
		this.witcher = faker.witcher();
	}

	public String getCharacter() {
		return witcher.character();
	}

	public String getWitcher() {
		return witcher.witcher();
	}

	public String getSchool() {
		return witcher.school();
	}

	public String getLocation() {
		return witcher.location();
	}

	public String getQuote() {
		return witcher.quote();
	}

	public String getMonster() {
		return witcher.monster();
	}
}
