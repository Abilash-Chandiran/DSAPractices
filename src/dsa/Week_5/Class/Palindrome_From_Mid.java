package dsa.Week_5.Class;

import org.junit.Test;

public class Palindrome_From_Mid {
	@Test
	public void data_01() {
		String s = "Testing";
		palindrome(s);

	}

	private void palindrome(String s) {
		int left = s.length() / 2, right = s.length() / 2;
		System.out.println(left);
		System.out.println(right);
		char[] c = s.toCharArray();
		while ((0 <= left) && (right >= s.length() - 1)) {
			System.out.println(c[right]);
			System.out.println(c[left]);
			if (c[left] == c[right]) {
				left--;
				right--;
			}
			break;
		}
		// System.out.println(String.valueOf(c));
	}
}
