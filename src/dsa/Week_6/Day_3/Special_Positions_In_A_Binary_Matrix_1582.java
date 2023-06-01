package dsa.Week_6.Day_3;

import org.junit.Assert;
import org.junit.Test;

public class Special_Positions_In_A_Binary_Matrix_1582 {
	@Test
	public void test_01() {
		int[][] matrix = { { 1, 0, 0 }, { 0, 0, 1 }, { 1, 0, 1 } };
		special_Position(matrix);
		Assert.assertEquals(special_Position(matrix), 4);
	}

	@Test
	public void test_02() {
		int[][] matrix = { { 0, 0, 0 }, { 0, 0, 0 }, { 0, 0, 0 } };
		special_Position(matrix);
		Assert.assertEquals(special_Position(matrix), 0);
	}

	@Test
	public void test_03() {
		int[][] matrix = { { 0, 0, 0 }, { 0, 0, 0 } };
		special_Position(matrix);
		Assert.assertEquals(special_Position(matrix), -1);
	}

	@Test
	public void test_04() {
		int[][] matrix = { { 1, 1, 1, 1 }, { 1, 1, 1, 1 }, { 1, 1, 1, 1 }, { 1, 1, 1, 1 } };
		special_Position(matrix);
		Assert.assertEquals(special_Position(matrix), 16);
	}

	@Test
	public void test_05() {
		int[][] matrix = {};
		special_Position(matrix);
		Assert.assertEquals(special_Position(matrix), 0);
	}

	private int special_Position(int[][] matrix) {
		int count = 0;
		if (matrix.length == 0)
			return count;
		else if (matrix.length == matrix[0].length) {
			for (int i = 0; i <= matrix.length - 1; i++) {
				for (int j = 0; j <= matrix.length - 1; j++) {
					if (matrix[i][j] == 1)
						count++;
				}
			}

			return count;
		}
		return -1;
	}

}

//Space complexity - O(1)
//Time complexity - O(n*m)