package main.java.mandatoryHomeWork.week3.day2;

import java.util.Arrays;

import org.junit.Assert;
import org.junit.Test;

public class Minimum_Absolute_Difference {

	@Test
	public void data_01() {

		int[] arr = { 3, 8, -10, 23, 19, -4, -14, 27 };
		sort_number(arr);
		Assert.assertEquals(sort_number(arr), 4);
	}

	private int sort_number(int[] arr) {
		int min = 0, dif = 0;
		for (int left = 0; left < arr.length; left++) {
			for (int right = left + 1; right < arr.length; right++) {
				if (arr[left] > arr[right]) {
					int temp = arr[left];
					arr[left] = arr[right];
					arr[right] = temp;
				}
			}
		}
		System.out.println(Arrays.toString(arr));

		for (int i = 1; i < arr.length; i++) {
			dif = arr[i - 1] - arr[i];
			System.out.println(dif);
			if (min > dif) {
				min = dif;
				
				System.out.println("["+arr[i - 1]+","+arr[i]+"]");
			}
		}
		return min;
	}

}
