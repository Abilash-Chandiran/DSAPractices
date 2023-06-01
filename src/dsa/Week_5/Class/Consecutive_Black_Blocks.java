package dsa.Week_5.Class;

import org.junit.Test;

public class Consecutive_Black_Blocks {
	@Test
	public void test() {
		String input = "WBBWWBBWBW";
		int k = 7;
		black_box(input, k);
	}

	private void black_box(String input, int k) {
		int left = 0, right = 0, min = Integer.MAX_VALUE;
		char[] c = input.toCharArray();
		int count = 0;
		while (right < k) {
			if (c[right] == 'W') {
				count++;
			}
			right++;
		}
		min = Math.min(min, count);


		while (right <= input.length()) {
			left++;

			for (char a : input.substring(left, right).toCharArray())
				if (c[right] == 'W') {
					count++;
				}
			right++;

			min = Math.min(min, count);
		}

		System.out.println(min);
	}

}
