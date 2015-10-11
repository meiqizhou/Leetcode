package SlidingWindowMaximum;

import java.util.Deque;
import java.util.LinkedList;

public class Solution {
	public int[] maxSlidingWindow(int[] nums, int k) {
		if(nums.length == 0) return new int[0];
		int[] res = new int[nums.length + 1 - k];
		Deque<Integer> deque = new LinkedList<Integer>();
		for(int i = 0; i < nums.length; i++) {
			if(i >= k && deque.getLast() == nums[i - k]) {
				deque.removeLast();
			}
			while(deque.getFirst() < nums[i]) {
				deque.removeFirst();
			}
			deque.addFirst(nums[i]);
			if(i + 1 >= k) res[i + 1 - k] = deque.getLast();
		}
		return res;
	}
}
