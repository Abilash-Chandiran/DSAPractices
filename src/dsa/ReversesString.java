package dsa;

public class ReversesString {

	public static void main(String[] args) {

		stringReverse("Chennai Super Kings");
		
		//Ans should be Kings Super Chennai

	}

	public static void stringReverse(String text) {

		String reversedStr = "";
		String[] words = text.split(text);
		
		System.out.println(words.toString());

		for (int i = 0; i < words.length; i++) {

			reversedStr = words[i] + reversedStr;
			System.out.println(reversedStr);

		}

		System.out.println(reversedStr);

	}

}
