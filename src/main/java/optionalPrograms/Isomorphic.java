package main.java.optionalPrograms;

import java.util.HashMap;

public class Isomorphic {

	public static void main(String[] args) {
		String s = "egg", t = "add";
		boolean output = true;
		isIsomorphic(s, t);

	}

	public static boolean isIsomorphic(String s, String t) {

		HashMap<Character, Character> charCount = new HashMap();
		char c = 'a';
		for (int i = 0; i < s.length(); i++) {
			if (charCount.containsKey(s.charAt(i))) {
				c = charCount.get(s.charAt(i));
				if (c != t.charAt(i))
					return false;
			} else if (!charCount.containsValue(t.charAt(i))) {
				charCount.put(s.charAt(i), t.charAt(i));
			} else {
				return false;
			}
		}
		return true;
	}

}
