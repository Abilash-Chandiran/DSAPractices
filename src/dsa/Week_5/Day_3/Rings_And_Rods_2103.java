package dsa.Week_5.Day_3;

import java.util.HashMap;

import org.junit.Test;

public class Rings_And_Rods_2103 {
	@Test
	public void data_01() {
		String rings = "B0B6G0R6R0R6G9";
		int rods = 10;
		rbg(rings, rods);
	}

	@Test
	public void data_02() {
		String rings = "R3G2B1";
		int rods = 10;
		rbg(rings, rods);
	}

	@Test
	public void data_03() {
		String rings = "R3B3G3";
		int rods = 10;
		rbg(rings, rods);
	}

	@Test
	public void data_04() {
		String rings = "B0B1G9";
		int rods = 10;
		rbg(rings, rods);
	}

	@Test
	public void data_05() {
		String rings = "B0B6G0R0R6G6";
		int rods = 10;
		rbg(rings, rods);
	}

	private void rbg(String rings, int rods) {
		int p1 = 0, p2 = 0, i = 0;
		char[] ch = rings.toCharArray();
		String output = "";
		HashMap<String, Character> map = new HashMap<String, Character>();
		p1 = ++p2;
		System.out.println("Ivalid colour");

	}
}
