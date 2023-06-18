package main.java.optionalPrograms;

import org.junit.Test;

/****
 * 
 * Given an array of positive integers, find the subarrays that adds up to the
 * given number (k)
 *
 */

public class findArraywithGivenSum {

	@Test
	public void test01() {
		int nums[] = { 1, 2, 3, 4, 5, 1 };
		int k = 7;
		slidingWindow(nums, k);
	}

	public void slidingWindow(int nums[], int k) {

		int sum = 0;
		for (int i = 0; i < nums.length; i++) {

			for (int j = i; j < nums.length; j++) {

				if (sum == k) {
					System.out.println("i : " + i + "j : " + j);
				}
				else if (sum > k) {
					break;
				}
				
				sum += nums[j];
				
			}
		}

	}
}
