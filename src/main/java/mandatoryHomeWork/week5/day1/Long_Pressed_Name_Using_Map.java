package main.java.mandatoryHomeWork.week5.day1;

import java.util.HashMap;
import org.junit.Test;

public class Long_Pressed_Name_Using_Map {
	@Test
	public void data_01() {
		String name = "saeed";
		String typed = "ssaaed";
		pressed_name(name, typed);
		System.out.println(pressed_name(name, typed));
	}

	private boolean pressed_name(String name, String typed) {
		HashMap<Character, Integer> map_name = new HashMap<Character, Integer>();
		HashMap<Character, Integer> map_typed = new HashMap<Character, Integer>();

		for (char a : name.toCharArray())
			map_name.put(a, map_name.getOrDefault(a, 0) + 1);
		for (char b : typed.toCharArray())
			map_typed.put(b, map_typed.getOrDefault(b, 0) + 1);

		if (map_name.keySet().equals(map_typed.keySet())) {

			for (char c : name.toCharArray()) {
				if (map_name.get(c) <= (map_typed.get(c)))
					return true;

			}
		}
		return false;
	}
}
