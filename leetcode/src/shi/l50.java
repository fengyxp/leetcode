package shi;

import java.util.*;

public class l50 {
    public double myPow(double x, int n) {
    	double result = 1;
    	int xSign = 0, nSign = 0;
    	if ( x == 0) {
    		return 0;
    	} else if ( x > 0) {
    		xSign = 1;
    	} else {
    		xSign = -1;
    	}
    	if (n == 0) {
    		return 1;
    	}
    	x = x * xSign;
    	int k = Math.abs(n);
    	for (int i = 0; i < k; i ++) {
    		result *= x;
    	}
    	if (n % 2 == 0) {
    		xSign = 1;
    	} 
    	if (n < 0) {
    		result = 1.0 / (xSign * result);
    		
    	} else {
    		result = xSign * result;
    	}
    	result = Math.min(Math.pow(2, 31)-1, Math.max(result, -Math.pow(2, 31)));
    	return result;
    }
    public static void main(String[] args) {
    	l50 test = new l50();
    	System.out.print(test.myPow(2.0, 10));
    }

}
