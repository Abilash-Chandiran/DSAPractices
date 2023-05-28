package dsa;

import org.junit.Test;

public class PalindromCheckUsingTwoPointers {

	@Test
	public void test01() {
		String s = "abcd";
		palindromeCheck(s);
	}

	public void palindromeCheck(String s) {

		int start = 0, end = 0;
		char[] ch = s.toCharArray();
		if (ch.length % 2 == 0) {
			System.out.println("Even-The middle elements are: ");
			// even-length array (two middle elements)
			int x = ch[(ch.length / 2) - 1];
			System.out.println(x);
			int y = ch[ch.length / 2];
			System.out.println(y);
		}

		// if odd number of array elements are present
		else {

			// odd-length array (only one middle element)
			int z = ch[ch.length / 2];
			System.out.println("Odd-The middle elements is: ");
			System.out.println(z);
		}
	}

}
