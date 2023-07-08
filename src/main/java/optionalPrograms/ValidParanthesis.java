package main.java.optionalPrograms;

import java.util.Stack;
/*
 * if (c == '(' || c == '[' || c == '{')stack.push(c); if (c == ')' &&
 * !stack.isEmpty() && stack.peek() == '(')stack.pop(); if (c == ']' &&
 * !stack.isEmpty() && stack.peek() == '[')stack.pop(); if (c == '}' &&
 * !stack.isEmpty() && stack.peek() == '{')stack.pop();
 */

public class ValidParanthesis {

	public static void main(String[] args) {

		String s = "()";
		System.out.println(isValidParanthesis(s));
	}

	public static boolean isValidParanthesis(String s) {
		Stack<Character> stack = new Stack<>();
		for (char c : s.toCharArray()) {
			if (c == '(')
				stack.push(')');
			else if (c == '{')
				stack.push('}');
			else if (c == '[')
				stack.push(']');
			else if (stack.isEmpty() || stack.pop() != c)
				return false;

		}
		return stack.isEmpty();
	}

}
