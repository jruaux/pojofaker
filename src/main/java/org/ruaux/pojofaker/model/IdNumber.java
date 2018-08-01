package org.ruaux.pojofaker.model;

import com.github.javafaker.Faker;

public class IdNumber {

	private com.github.javafaker.IdNumber idNumber;

	public IdNumber(Faker faker) {
		this.idNumber = faker.idNumber();
	}

	public String getValid() {
		return idNumber.valid();
	}

	public String getInvalid() {
		return idNumber.invalid();
	}

	public String getSsnValid() {
		return idNumber.ssnValid();
	}

	public String getValidSvSeSsn() {
		return idNumber.validSvSeSsn();
	}

	public String getInvalidSvSeSsn() {
    	return idNumber.invalidSvSeSsn();
    }
}