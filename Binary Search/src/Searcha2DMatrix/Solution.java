package Searcha2DMatrix;

public class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
    	int rows = matrix.length;
    	int lo = 0, hi = rows - 1;
    	while(lo <= hi) {
    		int mid = lo + (hi - lo) / 2;
    		if(matrix[mid][0] < target) lo = mid + 1;
    		else if(matrix[mid][0] > target) hi = mid - 1;
    		else return true;
    	}
    	int pos = Math.max(0, Math.min(lo, hi));
    	return binarySearch(matrix[pos], target);
    }

	private boolean binarySearch(int[] arr, int target) {
		// TODO Auto-generated method stub
		int lo = 0, hi = arr.length - 1;
		while(lo <= hi) {
			int mid = lo + (hi - lo) / 2;
			if(arr[mid] < target) lo = mid + 1;
			else if(arr[mid] > target) hi = mid - 1;
			else return true;
		}
		return false;
	}
}
