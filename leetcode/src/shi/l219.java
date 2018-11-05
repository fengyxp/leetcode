package shi;

import java.util.*;
public class l219 {
	public boolean containsNearbyDuplicate1(int[] nums, int k) {
        if (k == 0 ) {
        	return false;
        }
        int result = Integer.MAX_VALUE;
        for (int i = 0; i < nums.length-1; ++i) {
        	int one = Integer.MAX_VALUE;
        	for (int j = 0; j < nums.length; ++j) {
        		if (nums[i] == nums[j]) {
        			one = one > (j-i) ? (j-i) : one; 
        		}
        	}
        	result = one > result ? result : one;
        }
		return result <= k; 
    }
	public boolean containsNearbyDuplicate(int[] nums, int k) {
		if (k == 0) {
			return false;
		}
		Map<Integer, Integer> map = new HashMap<>();
		for (int i = 0; i < nums.length; ++i) {
			if (map.containsKey(nums[i])) {
				if ((i - map.get(nums[i])) <= k) {
					return true;
				}
			}
			map.put(nums[i], i);
		}
		return false;
	}

}
