package JumpGameII;

public class Solution {
    public int jump(int[] nums) {
    	int step = 0, reach = 0, lastReach = 0;
    	for(int i = 0; i < nums.length; i++) {
    		if(i > lastReach) {
    			step++;
    			lastReach = reach;
    		}
    		reach = Math.max(reach, nums[i] + i);
    	}
    	return reach >= nums.length - 1 ? step : 0;
    }
}