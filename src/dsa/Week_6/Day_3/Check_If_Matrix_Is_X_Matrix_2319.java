package dsa.Week_6.Day_3;

import org.junit.Assert;
import org.junit.Test;

/*
Approach: 2 Pointers

- Get the size of matrix
- Create two loops for row & column
- row = 0 & column = 0 until matrix size
- If (row == column || row + column == size) to get get diagonal value.
- If matrix of diagonal == 0, return false
- else matrix of remaining != 0, return false
- Return true
*/

public class Check_If_Matrix_Is_X_Matrix_2319 {
	@Test
	public void data_01() {
		int[][] grid = { { 2, 0, 0, 1 }, { 0, 3, 1, 0 }, { 0, 5, 2, 0 }, { 4, 0, 0, 2 } };
		is_Matrix(grid);
		Assert.assertEquals(is_Matrix(grid), true);
	}

	@Test
	public void data_02() {
		int[][] grid = { { 2, 0, 0 }, { 0, 3, 1 }, { 0, 5, 2 } };
		is_Matrix(grid);
		Assert.assertEquals(is_Matrix(grid), false);

	}

	@Test
	public void data_03() {
		int[][] grid = { { 0, 0, 0 }, { 0, 0, 0 }, { 0, 0, 0 } };
		is_Matrix(grid);
		Assert.assertEquals(is_Matrix(grid), false);

	}

	@Test
	public void data_04() {
		int[][] grid = { { 1, 1 }, { 2, 2 } };
		is_Matrix(grid);
		Assert.assertEquals(is_Matrix(grid), true);

	}

	private boolean is_Matrix(int[][] grid) {
		int size = grid.length - 1;
		for (int row = 0; row <= size; row++) {
			for (int column = 0; column <= size; column++) {
				if (row == column || row + column == size) {
					if (grid[row][column] == 0)
						return false;
				} else {
					if (grid[row][column] != 0)
						return false;
				}
			}
		}
		return true;
	}
}

//Space complexity - O(1)
//Time complexity - O(n*m)