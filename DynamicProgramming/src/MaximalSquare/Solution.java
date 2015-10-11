package MaximalSquare;

public class Solution {
	private int max = 0;
    public int maximalSquare(char[][] matrix) {
    	int rows = matrix.length;
    	if(rows == 0) return 0;
    	int cols = matrix[0].length;
    	for(int i = 0; i < rows; i++) {
    		for(int j = 0; j < cols; j++) {
    			if(matrix[i][j] == '1') {
    				expandSquare(matrix, i, i, j, j);
    			}
    		}
    	}
		return max;
    }
	private void expandSquare(char[][] matrix, int is, int ie, int js, int je) {
		// TODO Auto-generated method stub
		boolean isSquare = true;
		int num = (int) Math.pow(ie - is + 1, 2);
		if(ie == matrix.length - 1 || je == matrix[0].length - 1) {
			max = Math.max(max, num);
			return;
		}
		int j = js, i = is;
		while(j <= je) {
			if(matrix[ie + 1][j] == '0') isSquare = false;
			if(!isSquare) {
				max = Math.max(max, num);
				return;
			}
			j++;
		}
		while(i <= ie) {
			if(matrix[i][je + 1] == '0') isSquare = false;
			if(!isSquare) {
				max = Math.max(max, num);
				return;
			}
			i++;
		}
		if(matrix[ie + 1][je + 1] == '0') {
			isSquare = false;
			max = Math.max(max, num);
			return;
		}
		if(isSquare) {
			expandSquare(matrix, is, ie + 1, js, je + 1);
		}
	}
}
