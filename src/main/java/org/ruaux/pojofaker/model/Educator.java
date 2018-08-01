package org.ruaux.pojofaker.model;

import com.github.javafaker.Faker;

public class Educator {

    private com.github.javafaker.Educator educator;

	public Educator(Faker faker) {
        this.educator = faker.educator();
    }

    public String getUniversity() {
        return educator.university();
    }

    public String getCourse() {
        return educator.course();
    }

    public String getSecondarySchool() {
        return educator.secondarySchool();
    }

    public String getCampus() {
        return educator.campus();
    }

}