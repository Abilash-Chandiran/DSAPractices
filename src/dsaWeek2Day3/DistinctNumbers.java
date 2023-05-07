package dsaWeek2Day3;

public class DistinctNumbers {

	public static void main(String[] args) {

		int arr[] = { 4, 5, 6, 6, 7, 7, 8, 9 };
		if (arr.length > 0) {
			for (int i = 0; i < arr.length - 1; i++) {
				if (arr[i] != arr[i + 1]) {
					System.out.print(arr[i] + " , ");
				}
			}
			System.out.println(arr[arr.length-1]);
		} else {
			return;
		}

	}

}
