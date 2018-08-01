package org.ruaux.pojofaker.model;

import com.github.javafaker.Faker;

public class Artist {

    private com.github.javafaker.Artist artist;

	public Artist(Faker faker) {
        this.artist = faker.artist();
    }

    public String getName() {
        return artist.name();
    }
}
