package dsa.Week_5.Class;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

public class Merge_Two_Sorted_Lists {
	@Test
	public void data_01() {
		int[] a = { 1, 2, 4 };
		int[] b = { 1, 3, 4 };
		merge_list(a, b);
	}

	private void merge_list(int[] a, int[] b) {
		List<Integer> ls = new ArrayList<Integer>();
		for (int c : a)
			ls.add(c);

		for (int d : b)
			ls.add(d);
		
		System.out.println(ls);
	}

}
