package KthLargestElementinanArray;

import java.util.PriorityQueue;

public class Solution {
    public int findKthLargest(int[] nums, int k) {
    	PriorityQueue<Integer> queue = new PriorityQueue<Integer>();
    	for(int i = 0; i < nums.length; i++) {
    		queue.offer(nums[i]);
    	}
    	int kk = queue.size() - k;
    	while(!queue.isEmpty() && kk > 0) {
    		queue.poll();
    		kk--;
    	}
    	return queue.peek();
    }
}
