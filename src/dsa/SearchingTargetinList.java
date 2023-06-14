package dsa;

import static org.junit.Assert.assertEquals;
import java.util.Arrays;
import java.util.List;
import org.junit.Test;

public class SearchingTargetinList {

	@Test
	public void test01() {
		List<Integer> nums = Arrays.asList(-1, 0, 3, 5, 9, 12);
		int target = 9;
		int Output_Expected = 4;
		int Output_Actual = searchingTarget(nums, target);
		assertEquals(Output_Expected, Output_Actual);
	}

	@Test
	public void test02() {
		List<Integer> nums = Arrays.asList(-1, 0, 3, 5, 9, 12);
		int target = 2;
		int Output_Expected = -1;
		int Output_Actual = searchingTarget(nums, target);
		assertEquals(Output_Expected, Output_Actual);
	}

	public static Integer searchingTarget(List<Integer> nums, int target) {
		int i = 0;
		int output = 0;
		for (int n : nums) {
			if (n == target)
				return output = i;
			else
				output = -1;
			i++;
		}
		return output;
	}
}
