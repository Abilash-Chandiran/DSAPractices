package main.java.mandatoryHomeWork.week1.day3;

public class RightPascalPattern {

	public static void main(String[] args) {

		rightPascalPattern();

	}

	public static void rightPascalPattern() {
		
		int rows_Top = 5;
		int rows_Down = 4;

		// Step 1 - To Print Right Triangle
		for (int i = 0; i < rows_Top; i++) {

			for (int j = 0; j <= i; j++) {

				System.out.print("* ");
			}
			System.out.println("");
		}

		// Step 2 - To Print Downward Triangle
		for (int i = rows_Down; i >= 1; i--) {

			for (int j = 1; j <= i; j++) {

				System.out.print("* ");
			}
			System.out.println("");
		}

	}

}
