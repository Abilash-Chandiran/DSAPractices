package dsa.Week_6.Day_4;

import org.junit.Assert;
import org.junit.Test;

public class Determine_Whether_Matrix_Can_Be_Obtained_By_Rotation_1886 {

	@Test
	public void test_data_01() {
		int[][] mat = { { 1, 1, 0 }, { 1, 0, 1 }, { 0, 0, 0 } };
		matrix_Rotation(mat);
		Assert.assertArrayEquals(matrix_Rotation(mat), new int[][] { { 0, 1, 1 }, { 0, 1, 0 }, { 0, 0, 0 } });
	}

	private int[][] matrix_Rotation(int[][] mat) {

		int left = 0, right = mat.length - 1;

		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat[i].length; j++) {
				int temp = mat[i][left];
				mat[i][left++] = mat[i][right];
				mat[i][right--] = temp;
				
				if (mat[i][j] == 1) {
					mat[i][j] = 0;
				} else {
					mat[i][j] = 1;
				}
			}
		}
		return mat;
	}

}
