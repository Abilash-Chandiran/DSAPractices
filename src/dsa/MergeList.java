package dsa;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class MergeList {

	public static void main(String[] args) {
		
		List<Integer> list = Arrays.asList(1,2,3,4,5);
		List<Integer> list02 = Arrays.asList(6,7,8,9,0);
		List<Integer> ls = new ArrayList<Integer>();
		ls.addAll(list);
		ls.addAll(list02);
		int[] arr = new int[ls.size()];
		for(int i=0;i<ls.size();i++) {
			arr[i] = ls.get(i);
		}
		
		Arrays.sort(arr);
		
		for(int n:arr)
			System.out.print(n+",");
		
		System.out.println();
		Collections.sort(ls);
		
		for(int m:ls)
			System.out.print(m+",");

	}

}
