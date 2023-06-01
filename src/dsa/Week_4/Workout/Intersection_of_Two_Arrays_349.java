package dsa.Week_4.Workout;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import org.junit.Test;

public class Intersection_of_Two_Arrays_349 {
	@Test
	public void data_01() {
		int[] nums1 = { 1, 2, 2, 1, 3 };
		int[] nums2 = { 2, 2, 3 };
		intersecting_array(nums1, nums2);
		System.out.println(intersecting_array(nums1, nums2));
		//assertEquals(intersecting_array(nums1, nums2),[1,2]);
	}

	private Set<Integer> intersecting_array(int[] nums1, int[] nums2) {
		Arrays.sort(nums1);
		Arrays.sort(nums2);
		int left = 0, right = 0;
		Set<Integer> set = new HashSet<Integer>();
		if (nums1.length == 0 || nums2.length == 0) {
			return null;
		} else {
			while (left < nums1.length && right < nums2.length) {
				if (nums1[left] == nums2[right]) {
					set.add(nums1[left]);
					left++;
					right++;
				} else if (nums1[left] < nums2[right]) {
					left++;
				} else if (nums1[left] > nums2[right]) {
					right++;
				}
			}
		}
		System.out.println(set.getClass());
		return set;
	}
}
