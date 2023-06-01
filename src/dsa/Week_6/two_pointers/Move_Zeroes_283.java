package dsa.Week_6.two_pointers;

import org.junit.Assert;
import org.junit.Test;

public class Move_Zeroes_283 {
	@Test
	public void test_01() {
		int[] nums = { 0, 1, 0, 3, 12 };
		move_zeros(nums);
		Assert.assertArrayEquals(move_zeros(nums), new int[] { 1, 3, 12, 0, 0 });
	}

	private int[] move_zeros(int[] nums) {
		int left = 0, right = 0;
		while (right < nums.length) {
			if (nums[right] != 0) {
				
				int temp = nums[left] ;
				nums[left] = nums[right];
				nums[right]= temp;
				
				left++;
			}
			right++;
		}
		return nums;
	}

}
