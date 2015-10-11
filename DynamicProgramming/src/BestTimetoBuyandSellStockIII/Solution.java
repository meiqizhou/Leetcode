package BestTimetoBuyandSellStockIII;

public class Solution {
    public int maxProfit(int[] prices) {
        if(prices.length == 0) return 0;
        int[] left = new int[prices.length];
        int[] right = new int[prices.length];
        int min = prices[0]; //最小值
        left[0] = 0; //从左开始到index的最大利润
        for(int i = 1; i < prices.length; i++) {
            min = Math.min(min, prices[i]);
            left[i] = Math.max(left[i - 1], prices[i] - min);
        }
        int max = prices[prices.length - 1]; //最大值
        right[right.length - 1] = 0; //从右开始到index的最大利润
        for(int i = prices.length - 2; i > -1; i--) {
            max = Math.max(max, prices[i]);
            right[i] = Math.max(right[i + 1], max - prices[i]);
        }
        int profit = 0; //左右两端利润之和的最大利润
        for(int i = 0; i < prices.length; i++) {
            profit = Math.max(profit, left[i] + right[i]);
        }
        return profit;
    }
}