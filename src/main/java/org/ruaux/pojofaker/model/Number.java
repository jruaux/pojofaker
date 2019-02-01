package org.ruaux.pojofaker.model;

import java.util.LinkedHashMap;
import java.util.Map;

import com.github.javafaker.Faker;

public class Number {

	private com.github.javafaker.Number number;

	public Number(Faker faker) {
		this.number = faker.number();
	}

	public int getRandomDigit() {
		return number.randomDigit();
	}

	public int getRandomDigitNotZero() {
		return number.randomDigitNotZero();
	}

	public int numberBetween(int min, int max) {
		return number.numberBetween(min, max);
	}

	public long numberBetween(long min, long max) {
		return number.numberBetween(min, max);
	}

	public long randomNumber(int numberOfDigits, boolean strict) {
		return number.randomNumber(numberOfDigits, strict);
	}

	public long getRandomNumber() {
		return number.randomNumber();
	}

	public double randomDouble(int maxNumberOfDecimals, int min, int max) {
		return number.randomDouble(maxNumberOfDecimals, min, max);
	}

	public double randomDouble(int maxNumberOfDecimals, long min, long max) {
		return number.randomDouble(maxNumberOfDecimals, min, max);
	}

	public String digits(int count) {
		return number.digits(count);
	}

	public String getDigit() {
		return number.digit();
	}

	public Map<String, Object> randomDoubleMap(int maxNumberOfDecimals, long min, long max, String... fields) {
		Map<String, Object> map = new LinkedHashMap<>(fields.length);
		for (String field : fields) {
			map.put(field, randomDouble(maxNumberOfDecimals, min, max));
		}
		return map;
	}

}