package MinStack;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MinStack stack = new MinStack();
		stack.push(4);
		int val4 = stack.getMin();
		stack.push(3);
		int val3 = stack.getMin();
		int t3 = stack.top();
		stack.push(2);
		int val2 = stack.getMin();
		stack.push(1);
		int val1 = stack.getMin();
		int t1 = stack.top();
		System.out.println(val4 + " " + val3 + " " + val2 + " " + val1 + " " + t3 + " " + t1);
		stack.pop();
		int t2 = stack.top();
		System.out.println(t2);
		
	}

}
