package JumpGame;

public class Solution {
    public boolean canJump(int[] A) {
    	int[] max = new int[A.length];
    	for(int i = 0; i < A.length; i++){
    		max[i] = i + A[i];
    	}
    	for(int i = 0; i < max.length - 1; i++){
    	    if(max[i] < i + 1) return false;
    		else{
    			max[i] = Math.max(max[i], max[i + 1]);
    			max[i + 1] = Math.max(max[i], max[i + 1]);
    		}
    	}
    	return max[A.length - 1] >= A.length - 1;
    }
}
