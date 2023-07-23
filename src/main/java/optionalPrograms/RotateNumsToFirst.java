package main.java.optionalPrograms;

public class RotateNumsToFirst {

	/**
	 * 12345 51234 54123 54312
	 * 
	 */

	/**
	 * 1) Rotate an array to right for k times Input=[1,2,3,4,5] k=3
	 * Output=[3,4,5,1,2]
	 */

	public static void main(String[] args) {
		int num = 12345;
		int k = 3;
		rotateNumstoFirst(num, k);
	}

	public static void rotateNumstoFirst(int num, int k) {

		int len = (int) (Math.log10(num) + 1); // To find int len of the integer
		System.out.println(len);

		while (k-- > 0) {
			System.out.print(num % 10);
			num = num / 10;
		}
		System.out.print(num);
	}
}
