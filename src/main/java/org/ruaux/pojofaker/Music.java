package org.ruaux.pojofaker;

import com.github.javafaker.Faker;

public class Music {

	private com.github.javafaker.Music music;

	protected Music(Faker faker) {
		this.music = faker.music();
	}

	public String getInstrument() {
		return music.instrument();
	}

	public String getKey() {
		return music.key();
	}

	public String getChord() {
		return music.chord();
	}
}