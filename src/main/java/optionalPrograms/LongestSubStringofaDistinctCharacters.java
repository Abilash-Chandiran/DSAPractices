package main.java.optionalPrograms;

import java.util.Collections;
import java.util.HashMap;
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
	
	private static int findSubString(String s, int k) {
		if (s.trim().length() == 0)
			return 0;
		if (s.trim().length() < k)
			return s.length();
		int left = 0, right = 0, max = 1;
		HashMap<Integer, Integer> map = new HashMap<>();
		while (right < s.length()) {
			map.put((int) s.charAt(right), right++);
			if (map.size() > k) {
				Integer minIndex = Collections.min(map.values());
				map.remove((int) s.charAt(minIndex));
				left = minIndex + 1;
			}
			max = Math.max(max, right - left);
		}
		return max;
	}
}
