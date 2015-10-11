package LongestSubstringWithoutRepeatingCharacters;

import java.util.HashMap;

public class Solution {
	public int lengthOfLongestSubstring(String s) {
		int start = 0, end = 0, maxLen = 0, tempLen = 0;
    	HashMap<Character, Integer> map = new HashMap<Character, Integer>();
    	while(end < s.length()) {
    		char c = s.charAt(end);
    		if(map.containsKey(c)) {
    			tempLen = end - start;
    			maxLen = Math.max(tempLen, maxLen);
    			start = Math.max(start, map.get(c) + 1);
    			map.remove(c);
    		}
    		else{
    			map.put(c, end);
    			end++;
    			if(end == s.length()){
    				maxLen = Math.max(end - start, maxLen);
    			}
    		}
    	}
    	return maxLen;
    }
}
