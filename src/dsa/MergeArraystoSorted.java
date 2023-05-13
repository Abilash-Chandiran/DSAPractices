package dsa;

import org.junit.Test;

public class MergeArraystoSorted {

	/*
	 * output - [1,2,3,5,7,8,9]
	 * 
	 * 
	 */

	@Test
	public void test01() {

		int arr01[] = { 1, 3, 5, 7, 9 };
		int arr02[] = { 2, 8 };
		mergeArrays(arr01, arr02);
	}

	public void mergeArrays(int arr01[], int arr02[]) {

		int newarr[] = new int[arr01.length + arr02.length];
		int len = arr01.length + arr02.length;

		System.arraycopy(arr01, 0, arr02, 5, 4);

	}

}
