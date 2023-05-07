package dsaWeek2Day3;

import java.util.Arrays;

import org.junit.Test;

import junit.framework.Assert;

public class BubbleSort {

	/**
	 * 
	 * 1.Set min to location 0 2.Search the min element in the list 3.Swap with
	 * value at location min 4.Increase min to point to next element 5.Repeat until
	 * list is sorted
	 * 
	 **/

	@Test
	public void test01() {

		int nums[] = { 11, 4, 17, 18, 2, 22, 1, 8 };
		int expnums[] = { 1, 2, 4, 8, 11, 17, 18, 22 };
		bubbleSort(nums);
		Assert.assertTrue(Arrays.equals(nums, expnums));
	}

	public void bubbleSort(int nums[]) {

		for (int i = 0; i < nums.length - 1; i++) {

			for (int j = 0; j < nums.length - 1; j++) {

				if (nums[j] > nums[j + 1]) {
					/*
					 * int temp = nums[j]; nums[j] = nums[j + 1]; nums[j + 1] = temp;
					 */
					 nums[j] = (nums[j] + nums[j+1]) - (nums[j+1] = nums[j]);
				}
			}
		}
	}
}
