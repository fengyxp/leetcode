package shi;

import java.util.*;

/**
 * Definition for an interval.
 * */
class Interval {
      public int start;
      public int end;
      Interval() { start = 0; end = 0; }
      Interval(int s, int e) { start = s; end = e; }
}
 
class cmp implements Comparator<Interval>{
    public int compare(Interval o1, Interval o2) {
        if(o1.start < o2.start){
            return -1;
        }else if (o1.start == o2.start) {
            return 0;
        } else {
        	return 1;
        }
    }
}

class Solution {
    public List<Interval> merge(List<Interval> intervals) {
        intervals.sort(new cmp());
        int i = 0;
        while (i < intervals.size() - 1) {
        	if (intervals.get(i).end >= intervals.get(i+1).start) {
        		intervals.get(i).end = Math.max(intervals.get(i).end, intervals.get(i+1).end);
        		intervals.remove(i+1);
        	} else {
        		i++;
        	}
        }
        return intervals;
    }
}

public class l56 {
	public static void main(String[] args) {
		Solution test = new Solution();
		List<Interval> ter = new ArrayList<Interval>();
		Interval two = new Interval(2,6);
		ter.add(two);
		Interval one = new Interval(1,3);
		ter.add(one);
//		Interval one1 = new Interval(8,10);
//		ter.add(one1);
//		for (Interval v: ter) {
//			System.out.print(v.start);
//		}
		for (Interval v: test.merge(ter)) {
			System.out.println(v.start);
			System.out.println(v.end);
		}
	}
	
}
