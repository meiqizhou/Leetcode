package ThreeSumClosest;

import java.util.Arrays;

public class Solution {
    public int threeSumClosest(int[] num, int target) {
    	int min = Integer.MAX_VALUE, res = 0;
    	Arrays.sort(num);
    	for(int i = 0; i < num.length; i++) {
    		int sum = target - num[i];
    		int start = i + 1, end = num.length - 1;
    		while(start < end) {
    			int cur = num[start] + num[end];
    			if(min > Math.abs(sum - cur)) {
    				min = Math.abs(sum - cur);
    				res = cur + num[i];
    			}
    			if(cur < sum) start++;
    			else if(cur > sum) end--;
    			else {
    				start++;
    				end--;
    			}
    		}
    	}
    	return res;
    }
}
