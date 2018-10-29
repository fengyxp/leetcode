package shi;

import java.math.BigInteger;
import java.util.*;

public class l89 {
	
	public List<Integer> grayCode(int n) {
		List<Integer> result = new ArrayList<Integer>();
		if (n ==0) {
			result.add(0);
		} else {
			String s = "";
			for (int i = 0; i < n; i++) {
				s += "0";
			}
			int length = (int)Math.pow(2, n);
			result.add(0);
			this.getResult(result, s, length);
		}
		return result;
	}
	
	public String getF(String s, int index) {
		String result = "";
		int sign = ((int)s.charAt(index) - (int)('0')) ^ 1;
		if (index == 0) {
			result += sign + s.substring(1);
		} else if (index > 0 && index < (s.length()-1)) {
			result += s.substring(0,index) + sign + s.substring(index+1);
		} else {
			result += s.substring(0,index) + sign;
		}
		return result;
		
	}
	
	public void getResult(List<Integer> result, String num, int length) {
		if (result.size() == length) {
			return;
		} else {
			for (int i = 0; i < num.length(); i++) {
				String s = this.getF(num, i);
				Integer one = Integer.parseInt(s,2);
				if (!result.contains(one)) {
					result.add(one);
					this.getResult(result, s, length);
				}
			}
		}
		return;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer n = 3;
//		int  sign= 0 ^ 1;
//		System.out.print(sign);
		System.out.print(new l89().grayCode(2));

	}

}
