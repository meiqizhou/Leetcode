package DungeonGame;

public class Solution {
	public int calculateMinimumHP(int[][] dungeon) {
		if(dungeon[0].length == 0) return 0;
        int rows = dungeon.length;
        int cols = dungeon[0].length;
        int[][] sum = new int[rows][cols];
        sum[0][0] = dungeon[0][0];
        for(int i = 1; i < rows; i++){
        	sum[i][0] = sum[i - 1][0] + dungeon[i][0];
        }
        for(int j = 1; j < cols; j++){
        	sum[0][j] = sum[0][j - 1] + dungeon[0][j];
        }
        for(int i = 1; i < rows; i++){
        	for(int j = 1; j < cols; j++){
        		sum[i][j] = dungeon[i][j] + Math.max(sum[i - 1][j], sum[i][j - 1]);
        	}
        }
        return sum[rows - 1][cols - 1];
    }
}
