package ContainsDuplicateII;

import java.util.HashMap;
import java.util.Map;

public class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
    	int i = 0;
    	Map<Integer, Integer> map = new HashMap<Integer, Integer>();
    	while(i < nums.length) {
    		if(map.containsKey(nums[i])) {
    			if(i - map.get(nums[i]) <= k) return true;
    			else map.put(nums[i], i);
    		}
    		else map.put(nums[i], i);
    		i++;
    	}
		return false;
    }
}
