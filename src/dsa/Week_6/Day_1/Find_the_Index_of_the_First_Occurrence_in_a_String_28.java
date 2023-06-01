package dsa.Week_6.Day_1;

import org.junit.Assert;
import org.junit.Test;

public class Find_the_Index_of_the_First_Occurrence_in_a_String_28 {

	@Test
	public void test_01() {
		String haystack = "dadbutsad", needle = "sad";
		sliding_Window(haystack, needle);
		brute_force(haystack, needle);
		Assert.assertEquals(brute_force(haystack, needle), 6);
		Assert.assertEquals(sliding_Window(haystack, needle), 6);
	}

	@Test
	public void test_02() {
		String haystack = "sadbutsad", needle = "dad";
		sliding_Window(haystack, needle);
		brute_force(haystack, needle);
		Assert.assertEquals(brute_force(haystack, needle), -1);
		Assert.assertEquals(sliding_Window(haystack, needle), -1);
	}

	@Test
	public void test_03() {
		String haystack = "bbbbbbbbb", needle = "b";
		sliding_Window(haystack, needle);
		brute_force(haystack, needle);
		Assert.assertEquals(brute_force(haystack, needle), 0);
		Assert.assertEquals(sliding_Window(haystack, needle), 0);
	}

	@Test
	public void test_04() {
		String haystack = "a", needle = "bat";
		sliding_Window(haystack, needle);
		brute_force(haystack, needle);
		Assert.assertEquals(brute_force(haystack, needle), -1);
		Assert.assertEquals(sliding_Window(haystack, needle), -1);
	}

	@Test
	public void test_05() {
		String haystack = "art", needle = "";
		sliding_Window(haystack, needle);
		brute_force(haystack, needle);
		Assert.assertEquals(brute_force(haystack, needle), -1);
		Assert.assertEquals(sliding_Window(haystack, needle), -1);
	}

	private int brute_force(String haystack, String needle) {
		int index = -1;
		if (needle.length() == 0)
			index = -1;
		else if (haystack.contains(needle))
			index = haystack.indexOf(needle);
		return index;
	}

	private int sliding_Window(String haystack, String needle) {
		int left = 0, right = 0, k = needle.length(), index = 0;
		char[] input = haystack.toCharArray();
		String output = "";
		if (needle.length() == 0)
			index = -1;
		else {
			while (right < k)
				output = output + input[right++];
			if (output.equals(needle))
				index = left;

			while (right < haystack.length()) {
				left++;
				right++;
				if (haystack.substring(left, right).equals(needle)) {
					index = left;
					break;
				}
			}
		}
		return index;
	}
}
//Brute force
//Time complexity - O(1)
//Space complexity - O(1)

//Sliding window
//Time complexity - O(n)
//Space complexity - O(1)
