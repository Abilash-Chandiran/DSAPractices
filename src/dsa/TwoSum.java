package dsa;

import java.util.Arrays;
import org.junit.Test;

/***
 * 
 * nums[] = {2,7,11,15}
 * target = 9
 * Becuase nums[0] + nums[1] == 9, we return [0,1]
 *
 */

public class TwoSum {

	@Test
	public void test1() {
		int nums[] = { 2, 7, 11, 15 };
		int target = 9;
		int[] op = twoSum(nums, target);
		System.out.println(Arrays.toString(op));
	}

	@Test
	public void test2() {
		int nums[] = { 2, 11, 15, 7 };
		int target = 9;
		int[] op = twoSum(nums, target);
		System.out.println(Arrays.toString(op));
	}

	@Test
	public void test3() {
		int nums[] = {};
		int target = 9;
		int[] op = twoSum(nums, target);
		System.out.println(Arrays.toString(op));

	}

	@Test
	public void test4() {
		int nums[] = null;
		int target = 9;
		int[] op = twoSum(nums, target);
		System.out.println(Arrays.toString(op));

	}

	public int[] twoSum(int nums[], int target) {

		if (nums == null || nums.length == 0)
			return new int[] { -1, -1 };

		int left = 0;
		int right = nums.length - 1;
		while (left <= right) {
			if ((nums[left] + nums[right]) < target)
				left++;
			else if ((nums[left] + nums[right]) > target)
				right--;
			else
				return new int[] { left, right };

		}
		return new int[] { -1, -1 };

	}

}
