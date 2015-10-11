package ShortestWordDistanceIII;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Solution {
	private int minLen;
    public int shortestWordDistance(String[] words, String word1, String word2) {
    	minLen = words.length;
    	Map<String, List<Integer>> map = new HashMap<String, List<Integer>>();
    	for(int i = 0; i < words.length; i++) {
    		if(!map.containsKey(words[i])) {
    			List<Integer> list = new ArrayList<Integer>();
    			list.add(i);
    			map.put(words[i], list);
    		}
    		else map.get(words[i]).add(i);
    	}
    	
    	if(word1.equals(word2)) {
    		List<Integer> list = map.get(word1);
    		for(int i = 1; i < list.size(); i++) {
    			minLen = Math.min(list.get(i) - list.get(i - 1), minLen);
    		}
    		return minLen;
    	}
    	
    	else {
    		List<Integer> list1 = map.get(word1), list2 = map.get(word2);
    		for(int i = 0; i < list1.size(); i++) {
    			for(int j = 0; j < list2.size(); j++) {
    				minLen = Math.min(Math.abs(list1.get(i) - list2.get(j)), minLen);
    			}
    		}
    		return minLen;
    	}
    }
}
