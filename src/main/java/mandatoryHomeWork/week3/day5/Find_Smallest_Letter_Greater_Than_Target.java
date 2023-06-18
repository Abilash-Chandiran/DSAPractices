package main.java.mandatoryHomeWork.week3.day5;

import java.util.HashSet;
import org.junit.Test;

public class Find_Smallest_Letter_Greater_Than_Target {
	@Test
	public void data_01() {
		String[] letters = { "c", "f", "j" };
		String target = "g";
		find_Greater_Letter(letters, target);
	}

	private void find_Greater_Letter(String[] letters, String target) {
		int min_value = Integer.MAX_VALUE;
		HashSet<Integer> set = new HashSet<Integer>();
		for (String s : letters)
			set.add((int) s.charAt(0));

		for (Integer a : set)
			if (a > (int) target.charAt(0))
				min_value = Math.min(min_value, a);

		System.out.println((char) min_value);
	}
}

//Time complexity - O(2n)
//Space complexity - O(n)
