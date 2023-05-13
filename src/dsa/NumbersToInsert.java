package dsa;

public class NumbersToInsert {

	public static void main(String[] args) {

		int arr[] = { 1, 2, 3, 4, 6, 7 };
		int newarr[] = new int[arr.length + 1];
		int missingNum = 5;

		int i = 0;
		for (; i < arr.length; i++) {

			if (arr[i] < missingNum) {
				
				newarr[i] = arr[i]; // Step 1     
				
			} else {
				
				newarr[i] = missingNum; // Step 2

				for (; i < arr.length; i++) {

					newarr[i + 1] = arr[i]; // Step 3
				}
			}
		}

		for (int a : newarr)
			System.out.println(a);

	}

}
