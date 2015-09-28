package PaintHouse;

public class Solution {
    public int minCost(int[][] costs) {
    	if(costs.length == 0) return 0;
    	int[][] dp = new int[costs.length][costs[0].length];
    	dp[0] = costs[0];
    	for(int i = 1; i < dp.length; i++) {
    		dp[i][0] = Math.min(dp[i - 1][1], dp[i - 1][2]) + costs[i][0];
    		dp[i][1] = Math.min(dp[i - 1][0], dp[i - 1][2]) + costs[i][1];
    		dp[i][2] = Math.min(dp[i - 1][0], dp[i - 1][1]) + costs[i][2];
    	}
    	return min(dp[dp.length - 1]);
    }

	private int min(int[] A) {
		// TODO Auto-generated method stub
		return Math.min(Math.min(A[0], A[1]), A[2]);
	}
}

