package dsa;

import org.junit.Test;

public class ArmstrongNumber {

	@Test
	public void test01() {

		int num = 153;
		if (num == findArmstrongNumberorNot(num)) {
			System.out.println("Armstrong Number");
		} else
			System.out.println("Not an Armstrong Number");
	}

	public int findArmstrongNumberorNot(int num) {

		int temp = 0;
		int newNum = 0;

		while (num > 0) {

			temp = num % 10;
			newNum = newNum + temp * temp * temp;
			num = num / 10;
		}

		return newNum;

	}

}
