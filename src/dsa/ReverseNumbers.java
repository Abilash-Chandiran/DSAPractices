package dsa;
import org.junit.Test;

public class ReverseNumbers {

	@Test
	public void test01() {
		int num = 1234;
		reverseNums(num);
	}

	public void reverseNums(int num) {
		while(num>0) {
			int temp = num%10;
			System.out.print(temp);
			num = num/10;
		}
	}
	
	public void reverseNegativeNums() {
		int num01 = -123;
		while(num01<0) {
			int temp = num01%10;
			System.out.print(temp);
			num01 = num01/10;
		}
	}
}
