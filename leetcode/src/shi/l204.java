package shi;

import java.util.*;
public class l204 {
	public int countPrimes1(int n) {
		if (n <= 2) {
			return 0;
		}
		List<Integer> list = new ArrayList<>();
		list.add(2);
		for (int i = 3; i < n; i++) {
			boolean c = true;
			for (Integer num: list) {
//				System.out.println("num1" + num + "i" + i);
				if (i % num == 0) {
					c = false;
					break; 
				}
			}
			if (c) {
				list.add(i);
			}
		}
//		System.out.print(list.toString());
		return list.size();
	}
	public int countPrimes(int n) {
		if (n <= 2) {
			return 0;
		}
		int[] isDeleted = new int[n];
		int count = 0;
		for (int i = 2; i < n; ++i)
			if(isDeleted[i] == 0) {
				++count;
				for(int time = 1; i*time < n; ++time) {
					isDeleted[i*time] = 1;
			}	
		}
		return count;
		
	}
	public static void main(String[] a) {
		l204 t = new l204();
		System.out.print(t.countPrimes(10));
	}

}
