package com.code;

import java.util.HashMap;
import java.util.Map;

public class AnagramChecker {
	
	public static boolean anagramCheck(String s1, String s2) {
		Map<Character, Integer> map = new HashMap<Character, Integer>();
		
		char[] cArray1 = s1.replace(" ", "").toLowerCase().toCharArray();
		char[] cArray2 = s2.replace(" ", "").toLowerCase().toCharArray();
		
		for(char c : cArray1) {
			if(!map.containsKey(c)) 
				map.put(c, 1);
			else
				map.put(c, map.get(c) + 1);
		}
		
		for(char c : cArray2) {
			if(!map.containsKey(c)) 
				map.put(c, 1);
			else
				map.put(c, map.get(c) - 1);
		}
		
		for(Map.Entry<Character, Integer> entry : map.entrySet()) {
			if(!(entry.getValue() == 0))
				return false;
		}
		
		return true;
	}
}
