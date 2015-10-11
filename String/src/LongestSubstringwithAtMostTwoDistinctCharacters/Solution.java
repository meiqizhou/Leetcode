package LongestSubstringwithAtMostTwoDistinctCharacters;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Solution {
    public int lengthOfLongestSubstringTwoDistinct(String s) {
    	Map<Character, List<Integer>> map = new HashMap<Character, List<Integer>>();
    	List<Character> keyList = new ArrayList<Character>();
    	int count = 0, max = 0, start = 0, end = 0;
    	for(int i = 0; i < s.length(); i++) {
    		char c = s.charAt(i);
    		if(!map.containsKey(c) && count < 2 && i != s.length() - 1) {
    			keyList.add(c);
    			List<Integer> list = new ArrayList<Integer>();
    			list.add(i);
    			map.put(c, list);
    			count++;
    		}
    		else if((!map.containsKey(c) && count == 2)) {
    			List<Integer> keyIndex1 = map.get(keyList.get(0));
    			List<Integer> keyIndex2 = map.get(keyList.get(1));
    			end = Math.max(keyIndex1.get(keyIndex1.size() - 1), keyIndex2.get(keyIndex2.size() - 1));
    			max = Math.max(max, end - start + 1);
    			start = Math.min(keyIndex1.get(keyIndex1.size() - 1), keyIndex2.get(keyIndex2.size() - 1)) + 1;
    			if(end == keyIndex1.get(keyIndex1.size() - 1)) {
    				map.remove(keyList.get(1));
    				keyList.remove(1);
    			}
    			else if(end == keyIndex2.get(keyIndex2.size() - 1)) {
    				map.remove(keyList.get(0));
    				keyList.remove(0);
    			}
    			keyList.add(c);
    			List<Integer> list = new ArrayList<Integer>();
    			list.add(i);
    			map.put(c, list);
    		}
    		else {
    			if(i != s.length() - 1) map.get(c).add(i);
    			else {
    				max = Math.max(max, i - start + 1);
    			}
    		}
    	}
		return max;
    }
}
