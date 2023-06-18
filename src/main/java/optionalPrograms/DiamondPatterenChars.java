package main.java.optionalPrograms;

import org.junit.Test;

public class DiamondPatterenChars {

	@Test
	public void td() {
		diamondAlphabet('H');
//		System.out.println();
//		diamondAlphabet('G');
	}

	public void diamondAlphabet(char c) {
		for (int i = 'A'; i <= c; i++) {
			innerLoop(c, i);
		}

		for (int i = c - 1; i >= 'A'; i--) {
			innerLoop(c, i);
		}
	}

	private void innerLoop(char c, int i) {
		for (int j = 0; j <= c + i - (2 * 'A'); j++) {
			if (j == c - i || j == c + i - (2 * 'A'))
				System.out.print((char) i);
			else
				System.out.print(" ");
		}
		System.out.println();
	}

}
