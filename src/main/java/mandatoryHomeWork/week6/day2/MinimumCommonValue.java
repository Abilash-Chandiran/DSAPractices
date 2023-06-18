package main.java.mandatoryHomeWork.week6.day2;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class MinimumCommonValue {

	@Test
	public void test1() {
		int[] nums1 = { 1, 2, 3 }, nums2 = { 2, 4 };
		int output = 2;
		assertEquals(output, getminCommon(nums1, nums2));
	}

	@Test
	public void test2() {
		int[] nums1 = { 1, 2, 3, 6 }, nums2 = { 2, 3, 4, 5 };
		int output = 2;
		assertEquals(output, getminCommon(nums1, nums2));
	}

	public int getminCommon(int[] nums1, int[] nums2) {
		int m = nums1.length, n = nums2.length;
		for (int i = 0, j = 0; i < m && j < n;) {
			if (nums1[i] == nums2[j]) {
				return nums1[i];
			}
			if (nums1[i] < nums2[j]) {
				++i;
			} else {
				++j;
			}
		}
		return -1;
	}

}
