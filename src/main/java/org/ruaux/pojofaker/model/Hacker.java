package org.ruaux.pojofaker.model;

import com.github.javafaker.Faker;

public class Hacker {

    private com.github.javafaker.Hacker hacker;

	public Hacker(Faker faker) {
        this.hacker = faker.hacker();
    }

    public String getAbbreviation() {
        return hacker.abbreviation();
    }

    public String getAdjective() {
        return hacker.adjective();
    }

    public String getNoun() {
        return hacker.noun();
    }

    public String getVerb() {
        return hacker.verb();
    }

    public String getIngverb() {
        return hacker.ingverb();
    }
}
