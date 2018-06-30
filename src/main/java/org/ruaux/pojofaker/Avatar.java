package org.ruaux.pojofaker;

import com.github.javafaker.Faker;

public class Avatar {

	private com.github.javafaker.Avatar avatar;

	protected Avatar(Faker faker) {
		this.avatar = faker.avatar();
	}

	public String getImage() {
		return avatar.image();
	}
}