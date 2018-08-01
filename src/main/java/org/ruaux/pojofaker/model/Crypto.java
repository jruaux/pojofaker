package org.ruaux.pojofaker.model;

import com.github.javafaker.Faker;

public class Crypto {

	private com.github.javafaker.Crypto crypto;

	public Crypto(Faker faker) {
		this.crypto = faker.crypto();
	}

	public String getMd5() {
		return crypto.md5();
	}

	public String getSha1() {
		return crypto.sha1();
	}

	public String getSha256() {
		return crypto.sha256();
	}

	public String getSha512() {
		return crypto.sha512();
	}

}