package SingleNumber;

import java.util.HashSet;
import java.util.Set;

public class Solution {
    public int singleNumber(int[] nums) {
    	Set<Integer> set = new HashSet<Integer>();
    	for(int i = 0; i < nums.length; i++) {
    		if(set.contains(nums[i])) set.remove(nums[i]);
    		else set.add(nums[i]);
    	}
    	String s = set.toString().substring(1, set.toString().length() - 1);
    	return Integer.parseInt(s);
    }
}
