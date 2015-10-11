package MajorityElement;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.swing.text.html.HTMLDocument.Iterator;

public class Solution {
    public int majorityElement(int[] num) {
    	int max = 1, maxVal = Integer.MIN_VALUE;
    	Map<Integer, Integer> map = new HashMap<Integer, Integer>();
    	for(int i = 0; i < num.length; i++){
    		int temp = num[i];
    		if(map.containsKey(temp)){
    			map.put(temp, map.get(temp) + 1);
    			if( map.get(temp) + 1 > max){
    				max = map.get(temp);
    				maxVal = temp;
    			} 
    		}
    		else map.put(temp, 1);
    	}
    	return maxVal;
    }
}
