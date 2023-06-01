package dsa.Week_4.Workout;

public class Duplicate_Zeros_1089 {

	public void data_01() {
		int[] arr = { 1, 0, 2, 3, 0, 4, 5, 0 };
		duplicate_zero(arr);
	}

	private void duplicate_zero(int[] arr) {
		int left = 0, right = 0;
		while (left < arr.length) {
			if (arr[left] != 0 && arr[left] != 0) {
				right++;
				left++;
			}

		}

	}

}
