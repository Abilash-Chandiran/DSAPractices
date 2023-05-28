package dsa;

import org.junit.Test;
/***
 * 
 * First split the given number as single number and find the square value ex: 32 -> 3, 2 --> 3*3 /2*2
 * Sum the multiplied value and return it.
 * 
 *
 */
public class HappyNumbers {

	@Test
	public void test() {

		int num = 100;
		int result = num;

		while (result != 1 && result != 4) {
			result = happyNums(result);
		}

		if (result == 1)
			System.out.println(num + " is a happy number");
		else if (result == 4)
			System.out.println(num + " is not a happy number");
	}

	public int happyNums(int num) {

		int remainder = 0;
		int sum = 0;

		while (num > 0) {
			remainder = num % 10;
			sum = sum + (remainder * remainder);
			num = num / 10;
		}

		System.out.println(sum);
		return sum;
	}

}
