package main.java.mandatoryHomeWork.week11.day2;

import java.util.HashMap;
import java.util.Map;

//3. https://www.hackerrank.com/challenges/sherlock-and-valid-string/problem?isFullScreen=true 

public class SherlockValidString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s = "abab";//no
		String s2 = "aabbccddeefghi";//no
		String s3 = "abcdefghhgfedecba";//Yes
		
		String s4 = "aaaaabc";//no
		
		String s5 = "aaaabbcc";//no
		SherlockValidString validString = new SherlockValidString();
		
		System.out.println(validString.isValid(s));
		System.out.println(validString.isValid(s2));
		System.out.println(validString.isValid(s3));
		System.out.println(validString.isValid(s4));
		System.out.println(validString.isValid(s5));

	}
	
	private  String isValid(String s) {
		
		Map<Character, Integer> map = new HashMap<Character, Integer>();
		// tocheck chars count
		for (char charCount : s.toCharArray()) {
			map.put(charCount, map.getOrDefault(charCount, 0) + 1);
		}
//		System.out.println(map);
		Map<Integer, Integer> map2 = new HashMap<Integer, Integer>();
		for (int valueCount : map.values()) {
			map2.put(valueCount, map2.getOrDefault(valueCount, 0) + 1);
		}

//		System.out.println(map2);
//		System.out.println(map2.size());
		if (map2.size() == 1 && map2.containsValue(1)) {
			return "Yes";
		}

		else if (map2.size() == 2 && map2.containsValue(1)) {

			if (map2.containsKey(map2.get(1)) || map2.containsKey(5) || map2.containsKey(4)) {
				return "No";
			}
			return "Yes";
		} else

			return "No";
	}

}
