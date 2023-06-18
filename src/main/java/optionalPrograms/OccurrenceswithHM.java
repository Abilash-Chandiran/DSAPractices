package main.java.optionalPrograms;

import java.util.HashMap;
import java.util.Map;

public class OccurrenceswithHM {

	
	public static void main(String[] args) {

		int nums[] = { 1, 1, 2, 3, 3, 4, 5, 5, 5, 6 };
		Map<Integer, Integer> map = new HashMap<>();
		for (int i = 0; i < nums.length; i++) {
			map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
		}
		
		for(Map.Entry<Integer, Integer> entry : map.entrySet())
		{
			//System.out.println(entry.getKey()+" : "+entry.getValue()); // To print all the values
			
			if(entry.getKey().equals(4)) {		
				System.out.println(entry.getValue());
			}
		}
	}
}
