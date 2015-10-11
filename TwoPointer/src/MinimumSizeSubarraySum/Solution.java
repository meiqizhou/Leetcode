package MinimumSizeSubarraySum;

public class Solution {
	public int minSubArrayLen(int s, int[] nums) {
		int[] sum = getSumArray(nums);
		int len = sum.length, minLen = Integer.MAX_VALUE, start = 0, end = 0;
		if(sum[len - 1] < s) return 0;
		while(end < len) {
			if(sum[end] >= s) break;
			end++;
		}
		while(end < len) {
			while(start < end && sum[end] - sum[start] >= s) start++;
			if(sum[end] - sum[start] < s) minLen = Math.min(minLen, end - start + 1);
			end++;
		}
		return minLen;
	}

	public int arraySum(int[] nums, int lo, int hi) {
		int sum = 0;
		for(int i = lo; i <= hi; i++) {
			sum += nums[i];
		}
		return sum;
	}
	
	public int[] getSumArray(int[] nums) {
		int sum[] = new int[nums.length + 1];
		sum[0] = 0;
		for(int i = 1; i < sum.length; i++) {
			sum[i] = arraySum(nums, 0, i - 1);
		}
		return sum;
	}
}
