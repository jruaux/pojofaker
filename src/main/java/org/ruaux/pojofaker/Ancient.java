package org.ruaux.pojofaker;

import com.github.javafaker.Faker;

public class Ancient {

	private com.github.javafaker.Ancient ancient;

	protected Ancient(Faker faker) {
		this.ancient = faker.ancient();
	}

	public String getGod() {
		return ancient.god();
	}

	public String getPrimordial() {
		return ancient.primordial();
	}

	public String getTitan() {
		return ancient.titan();
	}

	public String getHero() {
		return ancient.hero();
	}
}
