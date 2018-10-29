package shi;

import java.util.*;


import java.lang.*;

public class l27 {
	public void delete(int[] nums, int index, int length) {
		for (int i = index; i < length-1; i++) {
			nums[i] = nums[i+1];
		}
	}
	public int removeElement(int[] nums, int val) {
		int result = 0, d = 0;
		for (int i = nums.length-1; i >= 0; i--) {
			if (nums[i] == val) {
				this.delete(nums, i, nums.length-d);
				d++;
			}
		}
		result = nums.length - d;
		return result;
	}
	public static void main(String[] args) {
//		l27 a = new l27();
//		int[] nums = {1, 3, 4};
//		int l = a.removeElement(nums, 3);
//		System.out.print(l);
//		for (int b: Arrays.copyOf(nums, l)) {
//			System.out.print(b);
//		}
//		
		Integer a = 3;
		System.out.print(a);
		a = 2;
		System.out.print(a);
		
	}

}
