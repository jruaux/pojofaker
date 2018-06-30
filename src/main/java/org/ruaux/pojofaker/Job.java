package org.ruaux.pojofaker;

import com.github.javafaker.Faker;

public class Job {

	private com.github.javafaker.Job job;

	public Job(Faker faker) {
		this.job = faker.job();
	}

	public String getField() {
		return job.field();
	}

	public String getSeniority() {
		return job.seniority();
	}

	public String getPosition() {
		return job.position();
	}

	public String getKeySkills() {
		return job.keySkills();
	}

	public String getTitle() {
		return job.title();
	}
}
