package main.java.mandatoryHomeWork.week4.day4;

import static org.junit.Assert.assertEquals;

import java.util.Stack;

import org.junit.Test;

public class MakeTheStringGreat {
	@Test
	public void test() {
		String s = "leEeetcode";
		assertEquals("leetcode", makeGood(s));

	}

	public static String makeGood(String s) {
		Stack<Character> stack = new Stack<Character>();
		for (int i = 0; i < s.length(); i++) {
			if ((!stack.isEmpty()) && Math.abs(stack.peek() - s.charAt(i)) == 32)
				stack.pop();
			else
				stack.push(s.charAt(i));
		}
		char res[] = new char[stack.size()];

		for (int i = res.length - 1; i >= 0; i--)
			res[i] = stack.pop();
		return new String(res);
	}

}
