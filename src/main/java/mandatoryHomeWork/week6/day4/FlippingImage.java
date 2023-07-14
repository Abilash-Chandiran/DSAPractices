package main.java.mandatoryHomeWork.week6.day4;

import org.junit.Assert;
import org.junit.Test;

public class FlippingImage {

	@Test
	public void test() {
		int[][] mat = { { 1, 1, 0 }, { 1, 0, 1 }, { 0, 0, 0 } };
		int[][] output = { { 1, 0, 0 }, { 0, 1, 0 }, { 1, 1, 1 } };
		Assert.assertArrayEquals(output, flipAndInvertImage(mat));	
	}

	public int[][] flipAndInvertImage(int[][] image) {
		int[][] result = new int[image.length][image.length];
		for (int i = 0; i < image.length; i++) {
			for (int j = 0; j < image.length; j++) {
				result[i][j] = image[i][image.length - 1 - j];
				if (result[i][j] == 0) {
					result[i][j] = 1;
				} else if (result[i][j] == 1) {
					result[i][j] = 0;
				}
			}
		}
		return result;
	}

}
