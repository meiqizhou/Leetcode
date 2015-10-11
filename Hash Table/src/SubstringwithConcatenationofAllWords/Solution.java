package SubstringwithConcatenationofAllWords;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Solution {
	public List<Integer> findSubstring(String s, String[] words) {
		int N = s.length(), len = words[0].length(), n = words.length; 
		List<Integer> list = new ArrayList<Integer>();
		HashMap<String, Integer> map = new HashMap<String, Integer>(); //µÃµ½hashmap
		for(int i = 0; i < words.length; i++) {
			if(map.containsKey(words[i])) {
				map.put(words[i], map.get(words[i]) + 1);
			} 
			else map.put(words[i], 1);
		}
		int start = 0, end = n * len - 1;
		while(end < s.length()) {
			String subStr = s.substring(start, end + 1);
			if(allContains(subStr, map, len)) {
				list.add(start);
				start += 1;
			}
			else start++;
			end = start + n * len - 1;
		}
		return list;
    }

	private boolean allContains(String s, HashMap<String, Integer> map, int len) {
		// TODO Auto-generated method stub
		HashMap<String, Integer> temp_map = new HashMap<String, Integer>(map);
		int i = 0;
		while(i < s.length() - len + 1) {
			String str = s.substring(i, i + len);
			if(temp_map.size() != 0 && temp_map.containsKey(str)) {
				i += len;
				temp_map.put(str, temp_map.get(str) - 1);
				if(temp_map.get(str) == 0) temp_map.remove(str);
			}
			else return false;
		}
		return true;
	}
}
