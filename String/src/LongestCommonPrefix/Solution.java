package LongestCommonPrefix;

public class Solution {
    public String longestCommonPrefix(String[] strs) {
    	if(strs.length == 0) return "";
    	int i = 0;
    	while(i < strs[0].length()) {
    		if(!isCommonPrefix(strs, strs[0].substring(0, i + 1))) break;
    		i++;
    	}
    	return strs[0].substring(0, i);
    }
    
    public boolean isCommonPrefix(String[] strs, String str) {
    	for(int i = 0; i < strs.length; i++) {
    		if(strs[i].length() < str.length() || !strs[i].substring(0, str.length()).equals(str)) return false;
    	}
    	return true;
    }
}
