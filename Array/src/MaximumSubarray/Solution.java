package MaximumSubarray;

public class Solution {
    public int maxSubArray(int[] A) {
    	int max = A[0];
    	int len = A.length;
    	int[] sum = new int[len];
    	sum[0] = A[0];
    	for(int i = 1; i < len; i++){
    		sum[i] = Math.max(A[i], sum[i - 1] + A[i]);
    		max = Math.max(sum[i], max);
    	}
    	return max;
    }
}
