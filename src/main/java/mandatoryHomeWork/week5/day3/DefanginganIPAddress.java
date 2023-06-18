package main.java.mandatoryHomeWork.week5.day3;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class DefanginganIPAddress {

	@Test
	public void test() {

		assertEquals("1[.]1[.]1[.]1", defangIPaddress("1.1.1.1"));
	}

	public String defangIPaddress(String ipAddress) {

		StringBuilder sb = new StringBuilder();
		
		for (char ch : ipAddress.toCharArray()) {

			if (ch == '.')
				sb.append("[.]");
			else
				sb.append(ch);
		}

		return sb.toString();
	}

}
