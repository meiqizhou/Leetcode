package NQueens;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public List<List<String>> solveNQueens(int n) {
    	List<List<String>> res = new ArrayList<List<String>>();
    	helper(n, 0, new int[n], res);
    	return res;
    }

	private void helper(int n, int row, int[] colRow, List<List<String>> res) {
		// TODO Auto-generated method stub
		if(n == row) {
			List<String> list = new ArrayList<String>();
			for(int i = 0; i < n; i++) {
				String str = "";
				for(int j = 0; j < n; j++) {
					if(colRow[i] == j) str += 'Q';
					else str += '.';
				}
				list.add(str);
			}
			res.add(new ArrayList<String>(list));
			return;
		}
		for(int col = 0; col < n; col++) {
			if(isValid(colRow, row, col)) {
				colRow[row] = col;
				helper(n, row + 1, colRow, res);
			}
		}
	}

	private boolean isValid(int[] colRow, int row, int col) {
		// TODO Auto-generated method stub
		for(int r = 0; r < row; r++) {
			if(col == colRow[r] || row - r == Math.abs(col - colRow[r])) return false;
		}
		return true;
	}
}
