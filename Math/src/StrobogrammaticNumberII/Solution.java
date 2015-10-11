package StrobogrammaticNumberII;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Solution {
    public List<String> findStrobogrammatic(int n) {
    	List<String> res = new ArrayList<String>();
    	if(n == 1) {
    		res.add("0");
    		res.add("1");
    		res.add("8");
    		return res;
    	}
    	if(n == 2) {
    		res.add("11");
    		res.add("69");
    		res.add("88");
    		res.add("96");
    		return res;
    	}
    	List<String> pre = findStrobogrammatic(n - 2);
    	pre = addBoundZero(pre);
    	res = change(pre);
    	Collections.sort(res);
    	return res; 
    }

	private List<String> addBoundZero(List<String> pre) {
		// TODO Auto-generated method stub
		List<String> res = new ArrayList<String>();
		res.addAll(new ArrayList<String>(pre));
		for(int i = 0; i < pre.size(); i++) {
			String str = pre.get(i);
			String s = str.length() != 1 ? "0" + str.substring(1, str.length() - 1) + "0" : "0";
			pre.set(i, s);
		}
		for(int i = 0; i < pre.size(); i++) {
			if(!res.contains(pre.get(i))) res.add(0, pre.get(i));
		}
		return res;
	}

	private List<String> change(List<String> list) {
		// TODO Auto-generated method stub
		List<String> res = new ArrayList<String>();
		for(int i = 0; i < list.size(); i++) {
			List<String> temp = getList(list.get(i));
			res.addAll(temp);
		}
		return res;
	}

	private List<String> getList(String s) {
		// TODO Auto-generated method stub
		List<String> res = new ArrayList<String>();
		res.add("1" + s + "1");
		res.add("6" + s + "9");
		res.add("8" + s + "8");
		res.add("9" + s + "6");
		return res;
	}
}
