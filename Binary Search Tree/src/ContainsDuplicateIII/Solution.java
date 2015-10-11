package ContainsDuplicateIII;

import java.util.SortedSet;
import java.util.TreeSet;

public class Solution {
	public boolean containsNearbyAlmostDuplicate(int[] nums, int k, int t) {
		if (nums.length < 2) return false;
        if (k == 0) return false;
        SortedSet<Long> treeset = new TreeSet<Long>();
        for(int i = 0; i < nums.length; i++) {
        	SortedSet<Long> subset = treeset.subSet((long) nums[i] - t, (long) nums[i] + t);
        	if(subset != null) return true;
        	if(i - k >= 0) treeset.remove((long) nums[i - k]);
        	treeset.add((long) nums[i]);
        }
        return false;
    }
}
