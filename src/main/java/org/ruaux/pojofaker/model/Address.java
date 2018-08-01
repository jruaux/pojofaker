package org.ruaux.pojofaker.model;

import com.github.javafaker.Faker;

public class Address {

	private com.github.javafaker.Address address;

	public Address(Faker faker) {
		this.address = faker.address();
	}

	public String getStreetName() {
		return address.streetName();
	}

	public String getStreetAddressNumber() {
		return address.streetAddressNumber();
	}

	public String getStreetAddress() {
		return address.streetAddress();
	}

	public String streetAddress(boolean includeSecondary) {
		return address.streetAddress(includeSecondary);
	}

	public String getSecondaryAddress() {
		return address.secondaryAddress();
	}

	public String getZipCode() {
		return address.zipCode();
	}

	public String zipCodeByState(String stateAbbr) {
		return address.zipCodeByState(stateAbbr);
	}

	public String getStreetSuffix() {
		return address.streetSuffix();
	}

	public String getStreetPrefix() {
		return address.streetPrefix();
	}

	public String getCitySuffix() {
		return address.citySuffix();
	}

	public String getCityPrefix() {
		return address.cityPrefix();
	}

	public String getCity() {
		return address.city();
	}

	public String getCityName() {
		return address.cityName();
	}

	public String getState() {
		return address.state();
	}

	public String getStateAbbr() {
		return address.stateAbbr();
	}

	public String getFirstName() {
		return address.firstName();
	}

	public String getLastName() {
		return address.lastName();
	}

	public String getLatitude() {
		return address.latitude();
	}

	public String getLongitude() {
		return address.longitude();
	}

	public String getTimeZone() {
		return address.timeZone();
	}

	public String getCountry() {
		return address.country();
	}

	public String getCountryCode() {
		return address.countryCode();
	}

	public String getBuildingNumber() {
		return address.buildingNumber();
	}

	public String getFullAddress() {
		return address.fullAddress();
	}
}