package main.java.mandatoryHomeWork.week5.day5;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class SplitAStringinasBalancedStrings {

	@Test
	public void test1() {
		String s = "RLRRLLRLRL";
		assertEquals(4, balancedStringSplit(s));
	}

	@Test
	public void test2() {
		String s = "RLRRRLLRLL";
		assertEquals(2, balancedStringSplit(s));
	}

	@Test
	public void test3() {
		String s = "LLLLRRRR";
		assertEquals(1, balancedStringSplit(s));
	}

	public int balancedStringSplit(String s) {
		int left = 0, right = 0;
		int counter = 0;
		for (char ch : s.toCharArray()) {
			if (ch == 'L')
				left++;
			else
				right++;

			if (left == right)
				counter++;
		}
		System.out.println(counter);
		return counter;
	}
}
