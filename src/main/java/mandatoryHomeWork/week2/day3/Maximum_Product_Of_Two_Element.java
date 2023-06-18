package main.java.mandatoryHomeWork.week2.day3;

import org.junit.Assert;
import org.junit.Test;

public class Maximum_Product_Of_Two_Element {

	/*
	 * Given I have an array input n ={ 3, 4, 5, 2 } And I create two pointers as
	 * left = 0 and right = 0 And I iterate using while loop condition
	 * (right<nums.length) When left as maximum value And swap the value to right
	 * Then return (n[last_index]-1)*(n[last_inde]-1)
	 */

	@Test
	public void test_data_01() {
		int[] nums = { 3, 4, 5, 2, 32, -7, 8 };
		maximum_product(nums);
		Assert.assertEquals(maximum_product(nums), 217);
	}

	public void test_data_02() {
		int[] nums = { 1, 5, 4, 5 };
		maximum_product(nums);
	}

	public void test_data_03() {
		int[] nums = { 3, 7 };
		maximum_product(nums);
	}

	private int maximum_product(int[] nums) {
		for (int left = 0; left < nums.length; left++) {
			for (int right = left; right < nums.length; right++) {
				if (nums[left] > nums[right]) {
					int temp = nums[left];
					nums[left] = nums[right];
					nums[right] = temp;
				}
			}

		}
		return ((nums[nums.length - 1]) - 1) * ((nums[nums.length - 2]) - 1);
	}
}

//Time complexity - O(m*n)
//Space complexity - O(n)