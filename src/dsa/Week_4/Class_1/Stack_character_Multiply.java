package dsa.Week_4.Class_1;

import java.util.Stack;

import org.junit.Test;

public class Stack_character_Multiply {
	@Test
	public void data_01() {

		String input = "3[a2[bc]]";
		get_characters(input);

	}

	private void get_characters(String input) {

		input = input.replaceAll("[^0-9a-z]", "");
		char[] c = input.toCharArray();
		Stack<Character> s = new Stack<Character>();
		for (char sc : c) {
			s.push(sc);
		}
		System.out.println(s);
		StringBuffer sb = new StringBuffer();
		for (char sc : c) {
			sb.append(sc);
		}
		System.out.println(sb);
	}

}
