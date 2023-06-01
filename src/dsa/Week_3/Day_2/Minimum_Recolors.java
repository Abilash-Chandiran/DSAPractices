package dsa.Week_3.Day_2; //75% Done

import java.util.HashMap;

import org.junit.Test;

public class Minimum_Recolors {
	@Test
	public void data_01() {
		String blocks = "WBBWWBBWBW";
		int k = 7;
		minimum_colors(blocks, k);
	}

	private String minimum_colors(String blocks, int k) {
		int left = 0;
		int right = 0;
		String s = "";
		char[] c = blocks.toCharArray();
		while (right < k) {
			s = s + c[right];
			right++;
		}
		System.out.println(s);
		while (right < blocks.length()) {
			left++;
			right++;
			s = blocks.substring(left, right);
			System.out.println(s);
		}

		return s;

	}

	private int find_count(String s) {
		HashMap<Character, Integer> map = new HashMap<Character, Integer>();
		char[] c = s.toCharArray();
		for (char a : c) {
			if (map.containsKey(a))
				map.put(a, map.get(a) + 1);
			else
				map.put(a, 1);
		}
		map.entrySet();
		return 0;
	}
}