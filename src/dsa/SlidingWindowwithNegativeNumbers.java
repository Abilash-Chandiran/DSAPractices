package dsa;

import java.util.HashMap;
import java.util.Map;

import org.junit.Test;

/**
 * 
 * Given an array with +ve and -ve nos, print the consecutive elements that add
 * up to a given sum
 *
 */
public class SlidingWindowwithNegativeNumbers {

	@Test
	public void test01() {
		int arr[] = { 10, 15, -5, 15, -10, 0 };
		int desNum = 5;
		findDesiredNum(arr, desNum);

	}

	// Brute force
	/*
	 * public void findDesiredNum(int arr[], int desNum) {
	 * 
	 * int sum = 0; for (int i = 0; i < arr.length; i++) { sum = arr[i]; if (sum ==
	 * desNum) { System.out.println("Outer loop" + sum); return; } for (int j = i +
	 * 1; j < arr.length; j++) { sum += arr[j]; if (sum == desNum) {
	 * System.out.println("Index : " + "i-" + i + " " + "j-" + j);
	 * System.out.println("Inner loop : " + sum); return; } } }
	 * 
	 * }
	 */

	public void findDesiredNum(int arr[], int desNum) {

		Map<Integer, Integer> hm = new HashMap<Integer, Integer>();
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			sum += arr[i];
			if (sum == desNum) {
				printArr(arr, sum, i);
				return;
			}
			if (hm.containsKey(sum-desNum)) {
				printArr(arr, hm.get(sum-desNum)+1, i);
				break;
			}
			hm.put(sum, i);
		}
	}

	private void printArr(int arr[], int start, int end) {
		for (int i = start; i <= end; i++) {
			System.out.print(arr[i]+ " ,");
		}
	}

}
