package main.java.mandatoryHomeWork.week3.day2; //75% Done

import org.junit.Test;

public class Minimum_Recolors {
	@Test
	public void data_01() {
		String blocks = "WBBWWBBWBW";
		int k = 7;
		minimum_colors(blocks, k);
	}

	public String minimum_colors(String blocks, int k) {
		int left = 0;
		int right = 0;
		String s = "";
		char[] c = blocks.toCharArray();
		while (right < k) {
			s = s + c[right];
			right++;
		}
		System.out.println(s);
		while (right < blocks.length()) {
			left++;
			right++;
			s = blocks.substring(left, right);
			System.out.println(s);
		}
		return s;
	}

}