package org.ruaux.pojofaker;

import com.github.javafaker.Faker;

public class Company {

	private com.github.javafaker.Company company;

	protected Company(Faker faker) {
		this.company = faker.company();
	}

	public String getName() {
		return company.name();
	}

	public String getSuffix() {
		return company.suffix();
	}

	public String getIndustry() {
		return company.industry();
	}

	public String getProfession() {
		return company.profession();
	}

	public String getBuzzword() {
		return company.buzzword();
	}

	public String getCatchPhrase() {
		return company.catchPhrase();
	}

	public String getBs() {
		return company.bs();
	}

	public String getLogo() {
		return company.logo();
	}

	public String getUrl() {
		return company.url();
	}

}