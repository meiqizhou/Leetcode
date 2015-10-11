package ReorderList;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ListNode a = new ListNode(1);
		ListNode b = new ListNode(2);
		ListNode c = new ListNode(3);
//		ListNode d = new ListNode(4);
		a.next = b;
		b.next = c;
		c.next = null;
//		d.next = null;
		Solution s = new Solution();
		s.reorderList(a);
	}
}
