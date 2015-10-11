package NumberofDigitOne;

public class Solution {
	public int countDigitOne(int n) {
        return (int)digitCount((long) 1, (long) n);
    }
    
    private long digitCount(long k, long n) {
    	long res = 0;
    	long base = 1;
    	while(n / base > 1) {
    		long cur = (n / base) % 10;
    		long lo = n - (n / base) * base;
    		long hi = n / (base * 10);
    		if(cur < k) res += hi * base;
    		else if(cur == k) res += hi * base + lo + 1;
    		else res += (hi + 1) * base;
    		base *= 10;
    	}
    	return res;
    }
}
