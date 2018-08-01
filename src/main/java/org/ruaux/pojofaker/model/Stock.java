package org.ruaux.pojofaker.model;

import com.github.javafaker.Faker;

public class Stock {

	private com.github.javafaker.Stock stock;

	public Stock(Faker faker) {
		this.stock = faker.stock();
	}

	public String getNsdqSymbol() {
		return stock.nsdqSymbol();
	}

	public String getNyseSymbol() {
		return stock.nyseSymbol();
	}

}
