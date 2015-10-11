package NumberofIslands;

public class Solution {
	private boolean[][] marked;
	private int count = 0;
    public int numIslands(char[][] grid) {    	
    	int row = grid.length;
    	if(row == 0) return 0;
    	int col = grid[0].length;
    	marked = new boolean[row][col];
    	for(int i = 0; i < row; i++){
    		for(int j = 0; j < col; j++){
    			if(grid[i][j] == '1' && !marked[i][j]){
    				dfs(grid, i, j);
    				count++;
    			}
    		}
    	}
    	return count;
    }
	private void dfs(char[][] grid, int i, int j) {
		marked[i][j] = true;
		if(j + 1 < grid[i].length && !marked[i][j + 1] && grid[i][j + 1] == '1') dfs(grid, i, j + 1);
		if(i + 1 < grid.length && !marked[i + 1][j] && grid[i + 1][j] == '1') dfs(grid, i + 1, j);
		if(j - 1 > -1 && !marked[i][j - 1] && grid[i][j - 1] == '1') dfs(grid, i, j - 1);
		if(i - 1 > -1 && !marked[i - 1][j] && grid[i - 1][j] == '1') dfs(grid, i - 1, j);
	}
}
