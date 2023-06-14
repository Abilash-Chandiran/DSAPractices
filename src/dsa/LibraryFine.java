package dsa;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

/*
 * Complete the 'libraryFine' function below.
 * The function is expected to return an INTEGER. The function accepts following
 * parameters: 1. INTEGER d1 2. INTEGER m1 3. INTEGER y1 4. INTEGER d2 5.
 * INTEGER m2 6. INTEGER y2
 */
public class LibraryFine {

	public static int libraryFine(int d1, int m1, int y1, int d2, int m2, int y2) {

		int libfine = 0;

		if (y1 > y2) {

			libfine = 10000;
		} else if (y1 < y2) {

			libfine = 0;
		} else if (m1 < m2) {

			libfine = 0;
		} else if (m1 > m2) {

			libfine = 500 * (m1 - m2);
		} else if (d1 > d2) {

			libfine = 15 * (d1 - d2);
		}

		return libfine;
	}

	public static void main(String[] args) throws IOException {
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

		String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

		int d1 = Integer.parseInt(firstMultipleInput[0]);

		int m1 = Integer.parseInt(firstMultipleInput[1]);

		int y1 = Integer.parseInt(firstMultipleInput[2]);

		String[] secondMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

		int d2 = Integer.parseInt(secondMultipleInput[0]);

		int m2 = Integer.parseInt(secondMultipleInput[1]);

		int y2 = Integer.parseInt(secondMultipleInput[2]);

		//Commented here - need to check "Result" library
		
		//int result = Result.libraryFine(d1, m1, y1, d2, m2, y2);

		//bufferedWriter.write(String.valueOf(result));
		bufferedWriter.newLine();

		bufferedReader.close();
		bufferedWriter.close();
	}

}
