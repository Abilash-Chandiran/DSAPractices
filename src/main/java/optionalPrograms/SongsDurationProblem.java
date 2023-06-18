package main.java.optionalPrograms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.Test;

/**
 * You are given a list of songs where the ith song has a duration of time[i]
 * seconds. Return the number of pairs of songs for which their total duration
 * in seconds is divisible by 60. Formally, we want the number of indices i, j
 * such that i < j with (time[i] + time[j]) % 60 == 0.
 */

public class SongsDurationProblem {

	@Test
	public void test() {

		List<Integer> time = Arrays.asList(30, 20, 150, 100, 40);
		int Output = 3;
		System.out.println("Test Method "+findSongsDuration(time));
	}

	public int findSongsDuration(List<Integer> time) {

		List<Integer> ls = new ArrayList<>();
		int i = 0, j = time.size()-1, output = 0;
		while (i < time.size()) {
			System.out.println((time.get(i) + time.get(j)) );
			System.out.println((time.get(i) + time.get(j)) % 60 == 0);

			if ((time.get(i) + time.get(j)) % 60 == 0) {
				output++;
				j--;
			}
			i++;
		}
		System.out.println("Output "+output);

		return output;
	}

}
