package PalindromeNumber;

public class Solution {
    public boolean isPalindrome(int x) {
    	return reverseInt(x) == x; 
    }
    
    public long reverseInt(int x) {
    	int len = getLen(x);
    	long sum = 0;
    	while(len - 1 >= 0) {
    		int digit = x % 10;
    		sum += digit * Math.pow(10, len - 1);
    		x = x / 10;
    		len--;
    	}
    	return sum;
    }
    
    public int getLen(int x) {
    	int count = 0;
    	while(x > 0) {
    		x /= 10;
    		count++;
    	}
    	return count;
    }
}