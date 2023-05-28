package dsa;

public class RemoveElements {

	public static void main(String[] args) {

		int nums[] = { 3, 2, 2, 3 };
		int val = 3;
		System.out.println(removeElems(nums, val));
	}

	public static int removeElems(int nums[], int val) {

		int k = 0;

		for (int i = 0; i < nums.length; i++) {
			if (nums[i] != val)
				k++;

		}

		return k;

	}

}
