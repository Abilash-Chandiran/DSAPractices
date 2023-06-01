package dsa.Week_4.Workout;

import org.junit.Assert;
import org.junit.Test;

/*
1 - Create 2 pointers left =0 & right = s.length()-1
2 - Change String s to char[] c
3 - Iterate using while(left<=right)
4 - Check if c[left] == c[right]
5 - if else 
*/

public class Valid_Palindrome_680 {
	@Test
	public void data_01() {
		String s = "abccbda";
		palindrome(s);
		Assert.assertEquals(palindrome(s), "Madam");
	}

	private boolean palindrome(String s) {
		int left = 0, right = s.length() - 1;
		char[] c = s.toCharArray();
		while (left <= right) {
			if (c[left] == c[right]) {
				System.out.println("left = " + c[left]);
				System.out.println("right = " + c[right]);
				left++;
				right--;
			} else if (c[left] != c[right]) {
				left++;
			} else if (c[right] != c[left]) {
				right--;
			}
		}
		return false;
	}

}
