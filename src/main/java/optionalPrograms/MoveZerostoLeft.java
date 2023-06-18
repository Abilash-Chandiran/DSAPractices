package main.java.optionalPrograms;

public class MoveZerostoLeft {

	public static void main(String[] args) {

		int nums[] = { 1, 2, 3, 0, 4, 0, 5 };// [0,0,1,2,3,4,5]

		for(int n:moveZeros(nums))
			System.out.print(n+",");
	}

	public static int[] moveZeros(int nums[]) {

		int newNums[] = new int[nums.length];
		int pos = nums.length - 1;

		for (int i = pos; i >= 0; i--) {
			if (nums[i] != 0) {
				newNums[pos--] = nums[i];
			}
		}

		return newNums;
	}
}
