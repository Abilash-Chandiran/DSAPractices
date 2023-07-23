package main.java.optionalPrograms;

public class ChessBoardColors {

	public static void main(String[] args) {

		String input = "B1";
		System.out.println(isLightColor(input));
		
	}
	
	
	public static boolean isLightColor(String input) {
		
		char column = input.charAt(0);
		int row = Character.getNumericValue(input.charAt(1));
		int columnNumber = column - 'a'+1;
		System.out.println("columnNumber "+ (columnNumber+row));
		System.out.println("a "+'a');
		return (row+columnNumber)%2 == 0;

		
	}

}
