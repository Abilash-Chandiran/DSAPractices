package dsa.Week_5.Class;

import org.junit.Assert;
import org.junit.Test;

public class Max_Consecutive_Ones {
	@Test
	public void data_01() {
		int[] nums = { 1, 1, 0, 1, 1, 1, 0, 1, 1, 1, 1, 1 };
		consecutive_ones(nums);
		System.out.println(consecutive_ones(nums));
		Assert.assertEquals(consecutive_ones(nums), 5);

	}

	private int consecutive_ones(int[] nums) {
		int left = 0, right = 0, count = 0, max = Integer.MIN_VALUE;
		while (right < nums.length) {
			if (nums[right] == 1) {
				count++;
				right++;
				left = right;
			} else if (nums[right] == 0) {
				System.out.println("Every time count = " + count);
				max = Math.max(count, max);
				count = 0;
				right++;
			}

		}
		return max;
	}

}
