package main.java.optionalPrograms;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.junit.Test;

/***
 * 
 * An arcade game player wants to climb to the top of the leaderboard and track
 * their ranking. The game uses Dense Ranking, so its leaderboard works like
 * this: The player with the highest score is ranked number on the leaderboard.
 * Players who have equal scores receive the same ranking number, and the next
 * player(s) receive the immediately following ranking number. Example The
 * ranked players will have ranks , , , and , respectively. If the player's
 * scores are , and , their rankings after each game are , and . Return .
 *
 */

public class ClimbingLeaderBoard {

	@Test
	public void test01() {
		List<Integer> ranked = Arrays.asList(100, 90, 90, 80);
		List<Integer> player = Arrays.asList(70, 80, 105);
		List<Integer> ExpectedScores = Arrays.asList(4, 3, 1);
		List<Integer> actualScores = climbingLeaderboard(ranked, player);
		assertEquals(ExpectedScores, actualScores);
	}

	public List<Integer> climbingLeaderboard(List<Integer> ranked, List<Integer> player) {
		List<Integer> scores = new ArrayList<>(player.size());
		ranked = ranked.stream().distinct().sorted().toList();
		for (Integer p : player) {
			int index = Collections.binarySearch(ranked, p);
			if (index < 0) {
				index += ranked.size() + 2;
			} else {
				index = ranked.size() + 1 + (-1) * (index + 1);
			}
			scores.add(index);
		}
		return scores;

	}

}
