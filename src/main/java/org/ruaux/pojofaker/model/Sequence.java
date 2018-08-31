package org.ruaux.pojofaker.model;

import java.util.HashMap;
import java.util.Map;

public class Sequence {

	private Map<String, Long> sequences = new HashMap<String, Long>();

	public long next(String key) {
		long result = sequences.getOrDefault(key, 0L);
		sequences.put(key, result + 1);
		return result;
	}

	public long next(String key, int digits, int interval) {
		long next = next(key) / interval;
		return (next % (int) Math.pow(10, digits)) + 1;
	}

	public String next(String key, int digits, int interval, String format) {
		long next = next(key, digits, interval);
		return String.format(format, next);
	}

}
