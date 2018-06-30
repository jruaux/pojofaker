package org.ruaux.pojofaker;

import com.github.javafaker.Faker;

public class File {

	private com.github.javafaker.File file;

	protected File(Faker faker) {
		this.file = faker.file();
	}

	public String getExtension() {
		return file.extension();
	}

	public String getMimeType() {
		return file.mimeType();
	}

	public String getFileName() {
		return file.fileName();
	}

	public String fileName(String dirOrNull, String nameOrNull, String extensionOrNull, String separatorOrNull) {
		return file.fileName(dirOrNull, nameOrNull, extensionOrNull, separatorOrNull);
	}
}
