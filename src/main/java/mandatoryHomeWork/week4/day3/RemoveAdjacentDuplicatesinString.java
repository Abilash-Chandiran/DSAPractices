package main.java.mandatoryHomeWork.week4.day3;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class RemoveAdjacentDuplicatesinString {

	@Test
	public void test() {
		String s = "AAABBCDDD";
		assertEquals("ABCD", removeDuplicates(s));
	}

	public static String removeDuplicates(String s) {
		if (s == null) {
			return null;
		}
		char[] chars = s.toCharArray();
		char prev = 0;
		int k = 0;

		for (char c : chars) {
			if (prev != c) {
				chars[k++] = c;
				prev = c;
			}
		}

		return new String(chars).substring(0, k);
	}
}
