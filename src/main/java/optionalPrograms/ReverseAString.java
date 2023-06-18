package main.java.optionalPrograms;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class ReverseAString {

	@Test
	public void test1() {
		String s = "Reverse";
		assertEquals("esreveR", stringReversing(s));
	}

	public String stringReversing(String s) {

		String str = "";
		for (char c : s.toCharArray()) {
			str = c + str;
		}
		return str;
	}

}
