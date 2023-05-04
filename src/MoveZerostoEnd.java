
public class MoveZerostoEnd {

	public static void main(String[] args) {

		int nums[] = { 0, 1, 0, 3, 12 };

		moveZeros(nums);
	}

	public static void moveZeros(int nums[]) {

		int newNums[] = new int[nums.length];
		int pos = 0;

		for (int n : nums) {

			if (n > 0) {
				newNums[pos++] = n;
			}
		}

		for (int nm : newNums)
			System.out.println(nm);

	}
}
