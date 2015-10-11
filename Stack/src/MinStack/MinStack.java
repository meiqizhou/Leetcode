package MinStack;

import java.util.ArrayList;
import java.util.List;

class MinStack {
	private List<Integer> stack = new ArrayList<Integer>();
	private List<Integer> minStack = new ArrayList<Integer>();
    public void push(int x) {
    	stack.add(x);
    	if(minStack.size() == 0 || x <= minStack.get(minStack.size() - 1)) minStack.add(x); 
    }

    public void pop() {
        if(stack.isEmpty()) return;
        int top = stack.get(stack.size() - 1);
        stack.remove(stack.size() - 1);
        if(!minStack.isEmpty() && top == minStack.get(minStack.size() - 1)) minStack.remove(minStack.size() - 1);
    }

    public int top() {
    	return stack.get(stack.size() - 1);
    }
    
    public int getMin() {
		return minStack.get(minStack.size() - 1);
    }
}