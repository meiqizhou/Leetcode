package Candy;

public class Solution {
    public int candy(int[] ratings) {
    	if(ratings.length == 0) return 0;
    	int N = ratings.length;
    	int[] nums = new int[N];
    	nums[0] = 1;
    	for(int i = 1; i < N; i++) {
    		if(ratings[i] - ratings[i - 1] > 0) nums[i] = nums[i - 1] + 1;
    		else nums[i] = 1;
    	}
    	int res = nums[N - 1];
    	for(int i = N - 2; i > -1; i--) {
    		int cur = 1;
    		if(ratings[i] - ratings[i + 1] > 0) cur = nums[i + 1] + 1;
    		res += Math.max(cur, nums[i]);
    		nums[i] = cur;
    	}
    	return res;
    }
}
