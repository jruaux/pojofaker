package org.ruaux.pojofaker.model;

import com.github.javafaker.Faker;

public class Space {

	private com.github.javafaker.Space space;

	public Space(Faker faker) {
		this.space = faker.space();
	}

	public String getPlanet() {
		return space.planet();
	}

	public String getMoon() {
		return space.moon();
	}

	public String getGalaxy() {
		return space.galaxy();
	}

	public String getNebula() {
		return space.nebula();
	}

	public String getStarCluster() {
		return space.starCluster();
	}

	public String getConstellation() {
		return space.constellation();
	}

	public String getStar() {
		return space.star();
	}

	public String getAgency() {
		return space.agency();
	}

	public String getAgencyAbbreviation() {
		return space.agencyAbbreviation();
	}

	public String getNasaSpaceCraft() {
		return space.nasaSpaceCraft();
	}

	public String getCompany() {
		return space.company();
	}

	public String getDistanceMeasurement() {
		return space.distanceMeasurement();
	}

	public String getMeteorite() {
		return space.meteorite();
	}
}