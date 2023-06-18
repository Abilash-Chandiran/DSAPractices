package main.java.optionalPrograms;

/***
 * 
 * use stack & string builder 
 * Iterate over given parenthesis 
 * Closing bracket will pop and open will push
 * check stack is empty or not if it will then can't add in to String
 * return sb.toString
 * Time complexity: O(n)
 * Space complexity: O(n)
 */

public class RemoveOuterParanthesis {

	public static void main(String[] args) {
		String s = "(()())(())";
		System.out.println(removeOuterParentheses(s));
	}

	public static String removeOuterParentheses(String s) {
		Stack st = new Stack();
		StringBuilder sb = new StringBuilder("");
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == '(') {
				if (st.getSize() > 0) {
					sb.append(s.charAt(i));
				}
				st.push(s.charAt(i));
			} else if (s.charAt(i) == ')') {
				st.pop();
				if (st.getSize() > 0) {
					sb.append(s.charAt(i));

				}
			}
		}
		return sb.toString();

	}

}
