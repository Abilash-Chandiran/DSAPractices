package dsa;

public class Pyramid {

	public static void main(String[] args) {
		pyramid(6);
	}

	public static void pyramid(int rows) {
		for (int i = 0; i < rows; i++) {
			for (int j = rows - i; j > 1; j--) {
				System.out.print(" ");
			}
			for (int j = 0; j <= i; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}
}
