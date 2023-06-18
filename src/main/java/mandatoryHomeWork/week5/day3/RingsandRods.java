package main.java.mandatoryHomeWork.week5.day3;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import org.junit.Test;

public class RingsandRods {

	@Test
	public void test() {

		String rings = "B0B6G0R6R0R6G9";
		System.out.println(countPoints(rings));
	}

	public int countPoints(String rings) {
		Map<Integer, Set<Character>> mp = new HashMap<>();
		for (int i = 1; i < rings.length(); i += 2) {
			int c = rings.charAt(i) - '0';
			mp.computeIfAbsent(c, k -> new HashSet<>()).add(rings.charAt(i - 1));
		}
		int ans = 0;
		for (Set<Character> e : mp.values()) {
			if (e.size() == 3) {
				++ans;
			}
		}
		return ans;
	}
}
