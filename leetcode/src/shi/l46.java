package shi;

import java.util.*;

public class l46 {
	    public List<List<Integer>> permute(int[] nums) {
	        List<List<Integer>> result = new ArrayList<List<Integer>>();
	        result = this.get(nums, nums.length);
	        return result;
	        
	    }
	    public List<Integer> insert(List<Integer> value, int insertIndex, int num) {
	    	List<Integer> result = new ArrayList<Integer>(value);
	    	result.add(insertIndex, num);
	    	return result;
//	    	if (insertIndex == 0) {
//	    		result.add(num);
//	    		result.addAll(value);
//	    	} else if (insertIndex == value.size()) {
//	    		result.addAll(value);
//	    		result.add(num);
//	    	} else {
//	    	    result.addAll(value.subList(0, insertIndex));
//	    		result.add(num);
//	    		result.addAll(value.subList(insertIndex, value.size()));
//	    	}	    	
//	    	return result;
	    }
	    public List<List<Integer>> get(int[] nums, int length) {
	    	List<List<Integer>> result = new ArrayList<List<Integer>>();
	        if (length == 0) {
	        	return result;
	        }
	        if (length == 1) {
	        	List<Integer> one = new ArrayList<Integer>();
	        	one.add(nums[0]);
	        	result.add(one);
	        	return result;
	        }
	        List<List<Integer>> beforeResult = this.get(nums, length-1);
	        for (List<Integer> value: beforeResult) {
	        	for (int i=0; i <= value.size(); i++) {
	        		List<Integer> one1 = this.insert(value, i, nums[length-1]);
	        		result.add(one1);
	        	}
	        }
	        return result;
	    
	    }
	    public static void main(String[] args) {
	    	l46 test = new l46();
	    	int[] nums = {1,2,3};
	    	String n = "asfd";
	    	List<List<Integer>> t = test.permute(nums);
	    	for (List<Integer> v: t) {
	    		System.out.println(v);
	    	}    	    	
	    }
}
