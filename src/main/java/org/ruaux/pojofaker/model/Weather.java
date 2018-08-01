package org.ruaux.pojofaker.model;

import com.github.javafaker.Faker;

public class Weather {

	private com.github.javafaker.Weather weather;

	public Weather(Faker faker) {
		this.weather = faker.weather();
	}

	public String getDescription() {
		return weather.description();
	}

	public String getTemperatureCelsius() {
		return weather.temperatureCelsius();
	}

	public String getTemperatureFahrenheit() {
		return weather.temperatureFahrenheit();
	}

	public String getTemperatureCelsius(int minTemperature, int maxTemperature) {
		return weather.temperatureCelsius(minTemperature, maxTemperature);
	}

	public String getTemperatureFahrenheit(int minTemperature, int maxTemperature) {
		return weather.temperatureFahrenheit(minTemperature, maxTemperature);
	}
}