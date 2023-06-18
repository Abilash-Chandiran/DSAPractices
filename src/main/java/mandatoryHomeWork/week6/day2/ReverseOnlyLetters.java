package main.java.mandatoryHomeWork.week6.day2;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class ReverseOnlyLetters {

	@Test
	public void test1() {
		String s = "ab-cd", output = "dc-ba";
		assertEquals(output, reverseLetters(s));
	}

	public String reverseLetters(String S) {
		StringBuilder sb = new StringBuilder(S);
		for (int i = 0, j = S.length() - 1; i < j;) {
			if (!Character.isLetter(sb.charAt(i))) {
				++i;
			} else if (!Character.isLetter(sb.charAt(j))) {
				--j;
			} else {
				sb.setCharAt(i, S.charAt(j));
				sb.setCharAt(j--, S.charAt(i++));
			}
		}
		return sb.toString();
	}
}
