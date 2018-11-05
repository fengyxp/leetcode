package shi;

import java.util.*;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

class Test implements l243 {
	public boolean isAnagram1(String s, String t) {
		if (s.length() != t.length()) {
			return false;
		}
		Map<Character, Integer> sMap = new HashMap<>();
		Map<Character, Integer> tMap = new HashMap<>();
		for (int i = 0; i < s.length(); ++i) {
			sMap.put(s.charAt(i), sMap.getOrDefault(s.charAt(i), 0)+1);
			tMap.put(t.charAt(i), tMap.getOrDefault(t.charAt(i), 0)+1);
		}
//		for (Character key: sMap.keySet()) {
//			if (sMap.getOrDefault(key, -1) != tMap.getOrDefault(key, -1)) {
//				return false;
//			}
//		}
		return sMap.equals(tMap);
	}
	public boolean isAnagram(String s, String t) {
		if (s.length() != t.length()) {
			return false;
		}
		int[] sN = new int[256];
		int[] tN = new int[256];
		for (int i = 0; i < s.length(); ++i) {
			sN[s.charAt(i)] += 1;
			tN[t.charAt(i)] += 1;
		}
		return Arrays.equals(sN,tN);
	}

	

}
//class Proxy {
//	public l2422 getProxy() {
//		return 
//	}
//}

public class l242 {
	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		Test a = new Test();
		Test test = (Test) Proxy.newProxyInstance(a.getClass().getClassLoader(), a.getClass().getInterfaces(), new InvocationHandler() {
			@Override
			public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
				if (method.getName().equals("isAnagram1")) {
					System.out.print("isAnagram1");
					return method.invoke(a,args);
					
				}
				if (method.getName().equals("isAnagram")) {
					
					System.out.print("isAnagram");
					return method.invoke(a,args);
				}
				return null;
			}
		});
		
//		Character a = 'a';
//		Character b = 'a';
		
		System.out.println(a.isAnagram("anagram", "nagaram"));

	}
}