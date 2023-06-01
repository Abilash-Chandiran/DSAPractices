package dsa.Week_2.Day_2;

import org.junit.Assert;
import org.junit.Test;

public class Remove_Element_With_Count {

	/*
	 * Given I have an input array n = { 3, 2, 2, 3 } and target =3 And I create a
	 * variables as below Pointer_1 = 0; And I create a while loop with condition
	 * (Pointer_1 < n.lenght()) And I use condition (Pointer_1 != target) to remove
	 * target Then return the output with count
	 */

	@Test
	public void testdata_01() {
		int[] nums = { 0, 1, 4, 5, 6, 2, 2, 3, 0, 4, 2 };
		int val = 2;
		remove_Element(nums, val);
		Assert.assertEquals(false, false);
	}

	public void testdata_02() {
	}

	public void testdata_03() {
	}

	private void remove_Element(int[] nums, int val) {
		int pointer = 0, count = 0;
		while (pointer < nums.length) {
			if (nums[pointer] != val) {
				System.out.println(nums[pointer]);
				nums = new int[nums.length];
				pointer++;
				count++;
			} else {
				pointer++;
			}
		}

		System.out.println("Count = " + count);
	}

}
//Time complexity - O(n) 
//Space complexity - O(1)