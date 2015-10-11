package ValidParentheses;

import java.util.Stack;

public class Solution {
	public boolean isValid(String s) {
		Stack<Character> stack = new Stack<Character>();
		int i = 0, N = s.length();
		while(i < N) {
			if((s.charAt(i) == '}' || s.charAt(i) == ']' || s.charAt(i) == ')') && stack.isEmpty()) return false;
			else if((s.charAt(i) == '}' || s.charAt(i) == ']' || s.charAt(i) == ')') && !stack.isEmpty()) {
				char c = stack.pop();
				if(c == '(' && s.charAt(i) != ')') return false;
				else if(c == '[' && s.charAt(i) != ']') return false;
				else if(c == '{' && s.charAt(i) != '}') return false;
				i++;
			}
			else {
				stack.push(s.charAt(i));
				i++;
			} 
		}
		return stack.isEmpty();
    }
}
