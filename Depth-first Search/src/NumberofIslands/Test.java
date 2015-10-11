package NumberofIslands;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Solution s = new Solution();
//		char[][] grid = new char[1][1];
//		grid[0][0] = '1';
		char[][] grid = new char[4][5];
		grid[0][0] = '1';
		grid[0][1] = '1';
		grid[0][2] = '1';
		grid[0][3] = '1';
		grid[1][0] = '1';
		grid[1][1] = '1';
		grid[1][3] = '1';
		grid[2][0] = '1';
		grid[2][1] = '1';
		for(int i = 0; i < 4; i++){
			for(int j = 0; j < 5; j++){
				if(grid[i][j] != '1') grid[i][j] = '0';
			}
		}
		int res = s.numIslands(grid);
		System.out.println(res);
	}

}
