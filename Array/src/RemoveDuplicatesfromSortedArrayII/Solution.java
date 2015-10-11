package RemoveDuplicatesfromSortedArrayII;

public class Solution {
    public int removeDuplicates(int[] A) {
    	if(A.length == 0) return 0;
    	int N = A.length, count = 1, i = 1, flag = 0, j = 1;
    	while(i < N){
    		if(A[i] - A[i - 1] == 0 && flag == 0){
    			A[j] = A[i];
    			count++;
    			flag = 1;
    			i++;
    			j++;
    		}
    		else if(A[i] - A[i - 1] == 0 && flag == 1) i++;
    		else {//(A[i] - A[i - 1] != 0
    			A[j] = A[i];
    			count++;
    			flag = 0;
    			i++;
    			j++;
    		}
    	}
    	return count;
    }
}