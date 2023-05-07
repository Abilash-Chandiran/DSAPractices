package dsaWeek2Day3;

public class ReverseVowelsusing2Pointers {

	/**
	 * 
	 * Create swap method Iterate String and check for vowels if the condition
	 * satisfies then do swap
	 * 
	 */

	public static void main(String[] args) {

		String s = "Hello Everyone! Welcome to Testleaf";
		String s2 = reverseVowels(s);
		System.out.println(s2);
	}

	public static String reverseVowels(String s) {

		char chars[] = s.toCharArray();
		int i = 0;
		int j = chars.length - 1;

		while (i < j) {

			if (isVowel(chars[i]) && isVowel(chars[j])) {

				char temp = chars[i];
				chars[i] = chars[j];
				chars[j] = temp;
			}
		}
		return new String(chars);
	}

	public static boolean isVowel(char ch) {

		char vs[] = { 'a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U' };
		boolean bool = false;
		for (char c : vs) {
			if (c == ch) {
				bool = true;
			} else
				bool = false;
		}
		return bool;
	}

}
