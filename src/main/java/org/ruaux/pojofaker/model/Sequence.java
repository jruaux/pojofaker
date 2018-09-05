package org.ruaux.pojofaker.model;

import java.util.HashMap;
import java.util.Map;

public class Sequence {

	private Map<String, Long> sequences = new HashMap<String, Long>();

	public long next(String key) {
		long result = sequences.getOrDefault(key, 1L);
		sequences.put(key, result + 1);
		return result;
	}

	public long next(String key, long max) {
		return next(key) % max;
	}

	public String next(String key, long max, String format) {
		return String.format(format, next(key, max));
	}

}
