package ImplementStackusingQueues;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyStack stack = new MyStack();
		stack.push(1);
		int one = stack.top();
		boolean b1 = stack.empty();
		stack.pop();
		boolean b2 = stack.empty();
		stack.push(2);
		stack.push(3);
		int two = stack.top();
		stack.pop();
		int three = stack.top();
		stack.pop();
		boolean b3 = stack.empty();
		System.out.println(one + two + three);
		System.out.println(b1 || b2 || b3);
	}

}
