package main.java.mandatoryHomeWork.week6.day3;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class MatixIsXMatrix {

	@Test
	public void test1() {
		int[][] grid = { { 2, 0, 0, 1 }, { 0, 3, 1, 0 }, { 0, 5, 2, 0 }, { 4, 0, 0, 2 } };
		assertTrue(checkXMatrix(grid));
	}

	@Test
	public void test2() {
		int[][] grid = { { 5, 7, 0 }, { 0, 3, 1 }, { 0, 5, 0 } };
		assertFalse(checkXMatrix(grid));
	}

	public boolean checkXMatrix(int[][] grid) {
		for (int i = 0; i < grid.length; i++) {
			for (int j = 0; j < grid[0].length; j++) {
				if (i == j || i + j == grid.length - 1) {
					if (grid[i][j] == 0) {
						return false;
					}
				} else {
					if (grid[i][j] != 0) {
						return false;
					}
				}
			}
		}
		return true;
	}
}
