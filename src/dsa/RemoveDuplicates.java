package dsa;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

import org.junit.Test;

public class RemoveDuplicates {

	@Test
	public void test01() {
		int[] nums = { 5, 5, 5, 6 };
		removeduplicateNums(nums);
		removeDuplicatesTwoPointer(nums);
	}

	public void removeduplicateNums(int[] nums) {

		List<Integer> ls = new ArrayList<Integer>();
		HashSet<Integer> hs = new HashSet<>();
		
		for (int i = 0; i < nums.length; i++) {
			
			if (!hs.contains(nums[i]) && !ls.contains(nums[i])) {
				hs.add(nums[i]);
				ls.add(nums[i]);
			}
			else if (ls.contains(nums[i])) {
				hs.remove(nums[i]);
			}
		}
		System.out.println(hs);
	}
	
	public void removeDuplicatesTwoPointer(int[] nums) {
		
		int i = 0;
		for(int j=0;j<nums.length-1;j++) {
			
			if(nums[j]!=nums[j+1]) {
				nums[i] = nums[j];
				i++;
			}
		}
		System.out.println("Testttt "+Arrays.toString(nums));
		
	}
}
