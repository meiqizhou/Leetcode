package WallsandGates;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Solution {
	private int INF = Integer.MAX_VALUE;
	private boolean[][] marked;
    public void wallsAndGates(int[][] rooms) {
    	int rows = rooms.length;
    	if(rows == 0) return;
    	int cols = rooms[0].length;
    	marked = new boolean[rows][cols];
    	for(int i = 0; i < rows; i++) {
    		for(int j = 0; j < cols; j++) {
    			if(rooms[i][j] == 0) {
    				bfs(rooms, marked, i, j);
    				marked = new boolean[rows][cols];
    			}
    		}
    	}
    	return;
    }
    
	private void bfs(int[][] rooms, boolean[][] marked, int row, int col) {
		// TODO Auto-generated method stub
		int distance = 0;
		Queue<int[]> queue = new LinkedList<int[]>();
		queue.add(new int[]{row, col});
		while(!queue.isEmpty()) {
			List<int[]> list = new ArrayList<int[]>();
			while(!queue.isEmpty()) {
				int[] arr = queue.poll();
				list.add(arr);
				int i = arr[0], j = arr[1];
				marked[i][j] = true;
				rooms[i][j] = Math.min(rooms[i][j], distance);
			}
			distance++;
			for(int[] arr: list) {
				int i = arr[0], j = arr[1];
				if(i - 1 > -1 && !marked[i - 1][j] && rooms[i - 1][j] != 0 && rooms[i - 1][j] != -1) queue.add(new int[]{i - 1, j});
				if(i + 1 < rooms.length && !marked[i + 1][j] && rooms[i + 1][j] != 0 && rooms[i + 1][j] != -1) queue.add(new int[]{i + 1, j});
				if(j - 1 > -1 && !marked[i][j - 1] && rooms[i][j - 1] != 0 && rooms[i][j - 1] != -1) queue.add(new int[]{i, j - 1});
				if(j + 1 < rooms[0].length && !marked[i][j + 1] && rooms[i][j + 1] != 0 && rooms[i][j + 1] != -1) queue.add(new int[]{i, j + 1});
			}
		}
	}
}
