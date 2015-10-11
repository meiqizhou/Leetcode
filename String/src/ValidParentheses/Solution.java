package ValidParentheses;

import java.util.Stack;

public class Solution {
    public boolean isValid(String s) {
    	Stack<Character> stack = new Stack<Character>();
    	int i = 0;
    	while(i < s.length()){
    		if(s.charAt(i) == '(' || s.charAt(i) == '[' || s.charAt(i) == '{') stack.push(s.charAt(i));
    		else if(stack.isEmpty()) return false;
    		else{
    			char c = stack.pop();
    			if(c == '(' && s.charAt(i) != ')') return false;
    			else if(c == '[' && s.charAt(i) != ']') return false;
    			else if(c == '{' && s.charAt(i) != '}') return false;
    		}
    		i++;
    	}
    	return stack.isEmpty();
    }
}
