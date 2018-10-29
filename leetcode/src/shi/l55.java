package shi;

import java.util.Arrays;

public class l55 {

	public boolean canJump(int[] nums) {
		if (nums.length <= 1) {
			return true;
		}
		int sign = Integer.MIN_VALUE;
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] == 0) {
				if (sign <= i) {
					return false;
				}
			} else {
				if (nums[i] + i > sign) {
					sign = nums[i] + i;
					if (sign >= nums.length - 1) {
						return true;
					}
				}
			}
		}
		return false;
	}
	
	public boolean canJump2(int[] nums) {
		boolean[] canArray = new boolean[nums.length];
		canArray[0] = true;
		for (int i = 1; i < nums.length; i++) {
			for (int j = 0; j < i; j++) {
				if (canArray[j] && (nums[j]+j >= i)) {
					canArray[i] = true;
					break;
				}
			}
			
		}
		return canArray[nums.length-1];
	}
	
	public boolean canJump1(int[] nums) {
		if (nums.length <= 1) {
			return true;
		}
		
		for (int i = nums.length - 2; i >= 0 ; i--) {
			int[] copyNums = Arrays.copyOf(nums, i+1);
			if (this.canJump(copyNums) && (nums[i]+i >= nums.length-1)) {
				return true;
			}
		}
		return false;     
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		l55 test = new l55();
		System.out.print(test.canJump(new int[]{3,2,1,0,4}));

	}

}
