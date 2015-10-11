package RemoveDuplicatesfromSortedList;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Solution s = new Solution();
		ListNode first = new ListNode(1);
		ListNode second = new ListNode(2);
		ListNode third = new ListNode(3);
		ListNode four = new ListNode(3);
		ListNode five = new ListNode(4);
		ListNode six = new ListNode(4);
		ListNode seven = new ListNode(5);
		first.next = second;
		second.next = third;
		third.next = four;
		four.next = five;
		five.next = six;
		six.next = seven;
		seven.next = null;
		s.deleteDuplicates(first);
	}

}
