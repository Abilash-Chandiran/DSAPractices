package dsa.Week_2.Day_4;

import org.junit.Test;

public class Diamond_Pattern_Using_Letters {

	/*
	 * Given String input size = F And get the integer value for the character And
	 * create 3 loops for Row, Space and Column Where row i = 6 And space j =
	 * (j-i)&&(j+i) with characters using key & value And column k = 6 And print the
	 * pyramid pattern Then reverse the same logic
	 */
	@Test
	public void testdata_01() {
		char a = 'F';
		pyramid_pattern(a);
	}

	public void testdata_02() {
		char a = ' ';
		pyramid_pattern(a);
	}

	public void testdata_03() {
		char a = 'd';
		pyramid_pattern(a);
		
	}

	private void pyramid_pattern(char a) {
		while (a != ' ') {
			int input = 1;
			System.out.println(a - input);
			input++;
		}

	}
}