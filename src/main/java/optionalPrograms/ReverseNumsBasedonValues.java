package main.java.optionalPrograms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.junit.Test;

public class ReverseNumsBasedonValues {

	@Test
	public void test() {

		List<Integer> ls = Arrays.asList(9, 8, 7, 6, 5, 4, 3, 2, 1, 0);

		List<List<Integer>> operations = Arrays.asList(Arrays.asList(0, 9), Arrays.asList(4, 5), Arrays.asList(3, 6),
				Arrays.asList(2, 7), Arrays.asList(1, 8), Arrays.asList(0, 9));
		/*
		 * List<List<Integer>> operations = new ArrayList<>(); List<Integer> operation1
		 * = Arrays.asList(0, 9); List<Integer> operation2 = Arrays.asList(4, 5);
		 * List<Integer> operation3 = Arrays.asList(3, 6); List<Integer> operation4 =
		 * Arrays.asList(2, 7); List<Integer> operation5 = Arrays.asList(1, 8);
		 * List<Integer> operation6 = Arrays.asList(0, 9); operations.add(operation1);
		 * operations.add(operation2); operations.add(operation3);
		 * operations.add(operation4); operations.add(operation5);
		 * operations.add(operation6);
		 */

		reverseNumsBasedonValues(ls, operations);
	}

	public void reverseNumsBasedonValues(List<Integer> ls, List<List<Integer>> operations) {

		System.out.println(operations);
		System.out.println(ls);
		int left = 0, right = ls.size();
		int start = operations.get(1).get(1), end = operations.get(1).get(1);
		Collections.reverse(ls);
		System.out.println(ls);

		while (left <= right) {
			if (ls.get(left) == start && ls.get(right - 1) == end) {
				System.out.println("Test - 1");
				int temp = ls.get(left);
				ls.set(ls.indexOf(left), ls.get(right - 1));
				ls.set(ls.indexOf(right), temp);
				left++;
				right--;
			} else if (ls.get(left) != start) {
				left++;
			} else if (ls.get(right - 1) != end) {
				right--;
			}
		}

		System.out.println(ls);

	}

}
