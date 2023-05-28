package dsa;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class StringJewels {

	@Test
	public void test1() {

		String jewels = "aA";
		String stones = "aAAbbbb";
		assertEquals(3, stringcals(jewels, stones));
	}

	@Test
	public void test2() {

		String jewels = "z";
		String stones = "ZZ";
		assertEquals(0, stringcals(jewels, stones));
	}

	public int stringcals(String jewels, String stones) {
		int output = 0;
		for (int i = 0; i < stones.length(); i++) {

			if (jewels.length() == 2) {
				if (stones.charAt(i) == jewels.charAt(0) || stones.charAt(i) == jewels.charAt(1))
					output++;
			}
			if (jewels.length() == 1) {
				if (stones.charAt(i) == jewels.charAt(0))
					output++;
			}

		}
		return output;
	}

}
