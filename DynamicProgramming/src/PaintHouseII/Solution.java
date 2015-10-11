package PaintHouseII;

public class Solution {
    public int minCostII(int[][] costs) {
        int rows = costs.length;
        if(rows == 0) return 0;
        int cols = costs[0].length;
        int[][] dp = new int[rows][cols];
        dp[0] = costs[0];
        for(int i = 1; i < rows; i++) {
            for(int j = 0; j < cols; j++) {
                dp[i][j] = min(dp[i - 1], 0, j - 1, j + 1, cols - 1) + costs[i][j];
            }
        }
        return min(dp[dp.length - 1], 0, -1, 0, cols - 1);
    }
    
    private int min(int[] nums, int s1, int e1, int s2, int e2) {
        int min = Integer.MAX_VALUE;
        for(int i = s1; i <= e1; i++) {
            min = Math.min(nums[i], min);
        }
        for(int i = s2; i <= e2; i++) {
            min = Math.min(nums[i], min);
        }
        return min;
    }
}
