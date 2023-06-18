package main.java.mandatoryHomeWork.week2.day1;

import org.junit.Assert;
import org.junit.Test;

public class Reverse_String {
	@Test
	public void testdata1() {
		String s = "Welcome   To Testleaf";
		Reveres(s);
		Assert.assertEquals(Reveres(s), "faeltseT oT   emocleW");
		System.out.println(Reveres(s));
	}

	private String Reveres(String s) {
		int left = 0, right = s.length() - 1;

		char[] ch = s.toCharArray();
		while (left < right) {
			char temp = ch[right];
			ch[right--] = ch[left];
			ch[left++] = temp;
		}

		return String.valueOf(ch);
	}

}

//Time complexity - O(n)
//Space complexity - O(1)