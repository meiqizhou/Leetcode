package ShortestWordDistance;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Solution {
	private int minLen;
    public int shortestDistance(String[] words, String word1, String word2) {
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
        List<Integer> list1 = map.get(word1);
        List<Integer> list2 = map.get(word2);
        for(int i = 0; i < list1.size(); i++) {
        	for(int j = 0; j < list2.size(); j++) {
        		minLen = Math.min(Math.abs(list1.get(i) - list2.get(j)), minLen);
        	}
        }
        return minLen;
    }
}
