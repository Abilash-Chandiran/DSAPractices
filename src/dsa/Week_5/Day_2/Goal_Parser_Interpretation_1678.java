package dsa.Week_5.Day_2;

import org.junit.Assert;
import org.junit.Test;

/*
Approach - Brute force

- Create a pointer p and string output variable
- Change string command to char[]
- Iterate the loop using while(p<command.length())
- if char[p] == G, return G
-  if char[p] == '(', check p+1 == a and return "al" with P+2
- else return O & P++
- Then return the output
*/

public class Goal_Parser_Interpretation_1678 {
	@Test
	public void data_01() {
		String command = "G()(al)";
		goal_parser(command);
		Assert.assertEquals(goal_parser(command), "Goal");
	}

	@Test
	public void data_02() {
		String command = "";
		goal_parser(command);
		Assert.assertEquals(goal_parser(command), "");
	}

	@Test
	public void data_03() {
		String command = "(al)G(al)()()G";
		goal_parser(command);
		Assert.assertEquals(goal_parser(command), "alGalooG");
	}

	@Test
	public void data_04() {
		String command = "(al)(al)(al)";
		goal_parser(command);
		Assert.assertEquals(goal_parser(command), "alalal");
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

//Time complexity = O(n)
//Space complexity = O(1)