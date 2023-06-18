package main.java.mandatoryHomeWork.week4.day5;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class Crawler {

	@Test
	public void main() {
		String logs[] = { "d1/", "d2/", "../", "d21/", "./" };
		assertEquals(2, minOperations(logs));
	}

	public int minOperations(String[] logs) {
		int level = 0;
		int length = logs.length;
		for (int i = 0; i < length; i++) {
			String log = logs[i];
			if (log.equals("../"))
				level = Math.max(level - 1, 0);
			else if (log.equals("./"))
				continue;
			else
				level++;
		}
		return level;
	}

}
