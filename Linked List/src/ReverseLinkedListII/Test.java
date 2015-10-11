package ReverseLinkedListII;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ListNode one = new ListNode(3);
		ListNode two = new ListNode(5);
//		ListNode three = new ListNode(3);
//		ListNode four = new ListNode(4);
//		ListNode five = new ListNode(5);
//		ListNode six = new ListNode(6);
		one.next = two;
		two.next = null;
//		three.next = four;
//		four.next = five;
//		five.next = six;
//		six.next = null;
		Solution s = new Solution();
		s.reverseBetween(one, 1, 2);
	}

}
