package main.java.optionalPrograms;

import java.util.Iterator;
import java.util.LinkedHashMap;

/***
 * 
 * Given an array arr[] of size n, find the index of first repeating element
 * that repeats the maximum number of times. The index of its first occurrence
 * should be the smallest. Note:- The position you return should be according to
 * 1-based indexing. Input: arr[] = {1, 5, 3, 4, 3, 5, 6, 3, 4, 4} Output: 3
 *
 */

public class FirstIndexofMaxRepeatedNum {

	public static void main(String[] args) {

		int arr[] = { 1, 5, 7, 4, 7, 5, 6, 7, 4, 4 };
		int output = 3;
		System.out.println(repeatedFirstIndexValue(arr) == output);
	}

	public static int repeatedFirstIndexValue(int arr[]) {
		int maxCount = Integer.MIN_VALUE;
		int maxCountNumber = 0;

		//1st Prepare Linked HashMap and find max count
		LinkedHashMap<Integer, Integer> hm = new LinkedHashMap<>();
		for (int i : arr) {
			int count = hm.getOrDefault(i, 0) + 1;
			hm.put(i, count);
			if (count > maxCount)
				maxCount = count;
		}
		// 2nd loop - Iterate over LHM find the first number whose freq = maxcount
		Iterator<Integer> itr = hm.keySet().iterator();

		while (itr.hasNext()) {

			int key = itr.next();
			if (hm.get(key) == maxCount) {
				maxCountNumber = key;
				break;
			}
		}

		// 3rd loop Iterate over array and see the index of maxCountNumber
		int index = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == maxCountNumber) {
				index = i + 1;
				break;
			}
		}
		return index;
	}

}
