package main.java.mandatoryHomeWork.week6.day4;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.util.Arrays;

import org.junit.Test;

public class MatrixbyRotation {

	@Test
	public void test1() {
		int[][] mat = { { 0, 1 }, { 1, 0 } };
		int[][] target = { { 1, 0 }, { 0, 1 } };
		assertTrue(findRotation(mat, target));
	}

	@Test
	public void test2() {
		int[][] mat = { { 0, 1 }, { 1, 1 } };
		int[][] target = { { 1, 0 }, { 0, 1 } };
		assertFalse(findRotation(mat, target));
	}

	public boolean findRotation(int[][] mat, int[][] target) {
		for (int i = 0; i < 4; i++) {
			if (Arrays.deepEquals(mat, target)) {
				return true;
			}
			rotate(mat);
		}
		return false;
	}

	private void rotate(int[][] mat) {

		for (int i = 0, j = mat.length - 1; i < j; i++, j--) {
			int[] tempRow = mat[i];
			mat[i] = mat[j];
			mat[j] = tempRow;
		}

		for (int i = 0; i < mat.length; i++) {
			for (int j = i + 1; j < mat.length; j++) {
				int temp = mat[i][j];
				mat[i][j] = mat[j][i];
				mat[j][i] = temp;
			}
		}
	}
}
