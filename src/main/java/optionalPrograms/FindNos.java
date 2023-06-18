package main.java.optionalPrograms;

public class FindNos {

	public static void main(String[] args) {

		int arr[] = { 1, 2, 3, 4, 5 };
		int x = 2;
		int y = 8;
		Boolean a = findNos(arr, x, y);
		System.out.println(a);
	}

	public static boolean findNos(int arr[], int x, int y) {

		Boolean b = false;
		Boolean c = false;
		Boolean d = false;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == x) {
				b = true;
			}
		}
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == y) {
				c = true;
			}
		}

		if (b.equals(c))
			d = true;
		return d;
	}

}
