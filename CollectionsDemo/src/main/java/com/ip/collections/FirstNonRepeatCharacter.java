package com.ip.collections;

import java.util.HashMap;
import java.util.Map;

public class FirstNonRepeatCharacter {

	public static String getFirstNonRepeat(final String str) {

		int len = str.length();

		if (str == null || str.length() < 1) {

			return null;
		} else {

			HashMap<Character, Integer> hm = new HashMap<Character, Integer>();
			Character ch = null;

			for (int i = 0; i < len; i++) {

				ch = str.charAt(i);

				if (hm.containsKey(ch)) {

					hm.put(ch, hm.get(ch) + 1);
				} else {
					hm.put(ch, 1);
				}
			}
			String output = "";
			for (Map.Entry<Character, Integer> entry : hm.entrySet()) {

				if (hm.get(ch) == 1) {

					output = output + entry.getKey();
				}
			}
			return output;

		}

	}

	public static void main(final String[] args) {
		final String str = "aabcc";
		System.out.print(getFirstNonRepeat(str));
	}
}
