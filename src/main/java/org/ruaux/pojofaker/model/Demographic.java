package org.ruaux.pojofaker.model;

import com.github.javafaker.Faker;

public class Demographic {

    private com.github.javafaker.Demographic demographic;

	public Demographic(Faker faker) {
        this.demographic = faker.demographic();
    }

    public String getRace() {
        return demographic.race();
    }

    public String getEducationalAttainment() {
        return demographic.educationalAttainment();
    }

    public String getDemonym() {
        return demographic.demonym();
    }

    public String getSex() {
        return demographic.sex();
    }

    public String getMaritalStatus() {
        return demographic.maritalStatus();
    }
}
