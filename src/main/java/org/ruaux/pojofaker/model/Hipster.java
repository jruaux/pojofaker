package org.ruaux.pojofaker.model;

import com.github.javafaker.Faker;

public class Hipster {

    private com.github.javafaker.Hipster hipster;

	public Hipster(Faker faker) {
        this.hipster = faker.hipster();
    }

    public String getWord() {
        return hipster.word();
    }
}