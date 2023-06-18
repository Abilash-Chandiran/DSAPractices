package main.java.optionalPrograms;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class MaxConsecutiveOnes {

	@Test
	public void test() {

		int[] arr = { 1, 1, 0, 1, 1, 1 };
		assertEquals(3, maxConsecutiveValue(arr));
	}
	
	@Test
	public void test2() {

		int[] arr = { 1,0,1,1,0,1 };
		assertEquals(2, maxConsecutiveValue(arr));
	}

	public int maxConsecutiveValue(int[] arr) {

		int countOnes = 0;
		for (int a : arr) {
			if (a == 0)
				countOnes = 0;
			else
				countOnes++;
		}
		
		return countOnes;
	}
}
