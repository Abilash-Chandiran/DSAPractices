package main.java.mandatoryHomeWork.week1.day4;

public class MissingNumber {

	public static void main(String[] args) {

		int[] nums = { 3, 0, 1 };
		System.out.println(missingNumber(nums));
	}

	public static int missingNumber(int[] nums) {
		int n = nums.length + 1;
		int total = (n * (n - 1)) / 2;

		for (int num : nums) {
			total -= num;
		}

		return total;
	}
}
