package ValidSudoku;

import java.util.HashSet;
import java.util.Set;

public class Solution {
    public boolean isValidSudoku(char[][] board) {
    	int rows = board.length, cols = board[0].length;
    	//check every row
    	for(int i = 0; i < rows; i++) {
    		Set<Character> set = new HashSet<Character>();
    		for(int j = 0; j < cols; j++) {
    			if(set.contains(board[i][j]) && board[i][j] != '.') return false;
    			else set.add(board[i][j]);
    		}
    	}
    	//check every col
    	for(int j = 0; j < cols; j++) {
    		Set<Character> set = new HashSet<Character>();
    		for(int i = 0; i < rows; i++) {
    			if(set.contains(board[i][j]) && board[i][j] != '.') return false;
    			else set.add(board[i][j]);
    		}
    	}
    	//check square
    	for(int col = 0; col < cols; col += 3) {
    		for(int row = 0; row < rows; row += 3) {    			
    			Set<Character> set = new HashSet<Character>();
        		for(int i = row; i < row + 3; i++) {
            		for(int j = col; j < col + 3; j++) {
            			if(set.contains(board[i][j]) && board[i][j] != '.') return false;
            			else set.add(board[i][j]);
            		}
            	}
    		}
    	}
		return true;
    }
}
