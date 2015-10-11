package MergeIntervals;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Solution {
	public class IntervalComparator implements Comparator<Interval>{
		public int compare(Interval i1, Interval i2) {
			// TODO Auto-generated method stub
			if(i1.start > i2.start) return 1;
			else if(i1.start == i2.start) {
				if(i1.end > i2.end) return 1;
				else if(i1.end == i2.end) return 0;
				else return -1;
			}
			else return -1;
		}		
	}
	
    public List<Interval> merge(List<Interval> intervals) {
    	List<Interval> list = new ArrayList<Interval>();
    	if(intervals.size() == 0) return list;
    	if(intervals.size() == 1) return intervals;
    	Collections.sort(intervals, new IntervalComparator());
    	List<Interval> left = new ArrayList<Interval>();
    	left.add(intervals.get(0));
    	List<Interval> right = new ArrayList<Interval>();
    	right.add(intervals.get(1));
    	int R = 2;
    	while(R <= intervals.size()) {
    		left = mergeTwoListIntervals(left, right);
    		right = new ArrayList<Interval>();
    		if(R == intervals.size()) break;
    		right.add(intervals.get(R++));
    	}
    	return left;
    }
    	
	private List<Interval> mergeTwoListIntervals(List<Interval> left, List<Interval> right) {
    	List<Interval> res = new ArrayList<Interval>();
		if(left.get(left.size() - 1).start == right.get(0).start) {
			left.remove(left.size() - 1);
			res.addAll(left);
			res.addAll(right);
		}
		else if(left.get(left.size() - 1).end >= right.get(0).start) {//ึุตþมห
			int i = 0;
			while(i < right.size() && right.get(i).end < left.get(left.size() - 1).end) i++;
			if(i == right.size()) res.addAll(left);
			else {
				Interval temp = new Interval(left.get(left.size() - 1).start, right.get(i).end);
				left.remove(left.size() - 1);
				for(int j = 0; j <= i; j++) {
					right.remove(0);
				}
				res.addAll(left);
				res.add(temp);
				res.addAll(right);
				
			}
		}
		else {
			res.addAll(left);
			res.addAll(right);
		}
		return res;
    }
}
