package org.ruaux.pojofaker;

import com.github.javafaker.Faker;

public class TwinPeaks {

	private com.github.javafaker.TwinPeaks twinPeaks;

	protected TwinPeaks(Faker faker) {
		this.twinPeaks = faker.twinPeaks();
	}

	public String getCharacter() {
		return twinPeaks.character();
	}

	public String getLocation() {
		return twinPeaks.location();
	}

	public String getQuote() {
		return twinPeaks.quote();
	}
}
