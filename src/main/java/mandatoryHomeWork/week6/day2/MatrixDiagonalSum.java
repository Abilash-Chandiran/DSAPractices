package main.java.mandatoryHomeWork.week6.day2;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class MatrixDiagonalSum {

	@Test
	public void test1() {
		int[][] mat = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
		assertEquals(25, diagonalSum(mat));
	}

	@Test
	public void test2() {
		int[][] mat = { { 1, 1, 1, 1 }, { 1, 1, 1, 1 }, { 1, 1, 1, 1 }, { 1, 1, 1, 1 } };
		assertEquals(8, diagonalSum(mat));
	}

	@Test
	public void test3() {
		int[][] mat = { { 5 } };
		assertEquals(5, diagonalSum(mat));
	}

	public int diagonalSum(int[][] mat) {

		int sum = 0;
		int len = mat.length - 1;

		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat[i].length; j++) {

				if (i == j) {
					sum += mat[i][j];
				} else if (i == (len - j)) {
					sum += mat[i][j];
				}
			}
		}
		System.out.println(sum);
		return sum;
	}

}
