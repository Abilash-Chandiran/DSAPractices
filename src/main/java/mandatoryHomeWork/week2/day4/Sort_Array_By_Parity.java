package main.java.mandatoryHomeWork.week2.day4;

import java.util.Arrays;

import org.junit.Assert;
import org.junit.Test;

public class Sort_Array_By_Parity {

	/*
	 * Given input = int[] nums And create to variable p1=0 & p2=0 And Iterate using
	 * while loop(p2<nums.length) When nums[p2]%2==0, move to the left And odd
	 * numbers to the right Then return the nums array
	 */

	@Test
	public void testdata_01() {
		int[] nums = { 3, 1, 2, 4 };
		even_odd(nums);
		Assert.assertArrayEquals(even_odd(nums), new int[] { 4, 2, 1, 3 });
	}

	@Test
	public void testdata_02() {
		int[] nums = { 0 };
		even_odd(nums);
	}

	@Test
	public void testdata_03() {
		int[] nums = { 38, 100, 0, 2, 434, 3233, 5000 };
		even_odd(nums);
	}

	private int[] even_odd(int[] nums) {
		int left = 0, right = nums.length - 1;
		while (left < right) {
			if (nums[left] % 2 == 0)
				left++;
			else {
				int temp = nums[left];
				nums[left] = nums[right];
				nums[right] = temp;
				right--;
			}
		}
		System.out.println(Arrays.toString(nums));
		return nums;
	}

}
