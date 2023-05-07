package dsaWeek2Day3;

import org.junit.Test;

import junit.framework.Assert;

public class FindNumberOfOnes {

	/**
	 * 
	 * Divide and conquer approach O(1) - Space complexity O(logn) - Time complexity
	 */

	@Test
	public void test01() {
		int nums[] = { 1, 1, 1, 1, 1, 1 };
		Assert.assertEquals(6, findOnes(nums));
	}

	@Test
	public void test02() {
		int nums[] = { 0, 0, 0, 0 };
		Assert.assertEquals(0, findOnes(nums));
	}

	@Test
	public void test03() {
		int nums[] = { 0, 0, 0, 0, 0, 1, 1, 1 };
		Assert.assertEquals(3, findOnes(nums));
	}

	@Test
	public void test04() {
		int nums[] = null;
		Assert.assertEquals(0, findOnes(nums));
	}

	public int findOnes(int nums[]) {

		if (nums == null || nums[nums.length - 1] == 0) {
			return 0;
		} else if (nums[0] == 1) {
			return nums.length;
		}
		
		int left = 0;
		int right = nums.length - 1;
		while (left <= right) {
			int mid = (left + right) / 2;
			if (nums[mid] == 0) {
				left = mid + 1;
			} else {
				right = mid - 1;
			}
		}
		return nums.length - left;
	}
}
