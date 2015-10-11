package WordBreak;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class Solution {
    public boolean wordBreak(String s, Set<String> wordDict) {
    	List<List<String>> res = wordBreakRes(s, wordDict);
    	return res.size() != 0;
    }
    
    private List<List<String>> wordBreakRes(String s, Set<String> wordDict) {
    	List<List<String>> res = new ArrayList<List<String>>();
    	if(s.length() == 0 || wordDict.size() == 0) return res;
    	List<String> list = new ArrayList<String>();
    	helper(s, list, res, wordDict);
    	return res;
    }

	private void helper(String s, List<String> list, List<List<String>> res, Set<String> wordDict) {
		// TODO Auto-generated method stub
		if(s.length() == 0) {
			res.add(new ArrayList<String>(list));
			return;
		}
		for(int i = 1; i <= s.length(); i++) {
			String s1 = s.substring(0, i);
			if(wordDict.contains(s1)) {
				list.add(s1);
				String s2 = s.substring(i);
				helper(s2, list, res, wordDict);
				list.remove(list.size() - 1);
			}
		}
	}
}
