package dsa.Week_6.two_pointers;

import java.util.Arrays;
import org.junit.Test;

public class Flipping_An_Image_832 {
	@Test
	public void test() {
		int[][] images = { { 1, 1, 0 }, { 1, 0, 1 }, { 0, 0, 0 } };
		flipping_Image(images);

	}

	private int[][] flipping_Image(int[][] images) { 
		for (int[] image : images) {
			int left = 0, right = image.length - 1;
			while (left <= right) {
				int temp = image[left];
				image[left++] = image[right];
				image[right--] = temp;
			}
			System.out.println(Arrays.toString(image));
		}
		

		return images;

	}

}
