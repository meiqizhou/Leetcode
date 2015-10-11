package WordSearch;


public class Solution {
	public boolean exist(char[][] board, String word) {
		int len = word.length(), rows = board.length, cols = board[0].length;
		boolean[][] marked = new boolean[rows][cols];
		for(int i = 0; i < rows; i++) {
			for(int j = 0; j < cols; j++) {
				if(dfs(board, marked, i, j, word, 0)) return true;
			}
		}
		return false;
    }
	
	public boolean dfs(char[][] board, boolean[][] marked, int i, int j, String word, int index) {
		if (word.charAt(index) != board[i][j]) return false;
        if (index == word.length() - 1) return true;
        marked[i][j] = true;
		if(j + 1 < board[i].length && !marked[i][j + 1] && dfs(board, marked, i, j + 1, word, index + 1)){
			return true;
		}
		if(i + 1 < board.length && !marked[i + 1][j] && dfs(board, marked, i + 1, j, word, index + 1)){
			return true;
		} 
		if(j - 1 > -1 && !marked[i][j - 1] && dfs(board, marked, i, j - 1, word, index + 1)){
			return true;
		}
		if(i - 1 > -1 && !marked[i - 1][j] && index < word.length() && dfs(board, marked, i - 1, j, word, index + 1)){
			return true;
		}
		marked[i][j] = false;
		return false;
	}
}
