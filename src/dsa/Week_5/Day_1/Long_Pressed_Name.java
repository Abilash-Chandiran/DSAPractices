package dsa.Week_5.Day_1;

import org.junit.Test;

public class Long_Pressed_Name {

	@Test
	public void data_01() {
		String name = "saeed";
		String typed = "saaedd";
		pressed_name(name, typed);
		System.out.println(pressed_name(name, typed));

	}

	private boolean pressed_name(String name, String typed) {
		char[] name_letter = name.toCharArray();
		char[] typed_letter = typed.toCharArray();
		int pointer_1 = 0, pointer_2 = 0;
		while (pointer_2 < typed.length()) {

			if (name_letter[pointer_1] != typed_letter[pointer_2]) {

				if (typed_letter[pointer_2] == name_letter[pointer_1 - 1]
						&& name_letter[pointer_1] == typed_letter[pointer_2 + 1]) {
					System.out.println("Pointer 1 = " + name_letter[pointer_1] + "-> count = " + pointer_1);
					System.out.println("Pointer 2 = " + typed_letter[pointer_2] + "-> count = " + pointer_2);

					if (name_letter[pointer_1] == name_letter[pointer_1 - 1]) {
						System.out.println(name_letter[pointer_1] + " is missing");

					}
					pointer_2++;
				}
			}
			pointer_1++;
			pointer_2++;

		}
		return false;

	}
}