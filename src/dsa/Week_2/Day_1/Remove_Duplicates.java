package dsa.Week_2.Day_1;

import org.junit.Assert;
import org.junit.Test;

public class Remove_Duplicates {
	@Test
	public void testdata_1() {
		int[] nums = { -2, -1, -1, 0, 1, 2 };
		unique_numbes(nums);
		Assert.assertEquals(unique_numbes(nums), 5);
	}

	@Test
	public void testdata_2() {
		int[] nums = { 0, 0, 1, 1, 1, 2, 2, 3, 3, 4 };
		Assert.assertEquals(unique_numbes(nums), 5);
	}

	@Test
	public void testdata_3() {
		int[] nums = {};
		Assert.assertEquals(unique_numbes(nums), 0);
	}

	private int unique_numbes(int[] nums) {
		int count = 1;
		if (nums.length == 0) {
			return count = 0;
		} else {

			for (int i = 1; i < nums.length; i++) {
				if (nums[i] != nums[i - 1]) {
					count++;
				}
			}
		}
		return count;

	}
}

//Time complexity - O(n) 
//Space complexity - O(1)