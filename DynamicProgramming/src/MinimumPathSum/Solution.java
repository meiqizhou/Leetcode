package MinimumPathSum;

public class Solution {
    public int minPathSum(int[][] grid) {
        if(grid[0].length == 0) return 0;
        int rows = grid.length;
        int cols = grid[0].length;
        int[][] sum = new int[rows][cols];
        sum[0][0] = grid[0][0];
        for(int i = 1; i < rows; i++){
        	sum[i][0] = sum[i - 1][0] + grid[i][0];
        }
        for(int j = 1; j < cols; j++){
        	sum[0][j] = sum[0][j - 1] + grid[0][j];
        }
        for(int i = 1; i < rows; i++){
        	for(int j = 1; j < cols; j++){
        		sum[i][j] = grid[i][j] + Math.min(sum[i - 1][j], sum[i][j - 1]);
        	}
        }
        return sum[rows - 1][cols - 1];
    }
}