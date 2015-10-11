package WordSearchII;

import java.util.ArrayList;
import java.util.List;

public class Solution {
	private List<String> res = new ArrayList<String>();
	private boolean[][] marked;
    public List<String> findWords(char[][] board, String[] words) {
    	int rows = board.length, cols = board[0].length;
    	for(int i = 0; i < rows; i++) {
    		for(int j = 0; j < cols; j++) {
    			for(int k = 0; k < words.length; k++) {
    				marked = new boolean[rows][cols];
    				if(dfs(board, marked, i, j, words[k], board[i][j] + "", 0)) continue;
    			}
    		}
    	}
		return res;
    }
    
    public boolean dfs(char[][] board, boolean[][] marked, int i, int j, String word, String s, int index) {
    	if (word.charAt(index) != board[i][j]) return false;
        if (index == word.length() - 1) {
        	if(!res.contains(s)) res.add(s);
        	return true;
        }
        marked[i][j] = true;
		if(j + 1 < board[i].length && !marked[i][j + 1] && dfs(board, marked, i, j + 1, word, s + board[i][j + 1], index + 1)) return true;
		if(i + 1 < board.length && !marked[i + 1][j] && dfs(board, marked, i + 1, j, word, s + board[i + 1][j], index + 1)) return true;
		if(j - 1 > -1 && !marked[i][j - 1] && dfs(board, marked, i, j - 1, word, s + board[i][j - 1], index + 1)) return true;
		if(i - 1 > -1 && !marked[i - 1][j] && index < word.length() && dfs(board, marked, i - 1, j, word, s + board[i - 1][j], index + 1)) return true;
		marked[i][j] = false;
		return false;
    }
}
