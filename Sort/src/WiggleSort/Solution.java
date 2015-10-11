package WiggleSort;

import java.util.Arrays;

public class Solution {
    public void wiggleSort(int[] nums) {
        Arrays.sort(nums);
        int i = 1, j = (nums.length + 1) / 2;
        while(i < j) {
        	 exch(nums, i++, j);
             rotate(nums, i++, j++);
        }
    }
    
    private void exch(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
    
    private void rotate(int[] nums, int i, int j) {
    	int t = nums[j], k = i;
    	int temp = nums[i];
        while(i < j) {
        	int tmp = nums[i + 1];
        	nums[i + 1] = temp;
        	temp = tmp;
        	i++;
        }
        nums[k] = t;
    }
}
