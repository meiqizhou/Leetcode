package ThreeSumSmaller;

import java.util.Arrays;

public class Solution {
	private int sum = 0;
	public int threeSumSmaller(int[] nums, int target) {
        Arrays.sort(nums);
        for(int i = 0; i < nums.length; i++) {
        	sum += twoSumSmaller(nums, i + 1, nums.length - 1, target - nums[i]);
        }
        return sum;
    }
	private int twoSumSmaller(int[] nums, int i, int j, int target) {
		// TODO Auto-generated method stub
		int total = 0;
		while(i < j) {
			if(nums[i] + nums[j] < target) {
				total += j - i++;
			}
			else j--;
		}
		return total;
	}
}
