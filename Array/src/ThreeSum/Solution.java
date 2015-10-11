package ThreeSum;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {
    public List<List<Integer>> threeSum(int[] num) {
    	List<List<Integer>> res = new ArrayList<List<Integer>>();
    	Arrays.sort(num);
    	if(num.length < 3) return res;
    	for(int i = 0; i < num.length - 2; i++) {
    		if(i == 0 || num[i] > num[i - 1]) {
    			int target = 0 - num[i], start = i + 1, end = num.length - 1;
    			while(start < end) {
    				if(num[start] + num[end] < target) start++;
    				else if(num[start] + num[end] > target) end--;
    				else {
    					List<Integer> list = new ArrayList<Integer>();
    					list.add(num[i]);
    					list.add(num[start]);
    					list.add(num[end]);
    					res.add(list);
    					start++;
    					end--;
    					while(start < end && num[start] == num[start - 1]) start++;
    					while(start < end && num[end] == num[end + 1]) end--;
    				}
    			}
    			
    		}
    	}
		return res;
    }
}