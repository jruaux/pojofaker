package org.ruaux.pojofaker;

import com.github.javafaker.Faker;

public class GameOfThrones {

    private com.github.javafaker.GameOfThrones gameOfThrones;

	protected GameOfThrones(Faker faker) {
        this.gameOfThrones = faker.gameOfThrones();
    }

    public String getCharacter() {
        return gameOfThrones.character();
    }

    public String getHouse() {
        return gameOfThrones.house();
    }

    public String getCity() {
        return gameOfThrones.city();
    }

    public String getDragon() {
        return gameOfThrones.dragon();
    }

    public String getQuote() {
      return gameOfThrones.quote();
    }
}
