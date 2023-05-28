package dsa;

import java.util.HashSet;
import java.util.Set;

import org.junit.Test;

public class Permuntation {

	@Test
	public void test() {

		String str = "abc"; //bac, cab,acb,bca,
		permuntation(str);

	}

	public void permuntation(String str) {
		
		for (int i=0;i<str.length();i++) {

			for (char ch : str.toCharArray()) {
				System.out.print(ch);
			}

			System.out.println();
		}

	}

}
