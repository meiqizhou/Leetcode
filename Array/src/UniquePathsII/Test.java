package UniquePathsII;

public class Test {
	public static void main(String[] args) {
		Solution s = new Solution();
		int[][] obstacleGrid = new int[1][1];
		obstacleGrid[0] = new int[]{1};
//		obstacleGrid[1] = new int[]{0,1,0};
//		obstacleGrid[2] = new int[]{0,0,0};
		int res = s.uniquePathsWithObstacles(obstacleGrid);
		System.out.println(res);
	}
}
