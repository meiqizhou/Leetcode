package MissingRanges;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public List<String> findMissingRanges(int[] nums, int lower, int upper) {
    	List<String> res = new ArrayList<String>();
    	if(nums.length == 0) {
    	    if(upper == lower) res.add(String.valueOf(lower));
    	    else res.add(String.valueOf(lower) + "->" + String.valueOf(upper));
    	    return res;
    	}
    	if(lower > nums[nums.length - 1] || upper < nums[0]) return res;
    	List<Integer> list = getList(nums, lower, upper);
    	getMissingRanges(list, res);
    	return res;
    }

	private void getMissingRanges(List<Integer> list, List<String> res) {
		// TODO Auto-generated method stub
		if(list.get(1) - list.get(0) == 2) res.add(String.valueOf(list.get(1) - 1));
		else if(list.get(1) - list.get(0) > 2) res.add(String.valueOf(list.get(0)) + "->" + String.valueOf(list.get(1) - 1));
		for(int i = 1; i < list.size() - 1; i++) {
			if(list.get(i) - list.get(i - 1) == 1) continue;
			else if(list.get(i) - list.get(i - 1) == 2) res.add(String.valueOf(list.get(i) - 1));
			else res.add(String.valueOf(list.get(i - 1) + 1) + "->" + String.valueOf(list.get(i) - 1));
		}
		if(list.get(list.size() - 1) - list.get(list.size() - 2) == 2) res.add(String.valueOf(list.get(list.size() - 1) - 1));
		else if(list.get(list.size() - 1) - list.get(list.size() - 2) > 2) res.add(String.valueOf(list.get(list.size() - 2) + 1) + "->" + String.valueOf(list.get(list.size() - 1)));
	}

	private List<Integer> getList(int[] nums, int lower, int upper) {
		// TODO Auto-generated method stub
		int flag = 0;
		List<Integer> list = new ArrayList<Integer>();
    	if(lower < nums[0]) list.add(lower);
    	for(int i = 0; i < nums.length - 1; i++) {
    		list.add(nums[i]);
    		if(nums[i] < lower && nums[i + 1] > lower) list.add(lower);
    		if(nums[i] < upper && nums[i + 1] > upper) {
    			list.add(upper);
    			flag = 1;
    			break;
    		}
    	}
    	if(flag == 0) list.add(nums[nums.length - 1]);
    	if(upper > nums[nums.length - 1]) list.add(upper);
    	return list;
	}
}
