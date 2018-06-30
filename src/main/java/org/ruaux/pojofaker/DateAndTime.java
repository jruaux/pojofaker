package org.ruaux.pojofaker;

import java.util.Date;
import java.util.concurrent.TimeUnit;

import com.github.javafaker.Faker;

public class DateAndTime {

	private com.github.javafaker.DateAndTime dateAndTime;

	protected DateAndTime(Faker faker) {
		this.dateAndTime = faker.date();
	}

	public Date future(int atMost, TimeUnit unit) {
		return dateAndTime.future(atMost, unit);
	}

	public Date future(int atMost, TimeUnit unit, Date referenceDate) {
		return dateAndTime.future(atMost, unit, referenceDate);
	}

	public Date past(int atMost, TimeUnit unit) {
		return dateAndTime.past(atMost, unit);
	}

	public Date past(int atMost, TimeUnit unit, Date referenceDate) {
		return dateAndTime.past(atMost, unit, referenceDate);
	}

	public Date between(Date from, Date to) throws IllegalArgumentException {
		return dateAndTime.between(from, to);
	}

	public Date getBirthday() {
		return dateAndTime.birthday();
	}

	public Date birthday(int minAge, int maxAge) {
		return dateAndTime.birthday(minAge, maxAge);
	}

}