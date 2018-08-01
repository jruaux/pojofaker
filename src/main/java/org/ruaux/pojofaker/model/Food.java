package org.ruaux.pojofaker.model;

import com.github.javafaker.Faker;

public class Food {

    private com.github.javafaker.Food food;

	public Food(Faker faker) {
        this.food = faker.food();
    }

    public String getIngredient() {
        return food.ingredient();
    }

    public String getSpice() {
        return food.spice();
    }

    public String getMeasurement() {
        return food.measurement();
    }
}
