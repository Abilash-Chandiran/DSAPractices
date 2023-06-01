package dsa.Week_3.Day_1; //75% Done

import java.util.HashSet;
import org.junit.Test;

public class Substrings_Of_Size_Three_With_Distinct_Characters {
	@Test
	public void testdata_01() {
		String s = "xxzzazmn";
		int target = 3;
		distinct_Character(s, target);

	}

	private String distinct_Character(String s, int target) {
		int left = 0;
		int right = 0;
		String result = "";
		HashSet<Character> set = new HashSet<Character>();
		char[] ch = s.toCharArray();
		while (right < target) {
			set.add(ch[right]);
			right++;
		}
		System.out.println(set.size());

		while (right < s.length()) {
			left = left + 1;
			right = right + 1;
			result = s.substring(left, right);
			System.out.println(result);
			set.clear();
			for (char c : result.toCharArray()) {
				set.add(c);
			}
			System.out.println(set);
		}
		return result;
	}

}