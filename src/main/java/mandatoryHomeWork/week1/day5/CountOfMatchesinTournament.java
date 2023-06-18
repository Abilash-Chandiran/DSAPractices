package main.java.mandatoryHomeWork.week1.day5;

public class CountOfMatchesinTournament {

	public static void main(String[] args) {

		int n = 7;
		System.out.println(numberOfMatches(n));
	}

	public static int numberOfMatches(int n) {
		int matches = 0;
		while (n != 1) {
			if (n % 2 == 0) {
				matches = (n / 2) + matches;
				n = n / 2;
			} else {
				matches = ((n - 1) / 2) + matches;
				n = ((n - 1) / 2) + 1;
			}
		}
		return matches;
	}
}
