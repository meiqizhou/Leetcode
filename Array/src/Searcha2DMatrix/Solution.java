package Searcha2DMatrix;

public class Solution {
	private int position = 0;
    public boolean searchMatrix(int[][] matrix, int target) {
    	int m = matrix.length;
    	int[] A = new int[m];
    	for(int i = 0; i < m; i++){
    		A[i] = matrix[i][0];
    	}
    	int temp1 = binarySearch(A, target);
    	if(position < 0) return false;
    	if(temp1 != -1) return true;
    	else{
    		int temp2 = binarySearch(matrix[position], target);
    		if(temp2 == -1) return false;
    		else return true;
    	}
    }

	private int binarySearch(int[] A, int target) {
		int lo = 0, hi = A.length - 1;
		while(lo <= hi){
			int mid = lo + (hi - lo) / 2;
			if(A[mid] < target) lo = mid + 1;
			else if(A[mid] > target) hi = mid - 1;
			else return mid;
		}
		position = hi;
		return -1;
	}
}
