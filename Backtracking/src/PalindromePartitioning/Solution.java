package PalindromePartitioning;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public List<List<String>> partition(String s) {
    	List<List<String>> res = new ArrayList<List<String>>();
    	if(s.length() == 0) return res;
    	List<String> list = new ArrayList<String>();
    	helper(s, list, res);
    	return res;
    }

	private void helper(String s, List<String> list, List<List<String>> res) {
		// TODO Auto-generated method stub
		if(s.length() == 0) {
			res.add(new ArrayList<String>(list));
			return;
		}
		for(int i = 1; i <= s.length(); i++) {
			String str1 = s.substring(0, i);
			if(isPalindrome(str1)) {
				list.add(str1);
				String str2 = s.substring(i);
				helper(str2, list, res);
				list.remove(list.size() - 1);
			}
		}
	}

	private boolean isPalindrome(String s) {
		// TODO Auto-generated method stub
		int i = 0, j = s.length() - 1;
		while(i < j) {
			if(s.charAt(i) != s.charAt(j)) return false;
			i++;
			j--;
		}
		return true;
	}
}