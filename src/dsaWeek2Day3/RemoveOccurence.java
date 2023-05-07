package dsaWeek2Day3;
import java.util.Arrays;

public class RemoveOccurence {

	public static void main(String[] args) {

		int nums[] = { 1, 2, 3, 4, 5, 1 };
		int n = 1;
		System.out.println(Arrays.toString(removeOccurences(nums, n)));

	}

	public static int[] removeOccurences(int nums[], int n) {

		int numOfOcc = 0;

		for (int temp : nums) {

			if (temp == n)
				numOfOcc++;

		}

		if (numOfOcc == 0)
			return nums;

		int res[] = new int[nums.length - numOfOcc];
		int index = 0;
		for (int temp : nums) {

			if (temp != n)
				res[index++] = temp;

		}

		return res;

	}

}
