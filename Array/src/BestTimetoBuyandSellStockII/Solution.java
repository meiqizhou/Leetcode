package BestTimetoBuyandSellStockII;

public class Solution {
    public int maxProfit(int[] prices) {
    	int N = prices.length, sum = 0;
    	for(int i = 1; i < N; i++){
    		if(prices[i] - prices[i - 1] > 0) sum += prices[i] - prices[i - 1];
    	}
    	return sum;
    }
}