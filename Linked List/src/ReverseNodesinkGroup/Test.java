package ReverseNodesinkGroup;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ListNode first = new ListNode(1);
		ListNode second = new ListNode(2);
//		ListNode third = new ListNode(3);
//		ListNode fourth = new ListNode(4);
//		ListNode fifth = new ListNode(5);
//		ListNode sixth = new ListNode(6);
//		ListNode seventh = new ListNode(7);
		first.next = second;
		second.next = null;
//		third.next = fourth;
//		fourth.next = fifth;
//		fifth.next = sixth;
//		sixth.next = seventh;
//		seventh.next = null;
		Solution s = new Solution();
		s.reverseKGroup(first, 2);

	}

}
