package main.java.mandatoryHomeWork.week5.day2;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class GoalParserInterpretation {
	@Test
	public void test1() {
		String command = "G()(al)";
		goal_parser(command);
		assertEquals(goal_parser(command), "Goal");
	}

	@Test
	public void test2() {
		String command = "";
		goal_parser(command);
		assertEquals(goal_parser(command), "");
	}

	@Test
	public void test3() {
		String command = "(al)G(al)()()G";
		goal_parser(command);
		assertEquals(goal_parser(command), "alGalooG");
	}

	@Test
	public void test4() {
		String command = "(al)(al)(al)";
		goal_parser(command);
		assertEquals(goal_parser(command), "alalal");
	}

	private String goal_parser(String command) {
		char[] c = command.toCharArray();
		int p = 0;
		String output = "";
		while (p < command.length()) {
			if (c[p] == 'G') {
				output = output + c[p];
			} else if (c[p] == '(') {
				if (c[p + 1] == 'a' && c[p + 2] == 'l' && c[p + 3] == ')') {
					output = output + "al";
					p = p + 3;
				} else {
					output = output + "o";
					p++;
				}
			} else if (command.length() == 0) {
				output = "";
			}
			p++;
		}
		System.out.println(output);
		return output;
	}

}
