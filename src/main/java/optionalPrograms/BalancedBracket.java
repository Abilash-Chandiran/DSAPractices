package main.java.optionalPrograms;

import java.util.EmptyStackException;
import java.util.HashMap;
import org.junit.Test;

public class BalancedBracket {

	@Test
	public void test1() {

		String s = "[{}]";
		HashMap<Character, Character> hm = new HashMap<Character, Character>();
		hm.put('{', '}');
		hm.put('[', ']');
		hm.put('{', '}');

		boolean invalid = false;
		Stack stack = new Stack();

		try {
			for (int i = 0; i < s.length(); i++) {
				if (hm.containsKey(s.charAt(i))) {
					stack.push(s.charAt(i));
				} else {
					if ((Character) s.charAt(i) != hm.get(stack.pop())) {
						invalid = true;
						break;
					}
				}

			}
			// To handle the case of ((( check stack size
			if (!invalid) {
				System.out.println("valid");
			} else {
				System.out.println("invalid");
			}
		} catch (EmptyStackException e) {
			System.out.println("invalid");
		}
	}
}
