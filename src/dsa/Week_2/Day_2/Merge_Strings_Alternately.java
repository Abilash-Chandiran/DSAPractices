package dsa.Week_2.Day_2;

import org.junit.Test;

public class Merge_Strings_Alternately {
	
	
	
	@Test
	public void testdata_01() {

		String word1 = "abc", word2 = "pqr";
		merge_String(word1, word2);
	}

	public void testdata_02() {
		String word1 = "ab", word2 = "pqrs";
		merge_String(word1, word2);
	}

	public void testdata_03() {
		String word1 = "abcd", word2 = "pq";
		merge_String(word1, word2);
	}

	private void merge_String(String word1, String word2) {
		char[] w1 = word1.toCharArray();
		char[] w2 = word2.toCharArray();
		int left = 0, right = 0;
		String sum = "";
		while (left < word1.length() && right < word2.length()) {
			sum = sum + w1[left++] + w2[right++];
		}
		if (word2.length() > word1.length()) {
			sum = sum + word2.substring(right, word2.length());
		} else if (word1.length() > word2.length()) {
			sum = sum + word1.substring(left, word1.length());
		}
		System.out.println(sum);
	}
}

//Time complexity - O(n) 
//Space complexity - O(n)