package dsa.Week_3.Day_4;

import java.util.HashMap;

import org.junit.Test;

public class Sorting_the_Sentence {
	@Test
	public void data_01() {
		String s = "is2 sentence4 This1 a3";
		sort_The_Sentence(s);
	}

	private void sort_The_Sentence(String s) {
		String[] a = s.split(" ");

		HashMap<String, String> map = new HashMap<String, String>();

		for (int i = 0; i < a.length; i++) {
			map.put(a[i].replaceAll("[^0-9]", ""), a[i].replaceAll("\\d", ""));
		}
		
		for (String str : map.values()) {
			System.out.print(str + " ");
		}
	}

}
