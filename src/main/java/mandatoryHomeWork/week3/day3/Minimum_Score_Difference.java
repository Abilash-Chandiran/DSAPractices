package main.java.mandatoryHomeWork.week3.day3;

import java.util.Arrays;

import org.junit.Test;

public class Minimum_Score_Difference {
	@Test
	public void data_01() {
		int[] score = { 12, 45, 2, 0, 4, 56, 23, 89, 27 };
		int k = 3;
		minimum_score(score, k);
		System.out.println(minimum_score(score, k));
	}

	private int minimum_score(int[] score, int k) {
		Arrays.sort(score);

		int left = 0, right = 0, dif = 0, min = Integer.MAX_VALUE;
		while (right < k) {
			min = Math.min(score[1] - score[0], min);
			right++;
		}

		while (right < score.length) {
			left++;
			dif = score[right - 1] - score[left];
			min = Math.min(dif, min);
			right++;
		}

		return min;
	}

}

//Time complexity - O(n)
//Space complexity - O(1)
