package dsa.Week_5.Day_5;

import org.junit.Test;

public class Split_a_String_in_Balanced_Strings {
	@Test
	public void test_01() {
		String word = "RLRRLLRLRL";
		split_string(word);
	}

	private void split_string(String word) {
		int left = 0, right = 1;
		char[] letter = word.toCharArray();
		while (right < word.length() - 1) {
			if (letter[left] == 'L' && letter[right] == 'R') {
				word.startsWith("R");
				System.out.println(word.startsWith("R"));
			}
			left++;
			right++;
		}
	}

}
