package main.java.optionalPrograms;

import java.util.HashMap;
import java.util.Map;

import org.junit.Test;

public class SubstringofString {

	@Test
	public void test01() {
		String s = "xyzzaz";
		subString(s);

	}
	
	
	public void subString(String s) {
		
		char[] ch = s.toCharArray();
		Map<Integer,Character> hm = new HashMap<Integer,Character>();
		
		for(int i=0;i<s.length();i++) {
			
			hm.put(i, ch[i]);
			
			
		}
		
	}
	

}
