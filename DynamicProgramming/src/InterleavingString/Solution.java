package InterleavingString;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Solution {
	private boolean marked = false;
	public boolean isInterleave(String s1, String s2, String s3) {
	    if(s1.length() + s2.length() != s3.length()) return false;
		if(s1.length() == 0 && s2.length() == 0) return s3.length() == 0;
		else if(s1.length() == 0) return s2.equals(s3);
		else if(s2.length() == 0) return s1.equals(s3);
		if(s1.length() == 0 && s2.length() == 0) return s3.length() == 0;
		List<List<String>> res = new ArrayList<List<String>>();
		char c1 = s1.charAt(0), c2 = s2.charAt(0), c3 = s3.charAt(0);
		if(c1 == c3 && c2 != c3) {
			List<String> list = new ArrayList<String>(3);
			list.add(s1.substring(1, s1.length()));
			list.add(s2);
			list.add(s3.substring(1, s3.length()));
			res.add(list);
		}
		else if(c2 == c3 && c1 != c3) {
			List<String> list = new ArrayList<String>(3);
			list.add(s1);
			list.add(s2.substring(1, s2.length()));
			list.add(s3.substring(1, s3.length()));
			res.add(list);
		}
		else if(c1 == c2 && c1 == c3) {
			List<String> list1 = new ArrayList<String>(3);
			list1.add(s1.substring(1, s1.length()));
			list1.add(s2);
			list1.add(s3.substring(1, s3.length()));
			res.add(list1);
			List<String> list2 = new ArrayList<String>(3);
			list2.add(s1);
			list2.add(s2.substring(1, s2.length()));
			list2.add(s3.substring(1, s3.length()));
			res.add(list2);			
		}
		else return false;
		for(int i = 1; i < s3.length(); i++) {
			res = removeDuplicateAndNull(res);
			if(res.size() == 0 && !marked) return false;
			else if(res.size() == 0 && marked) return true;
			else if(marked) return true;
			helper(res);
		}
		return true;
    }
	
	private List<List<String>> removeDuplicateAndNull(List<List<String>> res) {
		// TODO Auto-generated method stub
		List<List<String>> temp = new ArrayList<List<String>>();
		Set<List<String>> set = new HashSet<List<String>>();
		for(int i = 0; i < res.size(); i++) {
			List<String> list = res.get(i);
			if(list.contains("")) {
				res.remove(i--);
				int index = list.indexOf("");
				list.remove(index);
				marked = list.get(0).equals(list.get(1)) ? true : false;
			}
			else if(set.contains(list)) continue;
			else {
				temp.add(list);
				set.add(list);
			}
		}
		return temp;
	}

	private void helper(List<List<String>> res) {
		// TODO Auto-generated method stub
		int size = res.size();
		for(int i = 0; i < size; i++) {
			List<String> list = res.get(0);
			res.remove(0);
			res.addAll(getConnections(list));
		}
	}

	private List<List<String>> getConnections(List<String> list) {
		// TODO Auto-generated method stub
		List<List<String>> res = new ArrayList<List<String>>();
		String s1 = list.get(0), s2 = list.get(1), s3 = list.get(2);
		char c1 = s1.charAt(0), c2 = s2.charAt(0), c3 = s3.charAt(0);
		if(c1 == c3 && c2 != c3) {
			List<String> temp = new ArrayList<String>(3);
			temp.add(s1.substring(1, s1.length()));
			temp.add(s2);
			temp.add(s3.substring(1, s3.length()));
			res.add(temp);
		}
		else if(c2 == c3 && c1 != c3) {
			List<String> temp = new ArrayList<String>(3);
			temp.add(s1);
			temp.add(s2.substring(1, s2.length()));
			temp.add(s3.substring(1, s3.length()));
			res.add(temp);
		}
		else if(c1 == c2 && c1 == c3) {
			List<String> temp1 = new ArrayList<String>(3);
			temp1.add(s1.substring(1, s1.length()));
			temp1.add(s2);
			temp1.add(s3.substring(1, s3.length()));
			res.add(temp1);
			List<String> temp2 = new ArrayList<String>(3);
			temp2.add(s1);
			temp2.add(s2.substring(1, s2.length()));
			temp2.add(s3.substring(1, s3.length()));
			res.add(temp2);
		}
		return res;
	}
}
