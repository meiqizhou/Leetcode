package MinimumWindowSubstring;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Solution {//bbaa, aba
	private List<Integer> indexList = new ArrayList<Integer>();
	public String minWindow(String S, String T) {
		if(T.equals(S)) return S;
		if(T.length() > S.length()) return "";
		String minStr = S;
		boolean find = false;
		Map<Character, List<Integer>> map = new HashMap<Character, List<Integer>>();
		Map<Character, Integer> dic = new HashMap<Character, Integer>();
		for(int i = 0; i < T.length(); i++) {
			char c = T.charAt(i);
			if(!dic.containsKey(c)) dic.put(c, 1);
			else dic.put(c, dic.get(c) + 1);
		}
		int i = 0;
		while(i < S.length()) {
			char c = S.charAt(i);
            if(dic.containsKey(c) && !map.containsKey(c)) { //new element
            	List<Integer> temp = new ArrayList<Integer>();
            	indexList.add(i);
            	temp.add(i++);
				map.put(c, temp);
				dic.put(c, dic.get(c) - 1);
				if(dic.get(c) == 0) dic.remove(c);
				if(dic.isEmpty()) { //find T
					if(indexList.get(indexList.size() - 1) - indexList.get(0) < minStr.length()){
						minStr = S.substring(indexList.get(0), indexList.get(indexList.size() - 1) + 1);
						find = true;
					}
					dic.put(S.charAt(indexList.get(0)), 1);
					map.get(S.charAt(indexList.get(0))).remove(0);
					if(map.get(S.charAt(indexList.get(0))).size() == 0) map.remove(S.charAt(indexList.get(0)));
					indexList.remove(0);
				}
			}
			else if(map.containsKey(c) && dic.containsKey(c)) {
				indexList.add(i);
				map.get(c).add(i++);
				dic.put(c, dic.get(c) - 1);
				if(dic.get(c) == 0) dic.remove(c);
				if(dic.isEmpty()) { //find T
					if(indexList.get(indexList.size() - 1) - indexList.get(0) < minStr.length()){
						minStr = S.substring(indexList.get(0), indexList.get(indexList.size() - 1) + 1);
						find = true;
					}
					dic.put(S.charAt(indexList.get(0)), 1);
					map.get(S.charAt(indexList.get(0))).remove(0);
					if(map.get(S.charAt(indexList.get(0))).size() == 0) map.remove(S.charAt(indexList.get(0)));
					indexList.remove(0);
				}
			}
			else if(map.containsKey(c) && !dic.containsKey(c)) { //element already contain
				int index = indexList.indexOf(map.get(c).get(0));
				indexList.remove(index);
				indexList.add(i);
				map.get(c).remove(0);
				map.get(c).add(i++);
			}
			else i++; //dictºÍmap¾ù²»º¬
		}
		return find ? minStr : "";
	}
}
