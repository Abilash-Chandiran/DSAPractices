package main.java.mandatoryHomeWork.week4.day1;

import static org.junit.Assert.assertEquals;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import org.junit.Test;

public class MergeTwoSortedList {

	@Test
	public void test() {
		List<Integer> list1 = new ArrayList<>(Arrays.asList(1, 2, 4));
		List<Integer> list2 = new ArrayList<>(Arrays.asList(1, 3, 4));
		List<Integer> expected_result = new ArrayList<>(Arrays.asList(1, 2, 3, 4));
		assertEquals(expected_result, mergeTwoLists(list1, list2));
	}

	private List<Integer> mergeTwoLists(List<Integer> list1, List<Integer> list2) {
		List<Integer> result = new ArrayList<Integer>();
		list1.addAll(list2);
		for (int l : list1) {
			if (!result.contains(l))
				result.add(l);
		}
		Collections.sort(result);
		return result;
	}
}
