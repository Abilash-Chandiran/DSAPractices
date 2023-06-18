package main.java.mandatoryHomeWork.week5.day4;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class FinalValueOfVariableAfterPerformingOperations {
	@Test
	public void test1() {
		String[] operations = { "--X", "X--", "X--" };
		operations_value(operations);
		assertEquals(operations_value(operations), -3);
	}

	@Test
	public void test2() {
		String[] operations = { "--X", "X++", "X--", "++X" };
		operations_value(operations);
		assertEquals(operations_value(operations), 0);
	}

	@Test
	public void test3() {
		String[] operations = {};
		operations_value(operations);
		assertEquals(operations_value(operations), 0);
	}

	private int operations_value(String[] operations) {
		int x = 0;
		for (String operation : operations) {
			int a = operation.charAt(1);
			x = x + (44 - a);
		}
		return x;
	}

}