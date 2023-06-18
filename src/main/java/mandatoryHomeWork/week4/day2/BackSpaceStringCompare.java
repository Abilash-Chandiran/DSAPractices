package main.java.mandatoryHomeWork.week4.day2;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class BackSpaceStringCompare {

	@Test
	public void test() {
		String s = "ab#c", t = "ad#c";
		assertTrue(backspaceCompare(s, t));
	}

	public boolean backspaceCompare(String s, String t) {
		int i = s.length() - 1;
		int j = t.length() - 1;

		while (i >= 0 || j >= 0) {
			int c1 = 0;
			while (i >= 0 && (c1 > 0 || s.charAt(i) == '#')) {
				if (s.charAt(i) == '#') {
					c1++;
				} else {
					c1--;
				}

				i--;
			}

			int c2 = 0;
			while (j >= 0 && (c2 > 0 || t.charAt(j) == '#')) {
				if (t.charAt(j) == '#') {
					c2++;
				} else {
					c2--;
				}

				j--;
			}

			if (i >= 0 && j >= 0) {
				if (s.charAt(i) != t.charAt(j)) {
					return false;
				} else {
					i--;
					j--;
				}
			} else {
				if (i >= 0 || j >= 0) {
					return false;
				}
			}
		}

		return i < 0 && j < 0;
	}
}
