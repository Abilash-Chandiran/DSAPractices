package dsa.Week_6.two_pointers;

import java.util.Arrays;

import org.junit.Assert;
import org.junit.Test;

public class Squares_of_A_Sorted_Array_977 {
	@Test
	public void test_01() {
		int[] nums = { 4, -1, 0, 3, 10 };
		//Squares_sorted(nums);
		// System.out.println(Arrays.toString(Squares_sorted(nums)));
		Assert.assertArrayEquals(Squares_sorted(nums), new int[] { 0, 1, 9, 16, 100 });
	}

	private int[] Squares_sorted(int[] nums) {
		int pointer = 0;
		while (pointer < nums.length) {
			nums[pointer] = (nums[pointer] * nums[pointer]);
			pointer++;
		}
		
		//O(n)

		for (int left = 0; left < nums.length; left++) {
			for (int right = left + 1; right < nums.length; right++) {
				if (nums[left] > nums[right]) {
					int temp = nums[left];
					nums[left] = nums[right];
					nums[right] = temp;
				}
			}

		}
		
		//O(n^2)
		System.out.println(Arrays.toString(nums));
		return nums;
	}
}