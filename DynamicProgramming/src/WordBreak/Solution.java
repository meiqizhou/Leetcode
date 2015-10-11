package WordBreak;

import java.util.Set;

public class Solution {
    public boolean wordBreak(String s, Set<String> wordDict) {
    	if(s.length() == 0 || wordDict.size() == 0) return false;
    	boolean[] res = new boolean[s.length() + 1];
    	res[0] = true;
    	for(int i = 0; i < s.length(); i++) {
    		StringBuilder sb = new StringBuilder(s.substring(0, i + 1));
    		for(int j = 0; j <= i; j++) {
    			if(res[j] && wordDict.contains(sb.toString())) {
    				res[i + 1] = true;
    				break;
    			}
    			sb.deleteCharAt(0);
    		}
    	}
    	return res[s.length()];
    }
}
