package org.ruaux.pojofaker.model;

import com.github.javafaker.Faker;

public class Friends {

    private com.github.javafaker.Friends friends;

	public Friends(Faker faker) {
        this.friends = faker.friends();
    }

    public String getCharacter() {
        return friends.character();
    }

    public String getLocation() {
        return friends.location();
    }

    public String getQuote() {
        return friends.quote();
    }
}