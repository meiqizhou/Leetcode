package ImplementQueueusingStacks;

import java.util.Stack;

class MyQueue {
    // Push element x to the back of queue.
	private Stack<Integer> stack;
	private Stack<Integer> container;
	MyQueue(){
		stack = new Stack<Integer>();
		container = new Stack<Integer>();
	}
    public void push(int x) {
    	stack.push(x);
    }

    // Removes the element from in front of queue.
    public void pop() {
        while(!stack.isEmpty()) container.push(stack.pop());
        container.pop();
        while(!container.isEmpty()) stack.push(container.pop());
    }

    // Get the front element.
    public int peek() {
        while(!stack.isEmpty()) container.push(stack.pop());
        int res = container.peek();
        while(!container.isEmpty()) stack.push(container.pop());
        return res;
    }

    // Return whether the queue is empty.
    public boolean empty() {
        return stack.isEmpty();
    }
}
