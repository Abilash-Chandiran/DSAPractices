package main.java.optionalPrograms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PractiseTest {

	final static public void main(String... args) {

		// System.out.println("Testing Main Method");

		List<String> list = new ArrayList<String>(Arrays.asList("Bangalore", "Chennai", "Mumbai", "Delhi"));
		String city = "Bangalore";
		list.stream().forEach((a) -> System.out.println(a.contains(city)));

	}

}
