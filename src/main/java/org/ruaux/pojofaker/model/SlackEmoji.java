package org.ruaux.pojofaker.model;

import com.github.javafaker.Faker;

public class SlackEmoji {

	private com.github.javafaker.SlackEmoji slackEmoji;

	public SlackEmoji(Faker faker) {
		this.slackEmoji = faker.slackEmoji();
	}

	public String getPeople() {
		return slackEmoji.people();
	}

	public String getNature() {
		return slackEmoji.nature();
	}

	public String getFoodAndDrink() {
		return slackEmoji.foodAndDrink();
	}

	public String getCelebration() {
		return slackEmoji.celebration();
	}

	public String getActivity() {
		return slackEmoji.activity();
	}

	public String getTravelAndPlaces() {
		return slackEmoji.travelAndPlaces();
	}

	public String getObjectsAndSymbols() {
		return slackEmoji.objectsAndSymbols();
	}

	public String getCustom() {
		return slackEmoji.custom();
	}

	public String getEmoji() {
		return slackEmoji.emoji();
	}
}