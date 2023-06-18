package main.java.mandatoryHomeWork.week2.day3;

import static org.junit.Assert.assertArrayEquals;

import org.junit.Test;

public class DI_String_Match {
	@Test
	public void testdata_01() {
		String s = "IDID";
		string_match(s);
		assertArrayEquals(string_match(s), new int[] { 0, 4, 1, 3, 2 });
	}

	private int[] string_match(String s) {
		char[] c = s.toCharArray();
		int size = s.length();
		int left = 0, right = s.length();
		int i = 0;
		int[] arr = new int[size + 1];

		while (left < size) {
			if (i < size) {
				if (c[i] == 'I') {
					arr[i] = left;
					left++;

				} else if (c[i] == 'D') {
					arr[i] = right;
					right--;
				}
				i++;
			} else {
				arr[i] = left;
				break;
			}
		}
		return arr;

	}

}
