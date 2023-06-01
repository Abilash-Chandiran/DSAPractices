package dsa.Week_6.two_pointers;

import static org.junit.Assert.assertArrayEquals;

import java.util.Arrays;

import org.junit.Assert;
import org.junit.Test;

public class Three_Sum_15 {

	@Test
	public void test_01() {
		int[] nums = { 11, -15, 91, 22, -13, 10, -25, 12, 42, 19, 31, -17, 35, 44 };
		int target = 100;
		brute_Force(nums, target);
		assertArrayEquals(brute_Force(nums, target), new int[] { 2, 3, 4 });
	}

	private int[] brute_Force(int[] nums, int target) {
		int[] array = new int[3];
		for (int i = 0; i < nums.length - 2; i++)
			for (int j = i + 1; j < nums.length - 1; j++)
				for (int k = j + 1; k < nums.length - 1; k++)
					if ((nums[i] + nums[j] + nums[k]) == target) {
						array[0] = i;
						array[1] = j;
						array[2] = k;
					}
		return array;
	}
}

//Space complexity - O(n)
//Time complexity - O(n^3)