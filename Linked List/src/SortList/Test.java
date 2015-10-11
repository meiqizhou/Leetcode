package SortList;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Solution s = new Solution();
		ListNode first = new ListNode(3);
		ListNode second = new ListNode(2);
		ListNode third = new ListNode(4);
		first.next = second;
		second.next = third;
		third.next = null;
		s.sortList(first);
	}
}
