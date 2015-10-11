
package SingleNumberII;

import java.util.HashMap;
import java.util.Map;

public class Solution {
	int res = 0;
    public int singleNumber(int[] nums) {
    	Map<Integer, Integer> map = new HashMap<Integer, Integer>();
    	for(int i = 0; i < nums.length; i++) {
    		if(!map.containsKey(nums[i])) map.put(nums[i], 1);
    		else {
    			map.put(nums[i], map.get(nums[i]) + 1);
    			if(map.get(nums[i]) == 3) map.remove(nums[i]);
    		}
    	}
    	return getResFromMap(map.toString());
    }
    
	private int getResFromMap(String s) {
		// TODO Auto-generated method stub
		StringBuilder sb = new StringBuilder();
		for(int i = 0; i < s.length(); i++) {
			if(Character.isDigit(s.charAt(i))) sb.append(s.charAt(i));
			if(s.charAt(i) == '=') break;
		}
		return Integer.parseInt(sb.toString());
	}
}
