package main.java.optionalPrograms;

import java.util.HashSet;
import java.util.Set;

import org.junit.Test;

public class Palindrome {

	@Test
	public void test01() {
		String s = "MadaM";
		//palindromeCheck(s);
		System.out.println(palindromeorNot(s));
	}

	public void palindromeCheck(String s) {

		StringBuffer sb = new StringBuffer(s);
		sb.reverse();
		if (s.equals(sb.toString()))
			System.out.println(s + " is a Palindrome");
		else
			System.out.println(s + " is a not Palindrome");
	}

	public boolean palindromeorNot(String s) {
		Set<Character> set = new HashSet<Character>();

		for (int i = 0; i < s.length(); i++) {
			if (!set.add(s.charAt(i)))
				set.remove(s.charAt(i));
		}

		if (set.size() > 1)
			return false;

		return true;
	}
}
