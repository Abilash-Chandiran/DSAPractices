package main.java.optionalPrograms;

import java.util.Arrays;

public class MinimumSubArray {

	public static void main(String[] args) {

		int[] arr = { 10, 4, 2, 5, 6, 3, 8, 1 };
		int k = 3;
		minimumSubArray(arr, k);
	}

	public static void minimumSubArray(int[] arr, int k) {

		int windowsum = 0;
		int minwindow = Integer.MAX_VALUE;
		int last = 0;
		int subArr[] = new int[2];

		for (int i = 0; i < arr.length; i++) { //0,1,2,
			windowsum = windowsum + arr[i]; //10,14,16,
			if (i + 1 >= k) {
				if (minwindow > windowsum) {
					minwindow = windowsum; //16, 
					last = i; //2
				}
				windowsum = windowsum - arr[i + 1 - k]; //16 - 10 => 6
			}
		}

		subArr[0] = last - k + 1; //-4,-4,-2
		subArr[1] = last; //0,0,2
		System.out.printf("The minimum sum subarray is " + Arrays.toString(subArr));
	}

}
