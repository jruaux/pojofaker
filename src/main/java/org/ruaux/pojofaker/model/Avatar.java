package org.ruaux.pojofaker.model;

import com.github.javafaker.Faker;

public class Avatar {

	private com.github.javafaker.Avatar avatar;

	public Avatar(Faker faker) {
		this.avatar = faker.avatar();
	}

	public String getImage() {
		return avatar.image();
	}
}