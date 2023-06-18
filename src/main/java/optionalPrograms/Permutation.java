package main.java.optionalPrograms;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import org.junit.Test;

public class Permutation {

	@Test
	public void test1() {
		String s1 = "ab";
		String s2 = "eidbaooo";
		assertTrue(checkChars(s1, s2));
	}

	@Test
	public void test2() {
		String s1 = "ab";
		String s2 = "eidboaoo";
		assertFalse(checkChars(s1, s2));
	}

	public boolean checkChars(String s1, String s2) {

		String s3 = "";
		for (char ch : s1.toCharArray()) {
			s3 = ch + s3;
		}

		return s2.contains(s3);

	}

}
