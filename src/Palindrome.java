
public class Palindrome {

	public static void main(String[] args) {
		String s = "MadaM";
		palindromeCheck(s);
	}

	public static void palindromeCheck(String s) {

		StringBuffer sb = new StringBuffer(s);
		sb.reverse();
		if (s.equals(sb.toString()))
			System.out.println(s + " is a Palindrome");
		else
			System.out.println(s + " is a not Palindrome");
	}
}
