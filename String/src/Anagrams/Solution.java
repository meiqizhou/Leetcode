package Anagrams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

public class Solution {
    public List<String> anagrams(String[] strs) {
    	List<String> res = new ArrayList<String>();
    	if(strs == null && strs.length == 0) return res;
    	HashMap<String, List<String>> map = new HashMap<String, List<String>>();
    	for(int i = 0; i < strs.length; i++){
    		char[] c = strs[i].toCharArray();
    		Arrays.sort(c);
    		String str = new String(c);
    		if(map.containsKey(str)) map.get(str).add(strs[i]);
    		else{
    			List<String> list = new ArrayList<String>();
    			list.add(strs[i]);
    			map.put(str, list);
    		}
    	}
    	Iterator iter = map.values().iterator();
    	while(iter.hasNext()){
    		List<String> temp = (List<String>) iter.next();
    		if(temp.size() > 1){
    			res.addAll(temp);
    		}
    	}
    	return res;
    }
}
