package GroupShiftedStrings;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class Solution {
    public List<List<String>> groupStrings(String[] strings) {
    	List<List<String>> res = new ArrayList<List<String>>();
    	Map<Character, Integer> letterMap = new HashMap<Character, Integer>();
    	Map<List<Integer>, List<String>> map = new HashMap<List<Integer>, List<String>>();
    	int count = 0;
    	for(char c = 'a'; c <= 'z'; c++) {
    		letterMap.put(c, count++);
    	}
    	for(int i = 0; i < strings.length; i++) {
    		List<Integer> key = getKey(strings[i], letterMap);
    		if(!map.containsKey(key)) {
    			List<String> list = new ArrayList<String>();
    			list.add(strings[i]);
    			map.put(key, list);
    		}
    		else map.get(key).add(strings[i]);
    	}
    	Iterator iter = map.values().iterator();
    	while(iter.hasNext()) {
    		List<String> list = (List<String>) iter.next();
    		Collections.sort(list);
    		res.add(list);
    	}
    	return res;
    }

	public List<Integer> getKey(String s, Map<Character, Integer> map) {
		// TODO Auto-generated method stub
		List<Integer> list = new ArrayList<Integer>();
		int carry = 0;
		for(int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			if(i > 0 && map.get(c) + carry < list.get(i - 1)) {
				carry += 26;
				list.add(map.get(s.charAt(i)) + carry);
			}
			else list.add(map.get(s.charAt(i)) + carry);
		}
		int offset = list.get(0);
		change(list, offset);
		return list;
	}

	private void change(List<Integer> list, int offset) {
		// TODO Auto-generated method stub
		for(int i = 0; i < list.size(); i++) {
			list.set(i, list.get(i) - offset);
		}
	}
}
