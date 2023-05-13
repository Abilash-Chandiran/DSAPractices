package dsa;

public class Occurances {

	public static void main(String[] args) {

		numofOccurances();
	}

	public static void numofOccurances() {

		int count = 0;
		int arr[] = { 1, 1, 2, 3, 4, 4, 4, 5, 6 };

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				if (arr[i] == arr[j]) {
					if (j < i) {
						break;
					}
					count++;
				}
			}
			if (count > 0) {
				System.out.println("Occurence of " + arr[i] + "  " + (count));
				count = 0;
			}
		}
	}
}
