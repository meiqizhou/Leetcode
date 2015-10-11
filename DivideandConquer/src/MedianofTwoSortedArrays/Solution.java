package MedianofTwoSortedArrays;


public class Solution {
	public double findMedianSortedArrays(int A[], int B[]) {
		int m = A.length, n = B.length, total = m + n;
		if(total % 2 != 0) return findKth(A, 0, m - 1, B, 0, n - 1, total / 2 + 1);
		else {
			double a = findKth(A, 0, m - 1, B, 0, n - 1, total / 2);
			double b = findKth(A, 0, m - 1, B, 0, n - 1, total / 2 + 1);
			return (a + b) / 2.0;
		}
    }

	private double findKth(int[] A, int as, int ae, int[] B, int bs, int be, int k) {
		// TODO Auto-generated method stub
		int m = ae - as + 1, n = be - bs + 1;
		if(m > n) return findKth(B, bs, be, A, as, ae, k);
		if(m == 0) return B[k - 1];
		if(k == 1) return Math.min(A[as], B[bs]);
		int partA = Math.min(k / 2, m), partB = k - partA;
		if(A[as + partA - 1] < B[bs + partB - 1]) {
			return findKth(A, as + partA, ae, B, bs, be, k - partA);
		}
		else if(A[as + partA - 1] > B[bs + partB - 1]) {
			return findKth(A, as, ae, B, bs + partB, be, k - partB);
		}
		else {
			return A[as + partA - 1];
		}
	}
}
