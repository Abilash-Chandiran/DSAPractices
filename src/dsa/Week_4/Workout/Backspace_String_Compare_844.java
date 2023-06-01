package dsa.Week_4.Workout;

import org.junit.Assert;
import org.junit.Test;

public class Backspace_String_Compare_844 {

	@Test
	public void data_01() {
		String s = "ab#c";
		String t = "ad#c";
		string_compare(s, t);
		Assert.assertEquals(string_compare(s, t), "Madam");
	}

	private String string_compare(String s, String t) {
		int left = 0, right = 0;
		char[] c1 = s.toCharArray();
		char[] c2 = t.toCharArray();
		while (left < s.length() || right < t.length()) {
			if (c1[left] == '#' || c2[right] == '#') {
				
			}
		}
		return t;

	}
}
