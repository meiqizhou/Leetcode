package SummaryRanges;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public List<String> summaryRanges(int[] nums) {
    	List<String> list = new ArrayList<String>();
    	int start = 0, end = 0;
    	String str = "";
    	if(nums.length == 0) return list;
    	if(nums.length == 1) {
    		list.add(nums[0] + "");
    		return list;
    	}
    	while(end < nums.length) {
    		if(end < nums.length - 1 && nums[end + 1] - nums[end] == 1) {
    			end++;
    			if(end == nums.length - 1) {
    				str = nums[start] + "->" + nums[end];
    				list.add(str);
    				return list;
    			}
    		}
    		else if(end < nums.length - 1 && nums[end + 1] - nums[end] != 1){
    			str = start != end ? nums[start] + "->" + nums[end] : nums[end] + "";
    			list.add(str);
    			start = end + 1;
    			end = start;
    			if(end == nums.length - 1) {
    				str = nums[end] + "";
    				list.add(str);
    				return list;
    			}
    		}
    	}
		return list;
    }
}
