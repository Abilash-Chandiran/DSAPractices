package main.java.mandatoryHomeWork.week5.day1;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class NumofStudentsUnabletoEat {

	@Test
	public void main() {
		int[] students = { 1, 1, 1, 0, 0, 1 };
		int[] sandwiches = { 1, 0, 0, 0, 1, 1 };
		assertEquals(3, countStudents(students, sandwiches));
	}

	public int countStudents(int[] students, int[] sandwiches) {
		int circularSandwiches = 0;
		int squareSandwiches = 0;

		for (int i = 0; i < students.length; ++i) {
			if (students[i] == 0)
				++circularSandwiches;
			else
				++squareSandwiches;
		}

		for (int i = 0; i < sandwiches.length; ++i) {
			if (sandwiches[i] == 0) {
				if (circularSandwiches == 0)
					return squareSandwiches;
				--circularSandwiches;
			} else {
				if (squareSandwiches == 0)
					return circularSandwiches;
				--squareSandwiches;
			}
		}

		return circularSandwiches + squareSandwiches;
	}

}
