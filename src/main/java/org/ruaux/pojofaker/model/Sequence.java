package org.ruaux.pojofaker.model;

import java.util.HashMap;
import java.util.Map;

public class Sequence {

	private Map<String, Long> sequences = new HashMap<String, Long>();

	public long next(String key, long start) {
		long result = sequences.getOrDefault(key, start);
		sequences.put(key, result + 1);
		return result;
	}

	public long next(String key, long start, long end) {
		return next(key, start) % end;
	}

	public String next(String key, long start, long end, String format) {
		return String.format(format, next(key, start, end));
	}

}
