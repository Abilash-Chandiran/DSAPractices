package main.java.mandatoryHomeWork.week9.day1;

import java.util.ArrayList;
import java.util.List;

//https://www.hackerrank.com/challenges/sparse-arrays/problem

public class SparseArrays {

	public static void main(String[] args) {
		System.out.println(sparseArrays());
	}

	public static List<Integer> sparseArrays() {
		List<String> stringList = new ArrayList<String>();
		stringList.add("aba");
		stringList.add("baba");
		stringList.add("aba");
		stringList.add("xzxb");
		List<String> queries = new ArrayList<String>();
		queries.add("aba");
		queries.add("xzxb");
		queries.add("ab");
		List<Integer> op = new ArrayList<Integer>();
	    
	    for(int i=0; i<queries.size(); i++){
	        int cnt=0;
	        for(int j=0; j<stringList.size(); j++){
	            if(queries.get(i).equals(stringList.get(j))) cnt++;
	        }
	        op.add(cnt);
	    }
	    
	    return op;
	}
}
