package PaintFence;


public class Solution {
    public int numWays(int n, int k) {
    	if(n == 0 || k == 0) return 0;
    	if(k == 1 && n < 3) return 1;
        if(k == 1 && n >= 3) return 0; 
        int dp = k;
    	for(int i = 1; i < n; i++) {
    		dp *= k - 1;
    	}
    	return (int) (dp + k * Math.pow(k - 1, n - 2) * (n - 1));
    }
}
