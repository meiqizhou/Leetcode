package BasicCalculator;
import java.util.Stack;

public class Solution {
    public int calculate(String s) {
    	String sb = "";
    	Stack<String> stack = new Stack<String>();
    	for(int i = 0; i < s.length(); i++) {
    		String sh = s.substring(i, i + 1);
    		if(!sh.equals(")")) stack.push(sh);
    		else {
    			helper(stack, s);
    		}
    	}
    	while(!stack.isEmpty()) sb += stack.remove(0);
    	return Integer.valueOf(calculateWithoutSpace(sb)).intValue();
    }
    
    private void helper(Stack<String> stack, String s) {
		// TODO Auto-generated method stub
    	String sb = "";
    	int index = stack.lastIndexOf("(");
    	while(!stack.peek().equals("(")) sb += stack.remove(index + 1);
    	stack.pop();
    	String str = calculateWithoutSpace(sb);
    	while(!stack.isEmpty() && stack.peek().equals(" ")) stack.pop();
    	if(!stack.isEmpty() && stack.peek().equals("-") && str.substring(0, 1).equals("-")) {
    		stack.set(stack.size() - 1, "+");
    		stack.push(str.substring(1, str.length()));
    	}
    	else if(!stack.isEmpty() && stack.peek().equals("+") && str.substring(0, 1).equals("-")) {
    		stack.pop();
    		stack.push(str);
    	}
    	else {
    		stack.push(str);
    	}
	}

	public String calculateWithoutSpace(String s) {
    	int sum = 0;
    	String temp = "";
    	s = s.trim();
    	for(int k = 0; k < s.length(); k++) {
    		if(s.charAt(k) == ' ') continue;
    		else if(Character.isDigit(s.charAt(k))) {
    			temp += s.charAt(k);
    			if(k == s.length() - 1) sum += Integer.valueOf(temp).intValue();
    		}
    		else if(temp.length() == 0 && (s.charAt(k) == '-' || s.charAt(k) == '+')) {
    			temp += s.charAt(k);
    		}
    		else if(temp.length() != 0 && (s.charAt(k) == '-' || s.charAt(k) == '+')) {
    			if(temp == "") continue;
    			else {
    				sum += Integer.valueOf(temp).intValue();
    				temp = "" + s.charAt(k);
    			}
    		}
    	}
    	return String.valueOf(sum);
    }
}
