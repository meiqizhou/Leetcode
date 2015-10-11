package LongestConsecutiveSequence;

import java.util.HashMap;
import java.util.Map;


public class Solution {
	private int maxLen = 0;
	public int longestConsecutive(int[] num) {
		Map<Integer, Boolean> map = new HashMap<Integer, Boolean>();
		for(int i = 0; i < num.length; i++) map.put(num[i], false);
		for(int i = 0; i < num.length; i++) {
			if(map.get(num[i])) continue;
			int len = 0;
			for(int j = num[i] + 1;; j++) {
				if(map.containsKey(j)) {
					len++;
					map.put(j, true);
				}
				else break;
			}
			for(int j = num[i] - 1;; j--) {
				if(map.containsKey(j)) {
					len++;
					map.put(j, true);
				}
				else break;
			}
			maxLen = Math.max(maxLen, len);
		}
		return maxLen;
	}
}
