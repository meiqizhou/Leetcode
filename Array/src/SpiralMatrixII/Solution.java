package SpiralMatrixII;

public class Solution {
    public int[][] generateMatrix(int n) {
    	int count = 1, m = n;
    	int[][] matrix = new int[m][n];
    	if(n == 0) return matrix;
    	int row = 0, col = -1;
    	while(true){
    		for(int i = 0; i < n; i++){
    			matrix[row][++col] = count++;
    		}
    		if(--m == 0) break; //这部是精髓
    		 for(int i = 0; i < m; i++){
                 matrix[++row][col] = count++;
             }
    		 if(--n == 0) break;
             for(int i = 0; i < n; i++){
                 matrix[row][--col] = count++;
             }
             if(--m == 0) break;
             for(int i = 0; i < m; i++){
                 matrix[--row][col] = count++;
             }
             if(--n == 0) break;
    	}
		return matrix;
    }
}
