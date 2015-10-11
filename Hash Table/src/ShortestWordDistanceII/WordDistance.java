package ShortestWordDistanceII;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class WordDistance {
	String[] words;
	Map<String, List<Integer>> map;
    public WordDistance(String[] words) {
    	this.words = words;
    	map = new HashMap<String, List<Integer>>();
    	for(int i = 0; i < words.length; i++) {
    		if(!map.containsKey(words[i])) {
    			List<Integer> list = new ArrayList<Integer>();
    			list.add(i);
    			map.put(words[i], list);
    		}
    		else map.get(words[i]).add(i);
    	}
    }

    public int shortest(String word1, String word2) {
    	int minLen = Integer.MAX_VALUE;
    	List<Integer> list1 = map.get(word1), list2 = map.get(word2);
    	for(int i = 0; i < list1.size(); i++) {
    		for(int j = 0; j < list2.size(); j++) {
    			minLen = Math.min(Math.abs(list1.get(i) - list2.get(j)), minLen);
    		}
    	}
    	return minLen;
    }
}
