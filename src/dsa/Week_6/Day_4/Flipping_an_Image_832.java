package dsa.Week_6.Day_4;

import java.util.Arrays;

import org.junit.Assert;
import org.junit.Test;

public class Flipping_an_Image_832 {
	@Test
	public void test_data_01() {
		int[][] images = { { 1, 1, 0 }, { 0, 1, 1 }, { 1, 0, 0 } };
		flip_Image(images);
		// Assert.assertArrayEquals(flip_Image(images), new int[][] { { 1, 0, 0 }, { 0,1, 0 }, { 1, 1, 1 } });
	}

	private int[][] flip_Image(int[][] images) {
		int left = 0, right = images.length - 1;

		for (int i = 0; i < images.length; i++) {
			while (left <= right) {

				int temp = images[i][left];
				images[i][left++] = images[i][right];
				images[i][right--] = temp;
			}
			System.out.println(images[i][i]);
		}
		
		return images;
	}

}
