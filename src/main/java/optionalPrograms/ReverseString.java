package main.java.optionalPrograms;

import org.junit.Test;

public class ReverseString {
	@Test
	public void test1() {
		String s = "Testing";
		reverse(s);
	}

	@Test
	public void test2() {
		String s = "   &$   $%&^    *fnj   jyuik356   ";
		reverse(s);
	}

	private void reverse(String s) {
		int left = 0, right = s.length() - 1;
		char[] c = s.toCharArray();
		while (left < right) {
			char temp = c[left];
			c[left++] = c[right];
			c[right--] = temp;
		}
		System.out.println(String.valueOf(c));
	}

}
