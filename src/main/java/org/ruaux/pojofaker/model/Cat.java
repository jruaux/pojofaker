package org.ruaux.pojofaker.model;

import com.github.javafaker.Faker;

public class Cat {

    private com.github.javafaker.Cat cat;

	public Cat(Faker faker) {
        this.cat = faker.cat();
    }

    public String getName() {
        return cat.name();
    }

    public String getBreed() {
        return cat.breed();
    }

    public String getRegistry() {
        return cat.registry();
    }
}
