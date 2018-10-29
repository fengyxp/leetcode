package shi;

import java.util.*;

class Solution1 {
	public boolean judge(String s, Map<String, String> map) {
		if (s.length() == 0) {
			return true;
		} 
		if (s.length() == 2 ) {
			System.out.println(s.substring(0, 1));
			System.out.println(s.substring(1, 2));
			return  map.get(s.substring(0, 1)).equals(s.substring(1, 2));
		}
		int i = 0;
		while (i < s.length()) {
			if (!map.containsKey(s.substring(i, i+1))) {
				return false;
			}
			boolean sign = false;
			for (int j = i+1; j < s.length(); j++) {
				if (map.get(s.substring(i, i+1)).equals(s.substring(j, j+1))) {
					if (!this.judge(s.substring(i+1, j), map)) {
						return false;
					}
					sign = true;
					i = j + 1;
					break;
				}
			}
			if (!sign) {
				return false;
			}
		}
		return true;
	}
    public boolean isValid(String s) {
    	if (s.length() % 2 != 0) {
    		return false;
    	}
    	Map<String, String> map = new HashMap<String, String>(); 
    	map.put("(", ")");
    	map.put("{", "}");
    	map.put("[", "]");
        return this.judge(s, map);
    }
}

public class l20 {
	public static void main(String[] args) {
		Solution1 test = new Solution1();
		if (test.isValid("(([]){})")) {
			System.out.println("true");
		}
		System.out.println(0);
	}
		
	
}
