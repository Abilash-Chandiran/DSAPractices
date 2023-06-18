package main.java.mandatoryHomeWork.week4.day2;

import static org.junit.Assert.assertFalse;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

import org.junit.Test;

public class RemoveDuplicates {

	@Test
	public void test01() {
		int[] nums = { 5, 5, 5, 6 };
		assertFalse(removeduplicateNums(nums).contains(5));
	}

	public HashSet<Integer> removeduplicateNums(int[] nums) {

		List<Integer> ls = new ArrayList<Integer>();
		HashSet<Integer> hs = new HashSet<>();

		for (int i = 0; i < nums.length; i++) {

			if (!hs.contains(nums[i]) && !ls.contains(nums[i])) {
				hs.add(nums[i]);
				ls.add(nums[i]);
			} else if (ls.contains(nums[i])) {
				hs.remove(nums[i]);
			}
		}
		System.out.println(hs);
		return hs;
	}

}
