package main.java.optionalPrograms;

import static org.junit.Assert.assertEquals;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

import org.junit.Test;

/**
 * 
 * Given a string s, find the first non-repeating character in it and return its
 * index. If it does not exist, return -1. Example 1: Input: s = "lets code"
 * Output: 0 Example 2: Input: s = "love to code. lets code" Output: 2
 *
 */

public class FirstNonRepeatingChar {

	@Test
	public void test1() {
		String str = "lets code";
		assertEquals(0, findFirstNonRepeatingChar(str));
	}

	@Test
	public void test2() {
		String str = "love to code. lets code";
		assertEquals(2, findFirstNonRepeatingChar(str));
	}

	public static int findFirstNonRepeatingChar(String str) {

		char[] strChar = str.toCharArray();
		LinkedHashMap<Character, Integer> lhm = new LinkedHashMap<>();
		int minCount = Integer.MAX_VALUE;
		for (char c : strChar) {
			char ch = c;
			int count = lhm.getOrDefault(ch, 0) + 1;
			lhm.put(ch, count);
			if (count < minCount)
				minCount = count;
		}

		Iterator<Map.Entry<Character, Integer>> itr = lhm.entrySet().iterator();
		char nonRepeatinChar = 0;
		while (itr.hasNext()) {
			Map.Entry<Character, Integer> entryset = itr.next();
			if (entryset.getValue() == minCount) {
				nonRepeatinChar = entryset.getKey();
				break;
			}
		}
		int index = 0;
		for (int i = 0; i < strChar.length; i++) {
			if (strChar[i] == nonRepeatinChar) {
				index = i + 1;
				break;
			}
		}
		return index - 1;
	}

}
