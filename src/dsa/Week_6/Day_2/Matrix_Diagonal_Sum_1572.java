package dsa.Week_6.Day_2;

import org.junit.Assert;
import org.junit.Test;

/*
Approach: Brute force

- Get the size of matrix
- sum = 0 and row = matrix size
- If (row size && column one size miss match), return -1
- If (row size && column one size match) implement below
- Iterate using for loop till row size
- To get diagonal value from left matrix[i][i] => {[0,0] [1,1][2,2][3,3]}
- To get diagonal value from right matrix[i][row - i] => {[0,3][1,2][2,1][3,0]}
- If (matrix size == odd) sum - matrix[n/2][n/2]
- Return sum
*/

public class Matrix_Diagonal_Sum_1572 {
	@Test
	// Odd value
	public void data_01() {
		int[][] mat = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
		diagonal_sum(mat);
		Assert.assertEquals(diagonal_sum(mat), 25);
	}

	@Test
	// Not a diagonal input
	public void data_02() {
		int[][] mat = { { 1, 2, 3 }, { 7, 8, 9 } };
		diagonal_sum(mat);
		Assert.assertEquals(diagonal_sum(mat), -1);
	}

	@Test
	// Full matrix coverage
	public void data_03() {
		int[][] mat = { { 1, 2 }, { 7, 8 } };
		diagonal_sum(mat);
		Assert.assertEquals(diagonal_sum(mat), 18);
	}

	@Test
	// Even value
	public void data_04() {
		int[][] mat = { { 1, 1, 1, 1 }, { 1, 1, 1, 1 }, { 1, 1, 1, 1 }, { 1, 1, 1, 1 } };
		diagonal_sum(mat);
		Assert.assertEquals(diagonal_sum(mat), 8);
	}

	private int diagonal_sum(int[][] mat) {

		if (mat.length == mat[1].length) {

			int sum = 0, i = 0, row = mat.length - 1;
			for (i = 0; i <= row; i++) {
				sum = sum + mat[i][i] + mat[i][row - i];
			}
			if (mat.length % 2 != 0) {
				sum = sum - mat[i / 2][i / 2];
			}
			return sum;
		}
		return -1;
	}

}

//Space complexity - O(1)
//Time complexity - O(n)