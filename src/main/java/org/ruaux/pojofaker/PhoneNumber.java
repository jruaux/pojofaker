package org.ruaux.pojofaker;

import com.github.javafaker.Faker;

public class PhoneNumber {

    private com.github.javafaker.PhoneNumber phoneNumber;

	protected PhoneNumber(Faker faker) {
		this.phoneNumber = faker.phoneNumber();
    }

    public String getCellPhone() {
        return phoneNumber.cellPhone();
    }

    public String getPhoneNumber() {
        return phoneNumber.phoneNumber();
    }
}