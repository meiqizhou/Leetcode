package SearchinRotatedSortedArray;

public class Solution {
	public int search(int[] A, int target) {
		if(A.length == 0) return -1;
		int L = 0, R = A.length - 1;
		while(L <= R) {
			int M = (L + R) / 2;
			if(A[M] == target) return M;
			if(A[M] >= A[L]) { //左边是sorted数列
				if(A[L] <= target && target < A[M]) {
					R = M - 1;
				}
				else L = M + 1;
			}
			else { //A[M] < A[R] 右边是sorted数列 
				if(target > A[M] && A[R] >= target) {
					L = M + 1;
				}
				else R = M - 1;
			}
		}
		return -1;
    }
}
