package main.java.mandatoryHomeWork.week3.day5;

import java.util.HashMap;
import org.junit.Assert;
import org.junit.Test;

public class Majority_Element {
	@Test
	public void data_01() {
		int[] nums = { 3, 2, 3, 3, 4, 5, -5 };
		majority_number(nums);
		Assert.assertEquals(majority_number(nums), 3);
	}

	private int majority_number(int[] nums) {
		int max = 0;
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		for (int n : nums) {
			if (map.containsKey(n))
				map.put(n, map.get(n) + 1);
			else
				map.put(n, 1);
		}
		System.out.println(map);

		for (int i : map.values()) {

			max = Math.max(max, i);

		}
		System.out.println(max);

		return max;
	}
}

//Time complexity = O(2n) 
//Space complexity = O(1)