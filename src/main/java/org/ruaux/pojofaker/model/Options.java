package org.ruaux.pojofaker.model;

import java.util.List;

import com.github.javafaker.Faker;

public class Options {

	private com.github.javafaker.Options options;

	public Options(Faker faker) {
		this.options = faker.options();
	}

	public String option(String... options) {
		return this.options.option(options);
	}

	public <E extends Enum<E>> E option(Class<E> enumeration) {
		return options.option(enumeration);
	}

	public <E> E nextElement(E[] array) {
		return options.nextElement(array);
	}

	public <E> E nextElement(List<E> list) {
		return options.nextElement(list);
	}
}