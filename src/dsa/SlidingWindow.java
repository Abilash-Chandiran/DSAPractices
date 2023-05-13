package dsa;

import org.junit.Test;

public class SlidingWindow {

	@Test
	public void test01() {
		int nums[] = { 1, 5, 2, 3, 7, 1 };
		int k = 3;
		slidingWindow(nums, k);
	}

	public void slidingWindow(int nums[], int k) {

		int sum = 0;
		for (int i = 0; i < k; i++) {
			sum = sum + nums[i];
		}
		int sumMax = sum;
		for (int i = 1; i < nums.length - k; i++) {
			sumMax = sumMax - nums[i - 1] + nums[i + k - 1];
			if (sumMax > sum)
				sum = sumMax;
		}
		System.out.println(sumMax);
	}
}
