package dsa;

import java.util.Arrays;

import org.junit.Test;

public class Sum_Of_Elements {
	@Test
	public void testdata_01() {
		int[] nums = { 10, 15, -5, -8, -2, 10, 5, -5, 3, 2 };
		int target = 5;
		sum_Of_Elements(nums, target);
	}

	private int[] sum_Of_Elements(int[] nums, int target) {
		int left = 0, right = nums.length - 1;

		Arrays.sort(nums);
		while (left < right) {
			if (nums[left] + nums[right] > target)
				right--;
			else if (nums[left] + nums[right] < target)
				left++;
			else if (nums[left] + nums[right] == target)
			left++;
			right--;
		}
		return new int[] { left, right };

	}

}
