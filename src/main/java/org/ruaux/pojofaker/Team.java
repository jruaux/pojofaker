package org.ruaux.pojofaker;

import com.github.javafaker.Faker;

public class Team {

	private com.github.javafaker.Team team;

	protected Team(Faker faker) {
		this.team = faker.team();
	}

	public String getName() {
		return team.name();
	}

	public String getCreature() {
		return team.creature();
	}

	public String getState() {
		return team.state();
	}

	public String getSport() {
		return team.sport();
	}
}
