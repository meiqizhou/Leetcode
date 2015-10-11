package PalindromePartitioningII;

public class Solution {
    public int minCut(String s) {
    	if(s.length() == 0) return 0;
    	int len = s.length();
    	int[] cut = new int[len + 1];
    	boolean[][] matrix = new boolean[len][len];
    	for(int i = 0; i < len; i++) cut[i] = len - i;
    	for(int i = len - 1; i > -1; i--) {
    		for(int j = i; j < len; j++) {
    			if((s.charAt(i) == s.charAt(j) && j - i < 2) || (s.charAt(i) == s.charAt(j) && matrix[i + 1][j - 1])) {
    				matrix[i][j] = true;
    				cut[i] = Math.min(cut[i], cut[j + 1] + 1);
    			}
    		}
    	}
    	return cut[0] - 1;
    }
}
