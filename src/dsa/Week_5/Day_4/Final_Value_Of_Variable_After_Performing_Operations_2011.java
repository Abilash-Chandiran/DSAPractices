package dsa.Week_5.Day_4;

import org.junit.Assert;
import org.junit.Test;

/*
Constrain - Don't use equals method.

- Iterate the String[] using for each
- ASCII value of "+" is 43 & "-" is 45
- To get ASCII value use operation.charAt(1)and store in integer. 
- Index value "+" or "-"
- Add the sum value with the previous sum
- Return the sum
*/

public class Final_Value_Of_Variable_After_Performing_Operations_2011 {
	@Test
	public void data_01() {
		String[] operations = { "--X", "X--", "X--" };
		operations_value(operations);
		Assert.assertEquals(operations_value(operations), -3);
	}

	@Test
	public void data_02() {
		String[] operations = { "--X", "X++", "X--", "++X" };
		operations_value(operations);
		Assert.assertEquals(operations_value(operations), 0);
	}

	@Test
	public void data_03() {
		String[] operations = {};
		operations_value(operations);
		Assert.assertEquals(operations_value(operations), 0);
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

//Space complexity = O(1)
//Time complexity = O(n)