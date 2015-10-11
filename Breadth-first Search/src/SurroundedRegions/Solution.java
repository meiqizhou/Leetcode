package SurroundedRegions;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;


public class Solution {
	private boolean[][] marked;
    public void solve(char[][] board) {
    	if(board.length == 0) return;
    	int rows = board.length, cols = board[0].length;
    	marked = new boolean[rows][cols];
    	for(int i = 1; i < rows - 1; i++) {
    		for(int j = 1; j < cols - 1; j++) {
    			if(!marked[i][j] && board[i][j] == 'O') {
    				List<int[]> list = new ArrayList<int[]>();
    				bfs(board, i, j, list);
    				change(board, list);
    			}
    		}
    	}
    }
    
	private void change(char[][] board, List<int[]> list) {
		// TODO Auto-generated method stub
		for(int i = 0; i < list.size(); i++) {
			board[list.get(i)[0]][list.get(i)[1]] = 'X';
		}
	}
	
	private void bfs(char[][] board, int i, int j, List<int[]> list) {
		// TODO Auto-generated method stub
		boolean touchEdge = false;
		marked[i][j] = true;
		Queue<int[]> queue = new LinkedList<int[]>();
		list.add(new int[]{i, j});
		queue.add(new int[]{i, j});
		while(!queue.isEmpty()) {
			int[] arr = queue.poll();
			int m = arr[0], n = arr[1];
			if(m == 0 || n == 0 || m == board.length - 1 || n == board[0].length - 1) touchEdge = true;
			if(m - 1 > - 1 && !marked[m - 1][n] && board[m - 1][n] == 'O') {
				queue.add(new int[]{m - 1, n});
				list.add(new int[]{m - 1, n});
				marked[m - 1][n] = true;
			}
			if(m + 1 < board.length && !marked[m + 1][n] && board[m + 1][n] == 'O') {
				queue.add(new int[]{m + 1, n});
				list.add(new int[]{m + 1, n});
				marked[m + 1][n] = true;
			}
			if(n - 1 > -1 && !marked[m][n - 1] && board[m][n - 1] == 'O') {
				queue.add(new int[]{m, n - 1});
				list.add(new int[]{m, n - 1});
				marked[m][n - 1] = true;
			}
			if(n + 1 < board[0].length && !marked[m][n + 1] && board[m][n + 1] == 'O') {
				queue.add(new int[]{m, n + 1});
				list.add(new int[]{m, n + 1});
				marked[m][n + 1] = true;
			}
		}
		if(touchEdge) list.clear();
	}
}
