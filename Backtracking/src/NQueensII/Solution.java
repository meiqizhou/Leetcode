package NQueensII;

public class Solution {
	private int count = 0;
    public int totalNQueens(int n) {
        helper(n, 0, new int[n]);
        return count;
    }
	private void helper(int n, int row, int[] colRow) {
		// TODO Auto-generated method stub
		if(n == row) {
			count++;
			return;
		}
		for(int col = 0; col < n; col++) {
			if(isValid(colRow, row, col)) {
				colRow[row] = col;
				helper(n, row + 1, colRow);
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
