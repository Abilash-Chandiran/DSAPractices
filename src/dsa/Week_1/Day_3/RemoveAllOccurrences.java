package dsa.Week_1.Day_3;

public class RemoveAllOccurrences {

	public static void main(String[] args) {
		int[] array = { 1, 2, 3, 4, 5, 1 };
		int indexToRemove = 5;
		removeAllOccurrencess(array, indexToRemove);
	}

	public static void removeAllOccurrencess(int[] arr, int indexToRemove) {
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] != arr[indexToRemove])
				System.out.print(arr[i] + ", ");
		}
	}
}
