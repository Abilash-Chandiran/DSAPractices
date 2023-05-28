package dsa;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.Test;

public class InputArrayvsOutput {

	@Test
	public void test() {

		int[] arr = { 1, 2, 3, 4, 5, 6 }; // op - [1,6,2,5,3,4]
		//assertArrayEquals(new int[] {1, 6, 2, 5, 3, 4}, arrayOrderChange(arr)); //getting error need to analyze - java.lang.AssertionError: expected:<[I@77468bd9> but was:<[I@12bb4df8>
		assertEquals(Arrays.asList(1, 6, 2, 5, 3, 4), arrayOrderChange(arr));
	}

	public List<Integer> arrayOrderChange(int arr[]) {
		
		List<Integer> ls = new ArrayList<Integer>();
		//int newArr[] = new int[arr.length];
		int left = 0, right = arr.length - 1;
		
		while (left < right) {
			ls.add(arr[left++]);
			ls.add(arr[right--]);
		}

//		for (int i = 0; i < ls.size(); i++)
//			newArr[i] = ls.get(i);
		
//		return newArr;
		return ls;

	}

}
