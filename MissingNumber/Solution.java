package MissingNumber;
/**
 * Given an array containing n distinct numbers taken from 0, 1, 2, ..., n, find the one that is missing from the array.
 */
import java.util.HashSet;
import java.util.Set;

public class Solution {
    public int missingNumber(int[] nums) {
        int max = nums[0];
        Set<Integer> set = new HashSet<Integer>();
        for(int i = 0; i < nums.length; i++) {
            set.add(nums[i]);
            max = Math.max(max, nums[i]);
        }
        for(int i = 0; i <= max; i++) {
            if(!set.contains(i)) return i;
        }
        return max + 1;
    }
}
