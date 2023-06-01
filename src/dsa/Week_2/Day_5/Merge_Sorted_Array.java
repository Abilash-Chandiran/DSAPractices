package dsa.Week_2.Day_5;

import java.util.Arrays;

import org.junit.Test;

public class Merge_Sorted_Array {

	/*
	 * Given num_1 and num_2 in non-decreasing order 
	 * And variable m & n to get
	 * length of corresponding arrays 
	 * And add num_1 and num_2 in array_3 using array copy method
	 * And sort the array_3 
	 * Then return the array_3
	 */

	@Test
	public void testdata_01() {
		int[] num_1 = { 1, 2, 3, 0, 0, 0 };
		int[] num_2 = { 2, 5, 6 };
		merge_array(num_1, num_2);
	}

	private int[] merge_array(int[] num_1, int[] num_2) {

		int m = num_1.length;
		int n = num_2.length;
		int[] array_3 = new int[num_1.length + num_2.length];

		System.arraycopy(num_1, 0, array_3, 0, m);
		System.arraycopy(num_2, 0, array_3, m, n);
		System.out.println(Arrays.toString(array_3));

		for (int i = 0; i < array_3.length; i++) {
			for (int j = i; j < array_3.length; j++) {
				if (array_3[i] > array_3[j]) {
					int temp = array_3[i];
					array_3[i] = array_3[j];
					array_3[j] = temp;
				}
			}
		}
		System.out.println(Arrays.toString(array_3));

		return array_3;

	}

}

//Time complexity - O(m*n) 
//Space complexity - O(1)