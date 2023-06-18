package main.java.mandatoryHomeWork.week5.day2;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class IsSubsequence {
	@Test
	public void test1() {
		String s = "abc", t = "ahbgdc";
		subsequence(s, t);
		assertEquals(subsequence(s, t), true);
	}

	@Test
	public void test2() {
		String s = "axc", t = "ahbgdc";
		subsequence(s, t);
		assertEquals(subsequence(s, t), false);
	}

	@Test
	public void test3() {
		String s = "axc", t = "axc";
		subsequence(s, t);
		assertEquals(subsequence(s, t), true);
	}

	@Test
	public void test4() {
		String s = "abcde", t = "";
		subsequence(s, t);
		assertEquals(subsequence(s, t), false);
	}

	private boolean subsequence(String s, String t) {
		int p1 = 0, p2 = 0;
		String output = "";
		char[] s_ch = s.toCharArray();
		char[] t_ch = t.toCharArray();

		if (s.length() == 0 || t.length() == 0)
			return false;

		while (p2 < t.length()) {
			if (s_ch[p1] == t_ch[p2]) {
				output = output + s_ch[p1];
				p1++;
			}
			p2++;
		}
		return output.equals(s);
	}

}

//Time complexity = O(n)
//Space complexity = O(1)
