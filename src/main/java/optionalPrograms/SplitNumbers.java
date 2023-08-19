package main.java.optionalPrograms;

import java.util.Arrays;

public class SplitNumbers {

	public static void main(String[] args) {
		
		int input = 70304; //output = 70000 + 300 + 4
		String inputStr = input+"";

		int inputArr[] = new int[inputStr.length()];
		int i = 0;
		for(char s:inputStr.toCharArray()) {
			
			System.out.println("inputStr "+s);
		}
		
		for(int n:inputArr)
			System.out.println("n "+n);
		
		System.out.println(Arrays.toString(inputArr));
		

	}

}
