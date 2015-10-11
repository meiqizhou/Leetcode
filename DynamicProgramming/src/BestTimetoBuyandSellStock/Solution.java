package BestTimetoBuyandSellStock;

public class Solution {
    public int maxProfit(int[] prices) {
    	int len = prices.length, sum = 0, max = 0;
    	int[] diff = new int[len - 1];
    	for(int i = 0; i < prices.length - 1; i++) {
    		diff[i] = prices[i + 1] - prices[i];
    	}
    	for(int i = 0; i < diff.length; i++) {
    		sum = Math.max(sum + diff[i], diff[i]);
    		max = Math.max(sum, max);
    	}
    	return max;
    }
}
