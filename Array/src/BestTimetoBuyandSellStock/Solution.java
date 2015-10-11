package BestTimetoBuyandSellStock;

public class Solution {
    public int maxProfit(int[] prices) {
    	int N = prices.length;
    	if(N == 0 || N == 1) return 0;
    	int[] diff = new int[N - 1];
    	for(int i = 1; i < N; i++){
    		diff[i - 1] = prices[i] - prices[i - 1];
    	}
    	int[] sum = new int[N - 1];
    	sum[0] = diff[0];
    	int max = Math.max(sum[0], 0);
    	for(int i = 1; i < diff.length; i++){
    		sum[i] = Math.max(sum[i - 1] + diff[i], diff[i]);
    		max = Math.max(max, sum[i]);
    	}
    	return max;
    }
}