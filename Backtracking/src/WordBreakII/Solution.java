package WordBreakII;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class Solution {
    public List<String> wordBreak(String s, Set<String> wordDict) {
    	List<String> res = new ArrayList<String>();
    	List<String> list = new ArrayList<String>();
    	if(s.length() == 0 || wordDict.size() == 0) return res;
    	helper(s, list, res, wordDict);
    	return res;
    }

	private void helper(String s, List<String> list, List<String> res, Set<String> wordDict) {
		// TODO Auto-generated method stub
		if(s.length() == 0) {
			List<String> temp = new ArrayList<String>(list);
			res.add(getString(temp));
			return;
		}
		for(int i = 1; i <= s.length(); i++) {
			String temp1 = s.substring(0, i);
			if(wordDict.contains(temp1)) {
				list.add(temp1);
				wordDict.remove(temp1);
				String temp2 = s.substring(i);
				helper(temp2, list, res, wordDict);
				list.remove(list.size() - 1);
				wordDict.add(temp1);
			}
		}
	}

	private String getString(List<String> list) {
		// TODO Auto-generated method stub
		String s = "";
		for(int i = 0; i < list.size(); i++) {
			s += list.get(i) + " ";
		}
		return s.trim();
	}
}
