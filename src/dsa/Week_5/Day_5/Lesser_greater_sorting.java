package dsa.Week_5.Day_5;

import java.util.Arrays;
import org.junit.Assert;
import org.junit.Test;

public class Lesser_greater_sorting {
	@Test
	public void data_01() {
		int[] values = { 1, 2, 3, 4, 5, 6 };
		swap_value(values);
		System.out.print(Arrays.toString(swap_value(values)));
		Assert.assertArrayEquals(swap_value(values), new int[] { 1, 6, 2, 5, 3, 4 });
	}

	private int[] swap_value(int[] values) {
		int left = 0, right = values.length - 1, i = 0;
		int[] newarr = new int[values.length];
		while (left < right) {
			newarr[i++] = values[left++];
			newarr[i++] = values[right--];
		}
		return newarr;
	}
}
//Space complexity = O(1)
//Time complexity = O(n)