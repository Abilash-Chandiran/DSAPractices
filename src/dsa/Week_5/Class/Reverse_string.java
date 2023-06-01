package dsa.Week_5.Class;

import org.junit.Test;

public class Reverse_string {
	@Test
	public void data_01() {
		String s = "vigneshkumar tamilselvan";
		reverse(s);
	}

	@Test
	public void data_02() {
		String s = "";
		reverse(s);
	}

	@Test
	public void data_0() {
		String s = "   &$   $%&^    *fgh   jyu23456   ";
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
