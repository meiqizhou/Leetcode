package InsertInterval;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public List<Interval> insert(List<Interval> intervals, Interval newInterval) {
    	int lo = newInterval.start;
    	int hi = newInterval.end;
    	int begin = 0, finish = 0;
    	List<Integer> list = new ArrayList<Integer>();
    	for(int i = 0; i < intervals.size(); i++){
    		list.add(intervals.get(i).start);
    		list.add(intervals.get(i).end);
    	}
    	int i = 0, j = list.size() - 1;
    	for(i = 0; i < list.size(); i++){
    		if(list.get(i) >= lo) break;
    	}
    	if(i % 2 == 1) begin = list.get(i - 1);
    	else begin = lo;
    	for(j = list.size() - 1; j > -1; j--){
    		if(list.get(j) <= hi) break;
    	}
    	if(j % 2 == 0) finish = list.get(j + 1);
    	else finish = hi;
    	Interval temp = new Interval(begin, finish);
    	List<Interval> res = new ArrayList<Interval>();
    	for(int k = 0; k < (i - (i % 2)) / 2; k++){
    		res.add(intervals.get(k));
    	}
    	res.add(temp);
    	if(j < 0){
    		for(int k = 0; k < intervals.size(); k++){
    			res.add(intervals.get(k));
    		}
    	}
    	else{
    		for(int k = j / 2 + 1; k < intervals.size(); k++){
        		res.add(intervals.get(k));
        	}
    	}
    	return res;
    }
}
