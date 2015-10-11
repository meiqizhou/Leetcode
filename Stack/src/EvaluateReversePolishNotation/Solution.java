package EvaluateReversePolishNotation;

import java.util.Stack;

public class Solution {
    public int evalRPN(String[] tokens) {
    	Stack<String> stack = new Stack<String>();
    	for(int i = 0; i < tokens.length; i++) {
    		if(!tokens[i].equals("+") && !tokens[i].equals("-") && !tokens[i].equals("*") && !tokens[i].equals("/")) {
    			stack.push(tokens[i]);
    		}
    		else {
    			int j = Integer.parseInt(stack.pop()), k = Integer.parseInt(stack.pop());
    			if(tokens[i].equals("+")) stack.push(String.valueOf(k + j));
    			else if(tokens[i].equals("-")) stack.push(String.valueOf(k - j));
    			else if(tokens[i].equals("*")) stack.push(String.valueOf(k * j));
    			else stack.push(String.valueOf(k / j));
    		}
    	}
    	return Integer.parseInt(stack.peek());
    }
}
