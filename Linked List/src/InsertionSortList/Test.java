package InsertionSortList;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ListNode one = new ListNode(3);
		ListNode two = new ListNode(7);
		ListNode three = new ListNode(4);
		ListNode four = new ListNode(5);
		ListNode five = new ListNode(2);
		one.next = two;
		two.next = three;
		three.next = four;
		four.next = five;
		five.next = null;
		Solution s = new Solution();
		s.insertionSortList(one);
	}

}
