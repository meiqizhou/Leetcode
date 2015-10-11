package LongestValidParentheses;

import java.util.Stack;

public class Solution {
    public int longestValidParentheses(String s) {
    	int N = s.length();
    	if(N == 0) return N;
    	int maxLen = 0, start = -1;
    	Stack<Integer> stack = new Stack<Integer>();
    	for(int i = 0; i < N; i++) {
    		if(s.charAt(i) == '(') {
    			stack.push(i);
    		}
    		else { //s.charAt(i) == ')'
    			if(!stack.isEmpty()) {
    				stack.pop();
    				if(stack.isEmpty()) {
    					maxLen = Math.max(i - start, maxLen);
    				}
    				else maxLen = Math.max(i - stack.peek(), maxLen);
    			}
    			else {
    				start = i;
    			}
    		}
    	}
		return maxLen;
    }
}