package main.java.optionalPrograms;

import java.util.HashMap;

/**
 * Given two strings s and t, return true if t is an anagram of s, and false
 * otherwise. An Anagram is a word or phrase formed by rearranging the letters
 * of a different word or phrase, typically using all the original letters
 * exactly once. Constrains: s and t consist of lowercase English letters.
 * Input: s = "anagram", t = "nagaram" Output: true
 *
 * Time Complexity : O(n) Space Complexity : O(1)
 */

public class AnagramProblem {

	public static void main(String[] args) {
		String s = "anagram";
		String t = "nagaram";
		System.out.println(findAnagramorNot(s, t));
	}

	public static boolean findAnagramorNot(String s, String t) {

		if (s == null && t == null)
			return true;
		if (s == null || t == null || s.length() != t.length())
			return false;

		HashMap<Character, Integer> charCounter1 = new HashMap<>();
		HashMap<Character, Integer> charCounter2 = new HashMap<>();

		for (int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);
			int count = charCounter1.getOrDefault(ch, 0) + 1;
			charCounter1.put(ch, count);
		}

		for (int i = 0; i < t.length(); i++) {
			char ch = t.charAt(i);
			int count = charCounter2.getOrDefault(ch, 0) + 1;
			charCounter2.put(ch, count);
		}

		if (charCounter1.equals(charCounter2))
			return true;

		return false;
	}

}
