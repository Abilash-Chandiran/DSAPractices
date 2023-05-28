package dsa;

public class MoveZerostoEnd {

	public static void main(String[] args) {

		int nums[] = { 0, 1, 0, 3, 12 };

		for(int n:moveZeros(nums))
			System.out.print(n+",");
	}

	public static int[] moveZeros(int nums[]) {

		int newNums[] = new int[nums.length];
		int pos = 0;

		for (int n : nums) {

			if (n > 0) {
				newNums[pos++] = n;
			}
		}

		return newNums;
	}
}
