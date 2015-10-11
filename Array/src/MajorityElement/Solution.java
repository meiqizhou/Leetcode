package MajorityElement;

import java.util.Stack;

public class Solution {
	public int majorityElement(int[] num) {
		Stack<Integer> stack = new Stack<Integer>();
		for(int i = 0; i < num.length; i++){
			if(stack.isEmpty() || stack.peek() == num[i]) stack.push(num[i]);
			else stack.pop();
		}
		return stack.pop();
    }
}
