package main.java.optionalPrograms;

import java.util.HashSet;
import java.util.Set;

public class LongestSubStringofaDistinctCharacters {

	public static void main(String[] args) {
		String str = "findlongestsubstring";
		System.out.println(longestSubString(str));
	}

	public static String longestSubString(String str) {
		String output = "";
		for (int i = 0; i < str.length(); i++) {
			Set<Character> visited = new HashSet<>();
			int j = i;
			for (; j < str.length(); j++) {
				char currChar = str.charAt(j);
				if (visited.contains(currChar))
					break;
				else
					visited.add(currChar);
			}
			if (output.length() < j - i + 1)
				output = str.substring(i, j);
		}
		return output;
	}
}
