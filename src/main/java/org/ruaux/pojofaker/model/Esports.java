package org.ruaux.pojofaker.model;

import com.github.javafaker.Faker;

public class Esports {

	private com.github.javafaker.Esports esports;

	public Esports(Faker faker) {
		this.esports = faker.esports();
    }

    public String getPlayer() {
        return esports.player();
    }

    public String getTeam() {
        return esports.team();
    }

    public String getEvent() {
        return esports.event();
    }

    public String getLeague() {
        return esports.league();
    }

    public String getGame() {
        return esports.game();
    }
}