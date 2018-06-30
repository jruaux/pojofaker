package org.ruaux.pojofaker;

import com.github.javafaker.Faker;

public class Artist {

    private com.github.javafaker.Artist artist;

	protected Artist(Faker faker) {
        this.artist = faker.artist();
    }

    public String getName() {
        return artist.name();
    }
}
