package dsa.Week_6.Day_2;

import org.junit.Assert;
import org.junit.Test;

public class Minimum_Common_Value_2540 {

	@Test
	public void test_01() {
		int[] nums1 = { 1, 2, 3 }, nums2 = { 2, 4 };
		common_value(nums1, nums2);
		Assert.assertEquals(common_value(nums1, nums2), 2);
	}

	@Test
	public void test_02() {
		int[] nums1 = { 1, 2, 3 }, nums2 = { 4, 5 };
		common_value(nums1, nums2);
		Assert.assertEquals(common_value(nums1, nums2), -1);
	}

	@Test
	public void test_03() {
		int[] nums1 = { 1, 2, 3 }, nums2 = { 3, 4, 5 };
		common_value(nums1, nums2);
		Assert.assertEquals(common_value(nums1, nums2), 3);
	}

	@Test
	public void test_04() {
		int[] nums1 = { 1, 2, 3 }, nums2 = { 3 };
		common_value(nums1, nums2);
		Assert.assertEquals(common_value(nums1, nums2), 3);
	}

	private int common_value(int[] nums1, int[] nums2) {
		int left = 0, right = 0;
		while (left < nums1.length && right < nums2.length) {
			if (nums1[left] == nums2[right]) {
				return nums1[left];
			} else if (nums1[left] < nums2[right])
				left++;
			else if (nums1[left] > nums2[right])
				right++;
		}
		return -1;
	}

}

//Space complexity - O(1)
//Time complexity - O(n)