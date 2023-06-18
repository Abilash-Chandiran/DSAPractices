package main.java.optionalPrograms;
public class ReverseWordsinaString {

	public static void main(String[] args) {

		String s = "Welcome To Testleaf";
		reversewords(s);
		// emocleW oT fealtseT

	}

	public static void reversewords(String s) {
		String[] s1 = s.toString().split(" ");

		StringBuilder sb = new StringBuilder();
		
		for (int i = s1.length - 1; i >= 0; i--) {
			sb.append(s1[i] + " ");
		}

		String str = sb.reverse().toString();
		System.out.println(str);

	}

}
