package main.java.mandatoryHomeWork.week6.day1;

import org.junit.Test;

public class IndexofFirstOccurrenceinaString {

	@Test
	public void test1() {
		String haystack = "sadbutsad", needle = "sad";
		System.out.println(firstindexofNeedle(haystack, needle));
	}

	@Test
	public void test2() {
		String haystack = "leetcode", needle = "leeto";
		System.out.println(firstindexofNeedle(haystack, needle));
	}

	public int firstindexofNeedle(String haystack, String needle) {

		if (haystack == null || needle == null) {
			return -1;
		}

		if (haystack.equals(needle)) {
			return 0;
		}

		int needleLength = needle.length();

		for (int i = 0; i < haystack.length() - needleLength + 1; i++) {

			if (haystack.substring(i, i + needleLength).equals(needle)) {
				return i;
			}
		}
		return -1;
	}

}
