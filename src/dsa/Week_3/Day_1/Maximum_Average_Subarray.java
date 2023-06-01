package dsa.Week_3.Day_1; //completed

import org.junit.Assert;
import org.junit.Test;

public class Maximum_Average_Subarray {

	@SuppressWarnings("deprecation")
	@Test
	public void testdata_01() {
		int[] arr = { 1, 12, -5, -6, 50, 3 };
		int k = 4;
		maximum_average(arr, k);
		Assert.assertEquals(maximum_average(arr, k), 12.75);
	}

	private double maximum_average(int[] arr, int k) {
		int left = 0, right = 0;
		double max = 0;
		double sum = 0;
		while (right < k) {
			sum = sum + arr[right];
			right++;
		}
		max = Math.max(max, sum);
		while (right < arr.length) {
			sum = sum - arr[left++];
			sum = sum + arr[right++];
			max = Math.max(max, sum) / 4;
		}
		System.out.println(max);
		return max;
	}

}
