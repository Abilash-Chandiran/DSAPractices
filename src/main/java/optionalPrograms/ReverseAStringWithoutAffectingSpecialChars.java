package main.java.optionalPrograms;

public class ReverseAStringWithoutAffectingSpecialChars {

	public static void main(String[] args) {

		String input = "Hello239$#yoU";
		String output = "uOY#$932OLLEh";
		System.out.println(output.equals(reverseChar(input)));
	}

	public static String reverseChar(String input) {

		int len = input.length() - 1;
		char[] ch = input.toCharArray();
		StringBuffer sb = new StringBuffer();
		char c;
		for (int i = len; i >= 0; i--) {
			if (Character.isUpperCase( ch[len])) {
				c = Character.toLowerCase( ch[len]);
			} else {
				c = Character.toUpperCase( ch[len]);
			}
			sb.append( c);
			len--;
		}
		return sb.toString();
	}

}
