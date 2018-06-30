package org.ruaux.pojofaker;

import com.github.javafaker.Faker;

public class Commerce {

	private com.github.javafaker.Commerce commerce;

	protected Commerce(Faker faker) {
		this.commerce = faker.commerce();
	}

	public String getColor() {
		return commerce.color();
	}

	public String getDepartment() {
		return commerce.department();
	}

	public String getProductName() {
		return commerce.productName();
	}

	public String getMaterial() {
		return commerce.material();
	}

	public String getPrice() {
		return commerce.price();
	}

	public String price(double min, double max) {
		return commerce.price(min, max);
	}

	public String getPromotionCode() {
		return commerce.promotionCode();
	}

	public String promotionCode(int digits) {
		return commerce.promotionCode(digits);
	}
}