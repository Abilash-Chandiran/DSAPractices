package dsa;

import java.util.Arrays;

/***
 * 
 * keyword to use sliding window Continuous or Consecutive if it is not
 * consecutive then we need to sort it // op - -21, 1, 4, 12, 23, 27, 45, 56,
 * 66, 89
 */

public class FindMinValues {

	public static void main(String[] args) {

		int[] score = { 12, 45, 1, 4, 56, 23, 89, -21, 66, 27 };

		int k = 3;
		findMindiff(score, k);
	}

	private static void findMindiff(int score[], int k) {

		Arrays.sort(score);
		int left = 0, right = 0, min = Integer.MAX_VALUE, diff = 0;

		while (right < k) {
			diff = score[right + 1] - score[right];
			min = Math.min(min, Math.abs(diff));
			right++;
		}

		while (right < score.length) {
			left++;
			diff = score[left + 1] - score[left];
			min = Math.min(min, Math.abs(diff));
			right++;
		}
		System.out.println("Min value : " + min);

	}
}
