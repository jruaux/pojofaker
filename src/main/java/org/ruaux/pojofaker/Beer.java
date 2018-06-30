package org.ruaux.pojofaker;

import com.github.javafaker.Faker;

public class Beer {

	private com.github.javafaker.Beer beer;

	protected Beer(Faker faker) {
		this.beer = faker.beer();
	}

	public String getName() {
		return beer.name();
	}

	public String getStyle() {
		return beer.style();
	}

	public String getHop() {
		return beer.hop();
	}

	public String getYeast() {
		return beer.yeast();
	}

	public String getMalt() {
		return beer.malt();
	}
}
