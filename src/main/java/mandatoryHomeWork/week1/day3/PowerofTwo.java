package main.java.mandatoryHomeWork.week1.day3;

public class PowerofTwo {

	public static void main(String args[]) {
		int n = 16;
		if (powerOfTwo(n))
			System.out.println("Yes");
		else
			System.out.println("No");
	}

	public static boolean powerOfTwo(int n) {
		while (n % 2 == 0)
			n /= 2;
		return (n == 1);
	}

}
