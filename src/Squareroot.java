import java.util.Scanner;

public class Squareroot {

	public static void main(String[] args) {

		System.out.println("Enter a number: ");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();

		System.out.println("The square root of " + num + " is: " + squareRoot(num));
		sc.close();
	}

	public static double squareRoot(int num) {

		double temp;
		double sqrroot = num / 2;

		do {
			
			temp = sqrroot;
			sqrroot = (temp + (num / temp)) / 2;
			
		} while ((temp - sqrroot) != 0);

		return sqrroot;

	}

}
