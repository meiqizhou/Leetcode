package WordLadder;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Set;

public class Solution {
    public int ladderLength(String beginWord, String endWord, Set<String> wordDict) {
    	if(beginWord.length() == 0 || endWord.length() == 0 || wordDict.isEmpty()) return 0;
    	Queue<String> strQueue = new LinkedList<String>();
    	Queue<Integer> lenQueue = new LinkedList<Integer>();
    	strQueue.add(beginWord);
    	lenQueue.add(1);
    	while(!strQueue.isEmpty()) {
    		String curString = strQueue.poll();
    		int curLen = lenQueue.poll();
    		if(curString.equals(endWord)) return curLen;
    		for(int i = 0; i < curString.length(); i++) {
    			char[] curArr = curString.toCharArray();
    			for(char c = 'a'; c < 'z'; c++) {
    				if(curArr[i] == c) continue;
    				curArr[i] = c;
    				String tempStr = new String(curArr);
    				if(wordDict.contains(tempStr)) {
    					strQueue.add(tempStr);
    					lenQueue.add(curLen + 1);
    					wordDict.remove(tempStr);
    				}
    			}
    		}
    	}
    	return 0;
    }
}