package dsaWeek2Day3;

import java.util.Arrays;

import org.junit.Test;

import junit.framework.Assert;

public class SelectionSort {
	
	/**
	 * 
	 * 1.Set min to location 0
	 * 2.Search the min element in the list
	 * 3.Swap with value at location min
	 * 4.Increase min to point to next element
	 * 5.Repeat until list is sorted
	 * 
	 **/

	@Test
	public void test01() {

		int nums[] = { 11, 4, 17, 18, 2, 22, 1, 8 };
		int expnums[] = { 1, 2, 4, 8, 11, 17, 18, 22 };
		selectionSort(nums);
		Assert.assertTrue(Arrays.equals(nums, expnums));
	}

	public void selectionSort(int nums[]) {

		int temp = 0;

		for (int i = 0; i < nums.length; i++) {

			int minloc = i;
			for (int j = i + 1; j < nums.length; j++) {

				if (nums[j] < nums[minloc])
					minloc = j;
			}

			/*
			 * temp = nums[i]; nums[i] = nums[minloc]; nums[minloc] = temp;
			 */
			
			nums[minloc] = (nums[minloc]+nums[i])-(nums[i]=nums[minloc]);
		}
		return;
	}
}
