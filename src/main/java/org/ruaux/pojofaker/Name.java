package org.ruaux.pojofaker;

import com.github.javafaker.Faker;

public class Name {

	private com.github.javafaker.Name name;

	protected Name(Faker faker) {
		this.name = faker.name();
	}

	public String getName() {
		return name.name();
	}

	public String getNameWithMiddle() {
		return name.nameWithMiddle();
	}

	public String getFullName() {
		return name.fullName();
	}

	public String getFirstName() {
		return name.firstName();
	}

	public String getLastName() {
		return name.lastName();
	}

	public String getPrefix() {
		return name.prefix();
	}

	public String getSuffix() {
		return name.suffix();
	}

	public String getTitle() {
		return name.title();
	}

	public String getUsername() {
		return name.username();
	}
}