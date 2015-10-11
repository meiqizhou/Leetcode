package RemoveDuplicatesfromSortedArray;
public class Solution {
    public int removeDuplicates(int[] A) {
    	if(A.length == 0 || A.length == 1) return A.length;
    	int i = 0, j = 0, flag = 0;
    	while(i + 1 < A.length) {
    		if(A[i] != A[i + 1] && flag == 0) {
    			A[j] = A[i];
    			j++;
    			i++;
    		}
    		else if(A[i] != A[i + 1] && flag == 1) {
    			flag = 0;
    			i++;
    		}
    		else if(A[i] == A[i + 1] && flag == 0) {
    			flag = 1;
    			A[j] = A[i];
    			j++;
    			i++;
    		}
    		else {
    			i++;
    		}
    		if(i + 1 == A.length) {
    			if(A[i] != A[i - 1]) {
    				A[j] = A[i];
    				j++;
    			}
    			else break;
    		}
    	}
    	return j;
    }
}
