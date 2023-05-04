
public class MoveZerostoLeft {

	public static void main(String[] args) {

		int nums[] = { 1, 2, 3, 0, 4, 0, 5 };// [0,0,1,2,3,4,5]

		moveZeros(nums);
	}

	public static void moveZeros(int nums[]) {

		int newNums[] = new int[nums.length];
		int pos = nums.length - 1;

		if (nums[pos] < 1)
			return;

		for (int i = pos; i >= 0; i--) {
			if (nums[i] != 0) {
				newNums[pos--] = nums[i];
			}
		}

		for (int n : newNums)
			System.out.println(n);

	}
}
