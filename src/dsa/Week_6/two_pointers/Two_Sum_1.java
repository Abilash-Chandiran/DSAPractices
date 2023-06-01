package dsa.Week_6.two_pointers;

import org.junit.Assert;
import org.junit.Test;

public class Two_Sum_1 {
	@Test
	public void test_01() {
		int[] nums = { 2, 7, 11, 15 };
		int target = 9;
		two_Sum(nums, target);
		Assert.assertArrayEquals(two_Sum(nums, target), new int[] { 0, 1 });
	}

	@Test
	public void test_02() {
		int[] nums = { 1, 2, 7, 8, 11, 15 };
		int target = 9;
		two_Sum(nums, target);
		Assert.assertArrayEquals(two_Sum(nums, target), new int[] { 1, 2 });
	}

	@Test
	public void test_03() {
		int[] nums = { -15, -11, -7, -3 };
		int target = -14;
		two_Sum(nums, target);
		Assert.assertArrayEquals(two_Sum(nums, target), new int[] { 2, 2 });
	}

	@Test
	public void test_04() {
		int[] nums = { 3, 7, 11, 15 };
		int target = 9;
		Assert.assertArrayEquals(two_Sum(nums, target), new int[] { 0, 0 });
	}

	@Test
	public void test_05() {
		int[] nums = { 3, 3, 3, 3, 3 };
		int target = 6;
		two_Sum(nums, target);
		Assert.assertArrayEquals(two_Sum(nums, target), new int[] { 2, 2 });
	}

	private int[] two_Sum(int[] nums, int target) {
		int left = 0, right = nums.length - 1;
		int[] new_array = new int[2];
		while (left <= right) {
			if (nums[left] + nums[right] == target) {
				new_array[0] = left;
				new_array[1] = right;
				left++;
				right--;
			} else if (nums[left] + nums[right] > target)
				right--;
			else if (nums[left] + nums[right] < target)
				left++;
		}
		return new_array;
	}

}

//Space complexity - O(n)
//Time complexity - O(n) 