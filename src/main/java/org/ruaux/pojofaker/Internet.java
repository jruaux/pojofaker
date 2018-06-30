package org.ruaux.pojofaker;

import java.util.List;

import com.github.javafaker.Faker;

public class Internet {

	private com.github.javafaker.Internet internet;

	protected Internet(Faker faker) {
		this.internet = faker.internet();
	}

	public String getEmailAddress() {
		return internet.emailAddress();
	}

	public String emailAddress(String localPart) {
		return internet.emailAddress(localPart);
	}

	public String getSafeEmailAddress() {
		return internet.safeEmailAddress();
	}

	public String safeEmailAddress(String localPart) {
		return internet.safeEmailAddress(localPart);
	}

	public String getDomainName() {
		return internet.domainName();
	}

	public String getDomainWord() {
		return internet.domainWord();
	}

	public String getDomainSuffix() {
		return internet.domainSuffix();
	}

	public String getUrl() {
		return internet.url();
	}

	public String getAvatar() {
		return internet.avatar();
	}

	public String getImage() {
		return internet.image();
	}

	public String image(Integer width, Integer height, Boolean gray, String text) {
		return internet.image(width, height, gray, text);
	}

	public String getPassword() {
		return internet.password();
	}

	public String password(int minimumLength, int maximumLength) {
		return internet.password(minimumLength, maximumLength);
	}

	public String password(int minimumLength, int maximumLength, boolean includeUppercase) {
		return internet.password(minimumLength, maximumLength, includeUppercase);
	}

	public String password(int minimumLength, int maximumLength, boolean includeUppercase, boolean includeSpecial) {
		return internet.password(minimumLength, maximumLength, includeUppercase, includeSpecial);
	}

	public String macAddress(String prefix) {
		return internet.macAddress(prefix);
	}

	public String getMacAddress() {
		return internet.macAddress();
	}

	public String getIpV4Address() {
		return internet.ipV4Address();
	}

	public String getPrivateIpV4Address() {
		return internet.privateIpV4Address();
	}

	public String getPublicIpV4Address() {
		return internet.publicIpV4Address();
	}

	public String getIpV4Cidr() {
		return internet.ipV4Cidr();
	}

	public String getIpV6Address() {
		return internet.ipV6Address();
	}

	public String getIpV6Cidr() {
		return internet.ipV6Cidr();
	}

	public String getSlug() {
		return internet.slug();
	}

	public String slug(List<String> wordsOrNull, String glueOrNull) {
		return internet.slug(wordsOrNull, glueOrNull);
	}

	public String getUuid() {
		return internet.uuid();
	}

}