package dsa;

public class InsertionSorting {

	public static void main(String[] args) {

		int arr[] = { 11, 2, 17, 18, 2, 22, 1, 8 };

		for (int i = 1; i < arr.length; i++) {

			// Safegaurding the pivot
			int j = i;

			// find the swaps
			while (j >= 1 && arr[j] < arr[j - 1]) {

				// swap
				arr[j] = arr[j] + arr[j - 1] - (arr[j - 1] - arr[j]);
				// Decrement
				j--;
			}
		}

		for (int n : arr)
			System.out.print(n + ", ");

	}

}
