package ThreeSumSmaller;

import java.util.Arrays;

public class Solution {
	private int count = 0;
	public int threeSumSmaller(int[] nums, int target) {
		Arrays.sort(nums);
		for(int i = 0; i <= nums.length - 3; i++) {
			count += twoSumSmaller(nums, i + 1, nums.length - 1, target - nums[i]);
		}
		return count;
    }
	private int twoSumSmaller(int[] nums, int i, int j, int target) {
		// TODO Auto-generated method stub
		int total = 0;
		int lo = i, hi = j;
		while(lo < hi) {
			if(nums[lo] + nums[hi] >= target) {
				hi--;
			}
			else {
				total += (hi - lo++); 
			}
		}
		return total;
	}
}
