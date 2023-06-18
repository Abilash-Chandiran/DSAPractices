package main.java.optionalPrograms;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class MinimumRecolorConsecutiveBlack {
	@Test
	public void test1() {
		String input = "WBBWWBBWBW";
		int k = 7;
		assertEquals(3, minimumRecolors(input, k));
	}

	@Test
	public void test2() {
		String input = "WBWBBBW";
		int k = 2;
		assertEquals(0, minimumRecolors(input, k));
	}

	public int minimumRecolors(String blocks, int k) {
		char[] strs = blocks.toCharArray();
		int n = blocks.length();
		int[] arr = new int[n];
		int[] pre_sum = new int[n + 1];
		for (int i = 0; i < n; i++) {
			if (strs[i] == 'W')
				arr[i] = 1;
		}

		for (int i = 0; i < n; i++)
			pre_sum[i + 1] = arr[i] + pre_sum[i];

		int min = n;
		for (int i = 0; i + k <= n; i++)
			min = Math.min(min, pre_sum[i + k] - pre_sum[i]);

		System.out.println(min);
		return min;
	}

}
