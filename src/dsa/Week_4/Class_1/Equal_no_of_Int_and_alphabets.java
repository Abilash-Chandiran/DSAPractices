package dsa.Week_4.Class_1;

import org.junit.Assert;
import org.junit.Test;

public class Equal_no_of_Int_and_alphabets {
	@Test
	public void data_01() {
		char[] arr = { 1, 2, 3, 'a', 'b', 'c' };
		order_elements(arr);
		// Assert.assertArrayEquals(order_elements(arr), null);
	}

	private void order_elements(char[] arr) {
		for (char i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
			System.out.println(arr[1]);
		}

	}
}
