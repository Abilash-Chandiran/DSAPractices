package dsa.Week_5.Day_2;

import org.junit.Assert;
import org.junit.Test;

/*
Pseudo code:

Approach - 2 pointers

 - Create two pointers P1 = 0 for s and P2 = 0 for t
 - Iterate while(p2<t.length())
 - Change both string to char[]
 - If P1 == P2, add the string in output variable
 - compare Output equals s 
 - Increment P1 and P2
 - Else P1 != P2, increment P2++
 - return the boolean result

*/

public class Is_Subsequence_392 {
	@Test
	public void data_01() {
		String s = "abc", t = "ahbgdc";
		subsequence(s, t);
		Assert.assertEquals(subsequence(s, t), true);
	}

	@Test
	public void data_02() {
		String s = "axc", t = "ahbgdc";
		subsequence(s, t);
		Assert.assertEquals(subsequence(s, t), false);
	}

	@Test
	public void data_03() {
		String s = "axc", t = "axc";
		subsequence(s, t);
		Assert.assertEquals(subsequence(s, t), true);
	}

	@Test
	public void data_04() {
		String s = "abcde", t = "";
		subsequence(s, t);
		Assert.assertEquals(subsequence(s, t), false);
	}

	@Test
	public void data_05() {
		String s = "", t = "abcde";
		subsequence(s, t);
		Assert.assertEquals(subsequence(s, t), false);
	}

	private boolean subsequence(String s, String t) {
		int p1 = 0, p2 = 0;
		String output = "";
		char[] s_ch = s.toCharArray();
		char[] t_ch = t.toCharArray();

		if (s.length() == 0 || t.length() == 0)
			return false;

		while (p2 < t.length()) {
			if (s_ch[p1] == t_ch[p2]) {
				output = output + s_ch[p1];
				p1++;
			}
			p2++;
		}
		System.out.println(output);
		return output.equals(s);
	}

}

//Time complexity = O(n)
//Space complexity = O(1)
