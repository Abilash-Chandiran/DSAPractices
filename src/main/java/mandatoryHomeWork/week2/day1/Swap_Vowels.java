package main.java.mandatoryHomeWork.week2.day1;

import org.junit.Assert;
import org.junit.Test;

public class Swap_Vowels {
	@Test
	public void testdata_1() {
		String s = "hello";
		vowels_swap(s);
		Assert.assertEquals(vowels_swap(s), "holle");
	}

	private String vowels_swap(String s) {
		int left = 0, right = s.length() - 1;
		char[] a = s.toCharArray();
		while (left < right) {
			if (isVowel(a[left]) && isVowel(a[right])) {
				char temp = a[left];
				a[left++] = a[right];
				a[right--] = temp;
			}
			if (!isVowel(a[left]))
				left++;
			if (!isVowel(a[right]))
				right--;
		}
		return new String(a);
	}

	private boolean isVowel(char c) {
		if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' || c == 'A' || c == 'E' || c == 'I' || c == 'O'
				|| c == 'U')
			return true;
		return false;

	}
}
