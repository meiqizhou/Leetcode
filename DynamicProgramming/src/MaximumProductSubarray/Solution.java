package MaximumProductSubarray;

public class Solution {
    public int maxProduct(int[] nums) {
    	int max = nums[0], min = nums[0], finalMax = nums[0];
    	for(int i = 1; i < nums.length; i++) {
    		int mm = max, mn = min;
    		max = Math.max(Math.max(mm * nums[i], nums[i]), mn * nums[i]);
    		min = Math.min(Math.min(nums[i], mn * nums[i]), mm * nums[i]);
    		finalMax = Math.max(max, finalMax);
    	}
    	return finalMax;
    }
}
