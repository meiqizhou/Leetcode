package SetMatrixZeroes;


//Given a m x n matrix, if an element is 0, set its entire row and column to 0. Do it in place.
public class Solution {
	 public void setZeroes(int[][] matrix) {
		 int N = matrix.length, M = matrix[0].length;
		 boolean[] rows = new boolean[N];
		 boolean[] cols = new boolean[M];
		 for(int i = 0; i < N; i++){
			 for(int j = 0; j < M; j++){
				 if(matrix[i][j] == 0){
					 rows[i] = true;
					 cols[j] = true;
				 }
			 }
		 }
		 for(int i = 0; i < N; i++){
			 for(int j = 0; j < M; j++){
				 if(rows[i] || cols[j]) matrix[i][j] = 0;
			 }
		 }
   }
}

