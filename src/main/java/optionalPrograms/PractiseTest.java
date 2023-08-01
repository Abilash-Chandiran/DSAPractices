package main.java.optionalPrograms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class PractiseTest {

	final static public void main(String... args) {

		// System.out.println("Testing Main Method");

		List<String> list = new ArrayList<String>(Arrays.asList("Alappuzha", "AGRA", "Bangalore", "Chennai", "Mumbai",
				"Delhi", "Badrinath", "Bhubaneswar", "Bihar"));

		list.stream().filter(s -> s.startsWith("A")).map(String::toUpperCase).forEach(System.out::println);

		/*
		 * System.out.println(
		 * "-------------------------------------------------------------");
		 * 
		 * List<Integer> empIds = Arrays.asList(1, 2, 3, 4, 5);
		 * 
		 * list.stream().filter(s -> s.startsWith("B")).forEach(System.out::println);
		 * 
		 * System.out.println(
		 * "-------------------------------------------------------------");
		 * 
		 * list.stream().sorted().map(String::toUpperCase).forEach(System.out::println);
		 * 
		 * System.out.println(
		 * "-------------------------------------------------------------");
		 * 
		 * Stream<Integer> stream = empIds.stream(); // List<Integer> empIdlist =
		 * stream.filter(i -> i * 10 == // 50).collect(Collectors.toList());
		 * 
		 * boolean empIdlist2 = stream.anyMatch(i -> i * 10 == 50);
		 * System.out.println(empIdlist2);
		 */

	}

}
