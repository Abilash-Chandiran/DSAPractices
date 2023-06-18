package main.java.optionalPrograms;

import org.junit.Test;

/***
 * 
 * Encoded String = 3[a2[bc]] Decoded String = a b c b c a b c b c a b c b c
 * 
 * Transformation 3[a2[bc]]--> 3[a bc bc] --> abcbc abcbc abcbc
 * 
 * Assumption 1. There is always a no >= 1 and <= 9 before a [
 *
 */

public class DecodeString {

	@Test
	public void test1() {

		String encoded = "3[a2[bc]]"; // op - a b c b c a b c b c a b c b c
		decodetheString(encoded);

	}

	public void decodetheString(String encoded) {

		Stack stack = new Stack();
		for (int i = 0; i < encoded.length(); i++) {
			// If u see a ]
			if (encoded.charAt(i) == ']') {
				String s = "";
				Character ch = stack.pop();
				// 1.a pop out the character till u see [
				while (ch != '[') {
					s = ch + s;
					ch = stack.pop();
				}
				// 1.b The next character that u pop will be the number of times to repeat
				ch = stack.pop();

				int repeat = ch - '0';
				// 1.c Compute the repeated String
				String s1 = "";
				for (int j = 1; j <= repeat; j++) {
					s1 += s;
				}
				// 1.d Add the computed String into stack
				for (int j = 0; j < s1.length(); j++) {

					stack.push(s1.charAt(j));
				}
			}
			// 2. Add the character in the stack
			else {
				stack.push(encoded.charAt(i));
			}
		}

		String output = "";
		while (stack.getSize() != 0) {
			output = stack.pop() + output;
		}
		System.out.println(encoded + "--> " + output);
	}
}
