package dsa;

import java.util.Arrays;

public class NextGreaterElement {
	public static void main(String[] args) {

		nextGreaterElement();
	}

	public static void nextGreaterElement() {
		int[] nums1 = { 4, 1, 2 };
		int[] nums2 = { 1, 3, 4, 2 };
		int[] output = new int[nums1.length];

		for (int i = 0; i < nums1.length; i++) {
			int max = 0;
			int count = 0;
			for (int j = 0; j < nums2.length; j++) {
				if (nums2[j] == nums1[i]) {
					count = 1;
				} else if (nums2[j] > nums1[i] && count == 1) {
					max = nums2[j];
					break;
				}
			}

			if (max > 0) {
				output[i] = max;
			} else
				output[i] = -1;

		}
		System.out.println(Arrays.toString(output));

	}
}