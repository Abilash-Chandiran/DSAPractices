package main.java.mandatoryHomeWork.week6.day3;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class BinaryMatrixSpecialPosition {

	@Test
	public void test1() {
		int[][] mat = { { 1, 0, 0 }, { 0, 0, 1 }, { 1, 0, 0 } };
		assertEquals(1, numSpecial(mat));
	}

	@Test
	public void test2() {
		int[][] mat = { { 1, 0, 0 }, { 0, 1, 0 }, { 0, 0, 1 } };
		assertEquals(3, numSpecial(mat));
	}

	@Test
	public void test3() {
		int[][] mat = { { 0, 0, 0, 1 }, { 1, 0, 0, 0 }, { 0, 1, 1, 0 }, { 0, 0, 0, 0 } };
		assertEquals(2, numSpecial(mat));
	}

	public static int numSpecial(int[][] mat) {
		int m = mat.length;
		int n = mat[0].length;
		int[] row = new int[m];
		int[] col = new int[n];
		for (int j = 0; j < n; j++) {
			for (int i = 0; i < m; i++) {
				row[i] += mat[i][j];
				col[j] += mat[i][j];
			}
		}
		int res = 0;
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				if (mat[i][j] == 1 && row[i] == 1 && col[j] == 1) {
					res++;
				}
			}
		}
		return res;
	}

}
