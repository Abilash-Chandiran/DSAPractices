package main.java.mandatoryHomeWork.week2.day1;

import java.util.Arrays;

import org.junit.Test;

public class Zero_To_Right {

	@Test
	public void testdata_2() {
		int[] nums = { 0 };
		move_zero(nums);
	}

	@Test
	public void testdata_3() {
		int[] nums = { 0, 0, 0, 0, 2, 5, 6 };
		move_zero(nums);
	}

	@Test
	public void testdata_4() {
		int[] nums = {};
		move_zero(nums);
	}

	@Test
	public void testdata_1() {
		int[] nums = { 1, 1, 0, 3, 0, 14, 9, 0, 7 };
		move_zero(nums);
	}

	private void move_zero(int[] nums) {
		int left = 0, right = 0;
		while (right < nums.length) {

			if (nums[right] != 0) {

				int temp = nums[right];
				nums[right] = nums[left];
				nums[left] = temp;

				left++;

			}
			right++;
		}
		System.out.println(Arrays.toString(nums));
	}
}
