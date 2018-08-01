package org.ruaux.pojofaker.model;

import com.github.javafaker.Faker;

public class App {

	private com.github.javafaker.App app;

	public App(Faker faker) {
		this.app = faker.app();
	}

	public String getName() {
		return app.name();
	}

	public String getVersion() {
		return app.version();
	}

	public String getAuthor() {
		return app.author();
	}
}