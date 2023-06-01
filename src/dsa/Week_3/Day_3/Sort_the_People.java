package dsa.Week_3.Day_3;

import java.util.ArrayList;
import java.util.HashMap;
import org.junit.Test;

public class Sort_the_People {
	@Test
	public void data_01() {
		String[] names = { "Mary", "John", "Emma" };
		int[] heights = { 180, 165, 170 };
		sort_people(names, heights);

	}

	private void sort_people(String[] names, int[] heights) {

		ArrayList<HashMap<String, Integer>> list = new ArrayList<>();
		HashMap<String, Integer> map = new HashMap<String, Integer>();
		
		if (names.length == heights.length) {
			for (int i = 0; i < names.length; i++) {
				map.put(names[i], heights[i]);
			}
			
			list.add(map);
			System.out.println(map);

		}

	}
}

//Time complexity - O(n)
//Space complexity - O(2n)