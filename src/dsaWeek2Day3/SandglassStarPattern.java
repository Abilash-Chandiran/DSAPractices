package dsaWeek2Day3;

public class SandglassStarPattern {

	public static void main(String[] args) {

		sandglassPattern();
	}

	public static void sandglassPattern() {

		int rows = 5;
		for (int i = 0; i < rows; i++) {

			//To print spaces
			for (int j = 0; j < i; j++) {

				System.out.print(" ");
			}
			//To print stars
			for (int k = i; k < rows; k++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		
		for (int i = rows-1; i >= 0; i--) {

			for (int j = 0; j < i; j++) {

				System.out.print(" ");
			}
			for (int k = i; k < rows; k++) {
				System.out.print("* ");
			}
			System.out.println();
		}

	}

}
