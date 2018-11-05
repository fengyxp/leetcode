package shi;

import java.util.*;
public class l205 {
	public static boolean isIsomorphic1(String s, String t) {
		Map<Character,Character> map = new HashMap<>();
		if (s.length() <= 1) {
			return true;
		}
//		String st = "";
		for (int i = 0; i < s.length(); i++) {
			if (!map.containsKey(s.charAt(i))) {
				map.put(s.charAt(i),t.charAt(i));
//				st += t.charAt(i);
			} else {
				if(!map.get(s.charAt(i)).equals(t.charAt(i))) {
					return false;
				}
//				st += map.get(s.charAt(i));
			}
		}
		map.clear();
		for (int i = 0; i < t.length(); i++) {
			if (!map.containsKey(t.charAt(i))) {
				map.put(t.charAt(i),s.charAt(i));
//				st += t.charAt(i);
			} else {
				if(!map.get(t.charAt(i)).equals(s.charAt(i))) {
					return false;
				}
//				st += map.get(s.charAt(i));
			}
		}
		return true;
	}
	
	public static boolean isIsomorphic(String s, String t) {
		Map<Character,Integer> sMap = new HashMap<>();
		Map<Character,Integer> tMap = new HashMap<>();
		for (int i = 0; i < s.length(); i++) {
			if (sMap.getOrDefault(s.charAt(i), -1).equals(tMap.getOrDefault(t.charAt(i), -1))) {
				return false;
			} else {
				sMap.put(s.charAt(i), i);
				tMap.put(t.charAt(i), i);
			}
		}
		return true;
		
	}
	public static void main(String[] args) {
		int[] t = new int[5];
		Integer a =1;
		float b = 1.0f;
		System.out.println(a == b); //l205.isIsomorphic("paper", "title")
	}
}
