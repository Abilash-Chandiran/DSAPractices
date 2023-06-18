package main.java.mandatoryHomeWork.week4.day1;

import static org.junit.Assert.assertEquals;

import java.util.Stack;

import org.junit.Test;

public class BaseballGame {

	@Test
	public void test() {

		String ops[] = { "5", "2", "C", "D", "+" };
		int output = 30;
		assertEquals(output, calPoints(ops));
	}

	public int calPoints(String[] ops) {
		Stack<Integer> stack = new Stack<>();
		for (String op : ops) {
			switch (op) {
			case "+":
				int x = stack.pop();
				int y = stack.pop();
				stack.push(y);
				stack.push(x);
				stack.push(x + y);
				break;
			case "D":
				stack.push(stack.peek() * 2);
				break;
			case "C":
				stack.pop();
				break;
			default:
				stack.push(Integer.valueOf(op));
			}
		}

		int sum = 0;
		while (!stack.isEmpty()) {
			sum += stack.pop();
		}
		return sum;
	}

}
