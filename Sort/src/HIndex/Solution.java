package HIndex;

import java.util.Arrays;

public class Solution {
    public int hIndex(int[] citations) {
    	Arrays.sort(citations);
    	int[] count = new int[citations.length];
    	int j = citations.length;
    	for(int i = 0; i < count.length; i++) {
    		count[i] = j--;
    	}
    	int i = 0;
    	for(i = 0; i < count.length; i++) {
    		if(citations[i] >= count[i]) break;
    	}
    	return i == count.length ? 0 : count[i];
    }
}
