package main.java.optionalPrograms;

import java.util.Iterator;
import java.util.LinkedHashMap;

public class FindfirstIndexofRepeatedElements {

	public static void main(String[] args) {

		int arr[] = { 1, 5, 3, 4, 3, 5, 6 };
		int exp_output = 2;
		System.out.println(exp_output == firstIndexofRepeatedElements(arr));
	}

	public static int firstIndexofRepeatedElements(int arr[]) {
		LinkedHashMap<Integer, Integer> hm = new LinkedHashMap<>();
		for (int i = 0; i < arr.length; i++) {
			int num = arr[i];
			int count = hm.getOrDefault(num, 0) + 1;
			hm.put(num, count);
		}

		Iterator<Integer> it = hm.values().iterator();
		int indexMin = 0;
		while (it.hasNext())
			if (it.next() > 1)
				indexMin = it.next();
		
		return indexMin;
	}

}
