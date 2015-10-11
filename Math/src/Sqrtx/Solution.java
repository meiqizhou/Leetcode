package Sqrtx;

public class Solution {
    public int mySqrt(int x) {
    	int lo = 1, hi = x;
    	while(lo < hi) {
    		int mid = lo + (hi - lo) / 2;
    		if(mid < x / mid) lo = mid + 1;
    		else hi = mid;
    	}
    	return (lo == x / lo) ? lo: lo - 1;
    }
}
