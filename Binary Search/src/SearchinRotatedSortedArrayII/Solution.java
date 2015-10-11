package SearchinRotatedSortedArrayII;
public class Solution {
    public boolean search(int[] A, int target) {
        if(A.length == 0) return false;
		int L = 0, R = A.length - 1;
		while(L <= R) {
			int M = (L + R) / 2;
			if(A[M] == target) return true;
			if(A[M] >= A[L]) { //左边是sorted数列
				if(A[L] <= target && target <= A[M - 1]) {
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
		return false;
	}
}