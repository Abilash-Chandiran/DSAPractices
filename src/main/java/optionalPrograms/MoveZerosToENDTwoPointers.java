package main.java.optionalPrograms;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;

import org.junit.Test;

public class MoveZerosToENDTwoPointers {

	@Test
	public void test() {

		int nums[] = { 0, 1, 0, 3, 12 };
		moveZerosToEnd(nums);
		assertEquals("1,3,12,0,0", nums);

	}

	public void moveZerosToEnd(int nums[]) {

		int start = 0, end = 0;

		while (end < nums.length) {

			if (nums[end] != 0) {
				
				int temp = nums[end];
				nums[end] = nums[start];
				nums[start] = temp;
				
				start++;
			}
			end++;
		}
	}
}
