package org.ruaux.pojofaker.model;

import java.util.List;

import com.github.javafaker.Faker;

public class Lorem {

	private com.github.javafaker.Lorem lorem;

	public Lorem(Faker faker) {
		this.lorem = faker.lorem();
	}

	public char getCharacter() {
		return lorem.character();
	}

	public char character(boolean includeUppercase) {
		return lorem.character(includeUppercase);
	}

	public String getCharacters() {
		return lorem.characters();
	}

	public String characters(boolean includeUppercase) {
		return lorem.characters(includeUppercase);
	}

	public String characters(int minimumLength, int maximumLength) {
		return lorem.characters(minimumLength, maximumLength);
	}

	public String characters(int minimumLength, int maximumLength, boolean includeUppercase) {
		return lorem.characters(minimumLength, maximumLength, includeUppercase);
	}

	public String characters(int fixedNumberOfCharacters) {
		return lorem.characters(fixedNumberOfCharacters);
	}

	public String characters(int fixedNumberOfCharacters, boolean includeUppercase) {
		return lorem.characters(fixedNumberOfCharacters, includeUppercase);
	}

	public List<String> words(int num) {
		return lorem.words(num);
	}

	public List<String> getWords() {
		return lorem.words();
	}

	public String getWord() {
		return lorem.word();
	}

	public String getSentence() {
		return lorem.sentence();
	}

	public String sentence(int wordCount) {
		return lorem.sentence(wordCount);
	}

	public String sentence(int wordCount, int randomWordsToAdd) {
		return lorem.sentence(wordCount, randomWordsToAdd);
	}

	public List<String> sentences(int sentenceCount) {
		return lorem.sentences(sentenceCount);
	}

	public String paragraph(int sentenceCount) {
		return lorem.paragraph(sentenceCount);
	}

	public String getParagraph() {
		return lorem.paragraph();
	}

	public List<String> paragraphs(int paragraphCount) {
		return lorem.paragraphs(paragraphCount);
	}

	public String fixedString(int numberOfLetters) {
		return lorem.fixedString(numberOfLetters);
	}

}