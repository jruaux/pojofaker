package org.ruaux.pojofaker;

import com.github.javafaker.Faker;

public class App {

	private com.github.javafaker.App app;

	protected App(Faker faker) {
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