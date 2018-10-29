package shi;

import java.util.Arrays;

public class three16 {

	public int threeSumClosest1(int[] nums, int target) {
		int result = Integer.MAX_VALUE;
		int r = 0;
		int length = nums.length;
		for(int i = 0; i < length - 2; i++) {
			for(int j = i + 1; j < length - 1; j++) {
				for(int k = j + 1; k < length; k++) {
					int g = Math.abs(nums[i] + nums[j] + nums[k] - target);
					if(g < result) {
						result = g;
						r = nums[i] + nums[j] + nums[k];
					}
				}
			}
		}
		return r;
	}
	public int threeSumClosest(int[] nums, int target) {
		int result = Integer.MAX_VALUE;
		int cha = Integer.MAX_VALUE;
		Arrays.sort(nums);
		for(int i = 0; i < nums.length - 2; i++) {
			int y = target - nums[i];
			int left = i + 1;
			int right = nums.length - 1;
			while(left < right) {
				while( (left < right) && (nums[right] + nums[left] <= y) ) {
					int g = Math.abs(y - nums[left] + nums[left]);
					if(g < cha) {
						cha = g;
						result = nums[left] + nums[left] + nums[i];
					}
					left++;
				}
				while( (left < right) && (nums[right] + nums[left] > y) ) {
					int g1 = Math.abs(y - nums[left] + nums[left]);
					if(g1 < cha) {
						cha = g1;
						result = nums[left] + nums[left] + nums[i];
					}
					right--;
				}
				int g2 = Math.abs(y - nums[left] + nums[left]);
				if(g2 < cha) {
					cha = g2;
					result = nums[left] + nums[left] + nums[i];
				}
			}
		}
		return result;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {4,2,8};
		
		for(int i = 0; i < nums.length; i++) {
			System.out.println(nums[i] + " ");
		}
		
		for(int value:nums) {
			System.out.println(value + ' ');
		}
		//a.threeSumClosest(nums, 1);
	}

}
