package LongestPalindromicSubstring;

public class Solution {
    public String longestPalindrome(String s) {
    	int start = 0, end = 0;
    	for(int i = 0; i < s.length() - 1; i++) {
    		int len1 = expandAroundCenter(s, i, i);
    		int len2 = expandAroundCenter(s, i, i + 1);
    		int len = Math.max(len1, len2);
    		if(end - start < len){
    			start = i - (len - 1) / 2;
    			end = i + len / 2;
    		}    		
    	}
    	return s.substring(start, end + 1);
    }

    public int expandAroundCenter(String s, int left, int right){
    	int L = left, R = right;
    	while(L > -1 && R < s.length() && s.charAt(L) == s.charAt(R)){
    		L--;
    		R++;
    	}
    	return R - L - 1;
    }
    
}
