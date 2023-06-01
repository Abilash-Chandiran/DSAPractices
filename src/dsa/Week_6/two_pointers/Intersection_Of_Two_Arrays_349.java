package dsa.Week_6.two_pointers;

import java.util.Arrays;
import java.util.HashSet;
import org.junit.Test;

public class Intersection_Of_Two_Arrays_349 {

	@Test
	public void test_01() {
		int[] nums1 = { 3, 4, 4, 9, 9, 5 }, nums2 = { 9 };
		common_value(nums1, nums2);
	}

	@Test
	public void test_02() {
		int[] nums1 = { 1, 2, 3 }, nums2 = { 2, 4 };
		common_value(nums1, nums2);
	}

	@Test
	public void test_03() {
		int[] nums1 = { 1, 2, 3 }, nums2 = { 4, 5 };
		common_value(nums1, nums2);
	}

	@Test
	public void test_04() {
		int[] nums1 = { 1, 2, 3 }, nums2 = { 3, 4, 5 };
		common_value(nums1, nums2);
	}

	@Test
	public void test_05() {
		int[] nums1 = { 1, 2, 3 }, nums2 = { 3 };
		common_value(nums1, nums2);
	}

	private int[] common_value(int[] nums1, int[] nums2) {
		int left = 0, right = 0, index = 0;
		int[] new_array = new int[nums1.length];
		while (left < nums1.length && right < nums2.length) {
			if (nums1[left] == nums2[right]) {
				new_array[index] = nums1[left];
				index++;
			} else if (nums1[left] < nums2[right])
				left++;
			else if (nums1[left] > nums2[right])
				right++;
		}
		System.out.println(Arrays.toString(new_array));
		return new_array;

	}
}
