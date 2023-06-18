package main.java.mandatoryHomeWork.week3.day3;

import org.junit.Test;

public class Search_Insert_Position {
	@Test
	public void data_01() {
		int[] nums = { 1, 2, 4, 5, 6, 8 };
		int target = 3;
		// insert_Position(nums, target);
		System.out.println(insert_Position(nums, target));
	}

	private int insert_Position(int[] nums, int target) {
		int left = 0, right = nums.length - 1;
		while (left <= right) {
			int mid = (right + left) / 2;
			if (nums[mid] == target) {
				System.out.println(mid);
				return mid;
			} else if (nums[mid] > target) {
				right = mid - 1;

			} else {
				left = mid + 1;
			}
		}
		return left;
	}
}

//Time complexity - O(log n)
//Space complexity - O(1)