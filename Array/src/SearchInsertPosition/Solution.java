package SearchInsertPosition;

public class Solution {
	public int searchInsert(int[] A, int target) {
		int N = A.length;
		if(N == 0) return 0;
		if(target < A[0]) return 0;
		else if(target > A[N - 1]) return N;
		else {
			int lo = 0, hi = N - 1;
			while(lo <= hi) {
				int mid = lo + (hi - lo) / 2;
				if(A[mid] > target) hi = mid - 1;
				else if(A[mid] < target) lo = mid + 1;
				else return mid;
			}
			return lo;
		}
    }
}
