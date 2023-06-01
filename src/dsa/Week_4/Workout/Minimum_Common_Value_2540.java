package dsa.Week_4.Workout;

import org.junit.Assert;
import org.junit.Test;

public class Minimum_Common_Value_2540 {
	@Test
	public void data_01() {
		int[] nums1 = { 1, 2, 3 };
		int[] nums2 = { 5, 5, 6 };
		minimum_common_value(nums1, nums2);
		Assert.assertEquals(minimum_common_value(nums1, nums2), 2);
	}

	@Test
	public void data_02() {
		int[] nums1 = { 1, 2, 3 };
		int[] nums2 = {};
		minimum_common_value(nums1, nums2);
		Assert.assertEquals(minimum_common_value(nums1, nums2), 0);
	}

	private int minimum_common_value(int[] nums1, int[] nums2) {
		int left = 0, right = 0;
		if (nums1.length == 0 || nums2.length == 0) {
			return 0;
		} else {
			while (left < nums1.length && right < nums2.length) {
				if (nums1[left] == nums2[right]) {
					return nums1[left];
				} else if (nums1[left] < nums2[right]) {
					left++;
				} else if (nums1[left] > nums2[right]) {
					right++;
				}
			}
		}
		return nums1[left];
	}
}
