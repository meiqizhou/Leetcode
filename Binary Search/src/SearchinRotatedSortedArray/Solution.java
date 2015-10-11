package SearchinRotatedSortedArray;

public class Solution {
    public boolean search(int[] A, int target) {
        int N = A.length, k = 1;
		while(k < N){
			if(A[k - 1] - A[k] > 0) break;
			k++;
		}
		if(k == N) return binarySearch(A, 0, N - 1, target);
		if(target >= A[0] && target <= A[k - 1]) return binarySearch(A, 0, k - 1, target);
		else if(target <= A[N - 1] && target >= A[k]) return binarySearch(A, k, N - 1, target);
		else return false;
    }   
    private boolean binarySearch(int[] A, int start, int end, int target){
		int lo = start, hi = end;
		while(lo <= hi){
			int mid = lo + (hi - lo) / 2;
			if(A[mid] < target) lo = mid + 1;
			else if(A[mid] > target) hi = mid - 1;
			else return true;
		}
		return false;
	}
}