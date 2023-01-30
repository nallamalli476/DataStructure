package com.nrk.interview;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;

public class FindTheNonRepeatCharacter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String name = "character";
		Map<Character, Integer> map = new LinkedHashMap<>();
		for (int i = 0; i < name.length(); i++) {

			char ch = name.charAt(i);

			if (map.containsKey(ch)) {

				int val = map.get(ch);

				map.put(ch, val + 1);
			} else {
				map.put(ch, 1);
			}
		}
		for (Entry<Character, Integer> entry : map.entrySet()) {

			if (entry.getValue() == 1) {

				char ch = entry.getKey();
				System.out.println(ch + ": non repeated character");
			}
		}
	}
}
