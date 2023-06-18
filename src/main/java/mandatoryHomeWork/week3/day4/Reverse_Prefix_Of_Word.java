package main.java.mandatoryHomeWork.week3.day4;

import org.junit.Assert;
import org.junit.Test;

public class Reverse_Prefix_Of_Word {

	/*
	 * Step-1 String word and character Step-2 Find the length of the string Step-3
	 * Use while condition to iterate step-4 check the character available in the
	 * string step-5 If exist, use substring method step-6 Find the index and
	 * reverse the string
	 */

	// @Test
	public void test_data_02() {
		String word = "xyxzxe", ch = "z";
		reverse_Word(word, ch);
	}

	// @Test
	public void test_data_03() {
		String word = "abcd", ch = "z";
		reverse_Word(word, ch);
	}

	// @Test
	public void test_data_04() {
		String word = "", ch = "a";
		reverse_Word(word, ch);
	}

	@Test
	public void test_data_01() {
		String word = "abcdefd", ch = "d";
		reverse_Word(word, ch);
		Assert.assertEquals(reverse_Word(word, ch), "dcbaefd");
	}

	private String reverse_Word(String word, String ch) {
		int left = 0;
		int right = word.indexOf(ch);
		char[] c = word.toCharArray();
		while (left < right) {
			char temp = c[left];
			c[left++] = c[right];
			c[right--] = temp;		
		}
		System.out.println(c);
		return new String(c);
	}
}
