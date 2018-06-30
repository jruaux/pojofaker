package org.ruaux.pojofaker;

import com.github.javafaker.Faker;

public class IdNumber {

	private com.github.javafaker.IdNumber idNumber;

	protected IdNumber(Faker faker) {
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