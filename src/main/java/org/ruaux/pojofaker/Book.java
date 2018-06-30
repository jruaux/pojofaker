package org.ruaux.pojofaker;

import com.github.javafaker.Faker;

public class Book {

	private com.github.javafaker.Book book;

	protected Book(Faker faker) {
		this.book = faker.book();
	}

	public String getAuthor() {
		return book.author();
	}

	public String getTitle() {
		return book.title();
	}

	public String getPublisher() {
		return book.publisher();
	}

	public String getGenre() {
		return book.genre();
	}
}
