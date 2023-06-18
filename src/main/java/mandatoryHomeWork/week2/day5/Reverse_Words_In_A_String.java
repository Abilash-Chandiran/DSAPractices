package main.java.mandatoryHomeWork.week2.day5;

import org.junit.Test;

public class Reverse_Words_In_A_String {

	@Test
	public void testdata_01() {
		String s = "Let's take LeetCode contest";
		reverse_word(s);
	}

	@Test
	public void testdata_02() {
	}

	@Test
	public void testdata_03() {
	}

	private void reverse_word(String s) {

		for (String a : s.split(" ")) {
			int left = 0, right = a.length() - 1;
			char[] ch = a.toCharArray();
			while (left < right) {
				char temp = ch[left];
				ch[left++] = ch[right];
				ch[right--] = temp;
			}
			System.out.println(String.valueOf(ch));
		}
	}
}
