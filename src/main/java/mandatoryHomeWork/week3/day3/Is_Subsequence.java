package main.java.mandatoryHomeWork.week3.day3; //class program

import org.junit.Assert;
import org.junit.Test;

public class Is_Subsequence {
	@Test
	public void data_01() {
		String s = "abc", t = "ahbgdc";
		is_Present(s, t);
		Assert.assertEquals(s, is_Present(s, t));
	}

	private String is_Present(String s, String t) {
		int left = 0, right = 0;
		String result = "";
		while (right < t.length()) {
			if (s.charAt(left) == t.charAt(right)) {
				char c = t.charAt(right);
				result = result + c;
				left++;
			}
			right++;
		}
		return result;
	}
}

//Time complexity = O(n)
//Space complexity = O(1)