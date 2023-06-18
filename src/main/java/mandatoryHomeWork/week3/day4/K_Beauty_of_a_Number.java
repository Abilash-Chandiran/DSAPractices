package main.java.mandatoryHomeWork.week3.day4;

import org.junit.Test;

public class K_Beauty_of_a_Number {
	@Test
	public void data_01() {
		String num = "430043";
		int k = 2;
		number_Sub_Array(num, k);
	}

	private void number_Sub_Array(String num, int k) {
		int left = 0;
		int right = 0;
		String s = "";
		char[] c = num.toCharArray();
		while (right < k) {
			s = s + c[right];
			right++;
		}

		System.out.println(s + " is a divisor = " + is_divisor(num, s));

		while (right < num.length()) {
			left = left + 1;
			right = right + 1;
			s = num.substring(left, right);
			System.out.println(s + " is a divisor = " + is_divisor(num, s));
		}

	}

	private boolean is_divisor(String num, String s) {
		int value_1 = Integer.parseInt(num);
		int value_2 = Integer.parseInt(s);
		boolean is_divisor = false;
		if (value_2 == 0)
			return false;
		if (value_1 % value_2 == 0)
			is_divisor = true;
		return is_divisor;
	}
}
