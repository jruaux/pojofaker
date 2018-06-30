package org.ruaux.pojofaker;

import com.github.javafaker.Faker;

public class Code {

	private com.github.javafaker.Code code;

	protected Code(Faker faker) {
		this.code = faker.code();
	}

	public String getIsbnGs1() {
		return code.isbnGs1();
	}

	public String getIsbnGroup() {
		return code.isbnGroup();
	}

	public String getIsbnRegistrant() {
		return code.isbnRegistrant();
	}

	public String getIsbn10() {
		return code.isbn10();
	}

	public String isbn10(boolean separator) {
		return code.isbn10(separator);
	}

	public String getIsbn13() {
		return code.isbn13();
	}

	public String isbn13(boolean separator) {
		return code.isbn13(separator);
	}

	public String getAsin() {
		return code.asin();
	}

	public String getImei() {
		return code.imei();
	}

	public String getEan8() {
		return code.ean8();
	}

	public String getGtin8() {
		return code.gtin8();
	}

	public String getEan13() {
		return code.ean13();
	}

	public String getGtin13() {
		return code.gtin13();
	}

}
