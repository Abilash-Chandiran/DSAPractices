package dsa.Week_6.two_pointers;

import org.junit.Assert;
import org.junit.Test;

public class Assign_Cookies_455 {
	@Test
	public void test_01() {
		int[] g = { 1, 3, 2 }, s = { 1, 2, 1 };
		assign_Cookies(g, s);
		Assert.assertEquals(assign_Cookies(g, s), 2);
	}

	@Test
	public void test_02() {
		int[] g = { 1, 3, 2 }, s = { 1, 3, 1 };
		assign_Cookies(g, s);
		Assert.assertEquals(assign_Cookies(g, s), 3);
	}

	@Test
	public void test_03() {
		int[] g = { 1, 3, 2 }, s = {};
		assign_Cookies(g, s);
		Assert.assertEquals(assign_Cookies(g, s), 0);
	}

	@Test
	public void test_04() {
		int[] g = { 1 }, s = { 1, 1, 1 };
		assign_Cookies(g, s);
		Assert.assertEquals(assign_Cookies(g, s), 1);
	}

	private int assign_Cookies(int[] g, int[] s) {
		sort(g);
		sort(s);
		int pointer1 = 0, pointer2 = 0, output = 0;
		while (pointer1 < g.length && pointer2 < s.length) {
			if (g[pointer1] == s[pointer2]) {
				output = g[pointer1];
				pointer1++;
				pointer2++;
			} else if (g[pointer1] < s[pointer2])
				pointer1++;
			else if (g[pointer1] > s[pointer2])
				pointer2++;
		}
		return output;
	}

	private int[] sort(int[] arr) {
		for (int left = 0; left < arr.length; left++)
			for (int right = left + 1; right < arr.length; right++)
				if (arr[left] > arr[right]) {
					int temp = arr[left];
					arr[left] = arr[right];
					arr[right] = temp;
				}
		return arr;
	}
}

//Space complexity = O(1)
//Time complexity = O(n)+O(n^2)