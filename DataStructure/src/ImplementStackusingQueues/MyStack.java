package ImplementStackusingQueues;

import java.util.LinkedList;
import java.util.Queue;

public class MyStack {
	private Queue<Integer> queue = new LinkedList<Integer>();
	private int res = 0;
	// Push element x onto stack.
    public void push(int x) {
    	queue.add(x);
    }

    // Removes the element on top of the stack.
    public void pop() {
    	Queue<Integer> temp = new LinkedList<Integer>();
    	while(queue.size() > 1) temp.add(queue.poll());
    	queue = temp;
    	return;
    }

    // Get the top element.
    public int top() {
    	Queue<Integer> temp = new LinkedList<Integer>(queue);
    	while(!queue.isEmpty()) {
    		if(queue.size() == 1) {
    			res = queue.peek();
    			queue = temp;
    			break;
    		}
    		queue.poll();
    	}
    	return res;
    }

    // Return whether the stack is empty.
    public boolean empty() {
    	return queue.size() == 0;
    }
}
