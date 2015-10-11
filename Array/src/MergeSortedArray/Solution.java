package MergeSortedArray;

import java.util.Arrays;

public class Solution {
    public void merge(int A[], int m, int B[], int n) {
    	int[] C = Arrays.copyOf(A, A.length);
    	int k = 0, i = 0, j = 0;;
    	while(k < m + n){
    		if(i >= m) A[k] = B[j++];
    		else if(j >= n) A[k] = C[i++];
    		else if(less(C[i], B[j])) A[k] = C[i++];
    		else A[k] = B[j++];
    		k++;
    	}
    }

	private boolean less(int i, int j) {
		// TODO Auto-generated method stub
		return i < j;
	}
}