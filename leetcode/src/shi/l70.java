package shi;

public class l70 {

	public int climbStairs(int n) {
        int[] methNums = new int[n];
        if (n <= 2) {
        	return n;
        }
        methNums[0] = 1;
        methNums[1] = 2;
        for (int i = 2; i < n; i++) {
        	methNums[i] = methNums[i-1] + methNums[i-2];
        }
        return methNums[n-1];
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print(new l70().climbStairs(3));

	}

}
