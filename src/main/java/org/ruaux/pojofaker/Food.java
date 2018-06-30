package org.ruaux.pojofaker;

import com.github.javafaker.Faker;

public class Food {

    private com.github.javafaker.Food food;

	protected Food(Faker faker) {
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
