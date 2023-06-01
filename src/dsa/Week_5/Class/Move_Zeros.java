package dsa.Week_5.Class;

import org.junit.Assert;
import org.junit.Test;

public class Move_Zeros {
	@Test
	public void data_01() {
		int[] nums = { 1, 1, 0, 3, 0, 12 };
		move_zeros(nums);
		Assert.assertArrayEquals(move_zeros(nums), new int[] { 1, 1, 3, 12, 0, 0 });
	}

	private int[] move_zeros(int[] nums) {
		int left = 0, right = 0;
		while (right < nums.length) {

			if (nums[right] != 0) {
				int temp = nums[left];
				nums[left++] = nums[right];
				nums[right] = temp;
			}
			right++;
		}
		return nums;
	}
}
