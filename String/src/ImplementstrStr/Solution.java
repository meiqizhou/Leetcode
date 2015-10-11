package ImplementstrStr;

public class Solution {
	public int strStr(String haystack, String needle) {
        int i = 0, j = 0, n = haystack.length(), m = needle.length();
        if (m == 0) return 0;
        int[] lps = getLPS(needle, m);
        while (i < n) {
            if (haystack.charAt(i) == needle.charAt(j)) {
                i++;
                j++;
                if (j == m) return i - m;
            } else if (j > 0) {
                j = lps[j - 1];
            } else {
                i++;
            }
        }

        return -1;
    }

    // KMP get the longest prefix and suffix
    int[] getLPS(String s, int n) {
        int i = 1, len = 0;
        int[] lps = new int[n];
        while (i < n) {
            if (s.charAt(i) == s.charAt(len)) {
                lps[i++] = ++len;
            } 
            else if (len == 0) {
                lps[i++] = 0;
            } 
            else {
                len = lps[len - 1];
            }
        }
        return lps;
    }
}
