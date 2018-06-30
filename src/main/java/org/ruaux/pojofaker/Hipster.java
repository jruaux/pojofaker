package org.ruaux.pojofaker;

import com.github.javafaker.Faker;

public class Hipster {

    private com.github.javafaker.Hipster hipster;

	protected Hipster(Faker faker) {
        this.hipster = faker.hipster();
    }

    public String getWord() {
        return hipster.word();
    }
}