package com.ip.collections;

import java.util.HashMap;
import java.util.Map;

public class Duplicates {
	public static String getDuplicates(final String input) {
		if (input == null || input.length() < 1) {

			return null;
		} else {

			char[] chars = input.toCharArray();
			HashMap<Character, Integer> map = new HashMap<Character, Integer>();

			for (char c : chars) {

				if (map.containsKey(c)) {
					map.put(c, map.get(c) + 1);
				} else {
					map.put(c, 1);
				}
			}
			String output = "";
			for (Map.Entry<Character, Integer> entry : map.entrySet()) {
				System.out.println(entry.getKey());

				if (entry.getValue() > 1) {

					output = output + entry.getKey();

				}

			}

			return output;

		}

	}

	public static void main(final String[] args) {
		final String str = "aabbcc";
		System.out.print(getDuplicates(str));
	}

}
