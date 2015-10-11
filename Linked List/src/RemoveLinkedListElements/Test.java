package RemoveLinkedListElements;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Solution s = new Solution();
		ListNode a = new ListNode(1);
		ListNode b = new ListNode(2);
		ListNode c = new ListNode(6);
		ListNode d = new ListNode(3);
		ListNode e = new ListNode(4);
		ListNode f = new ListNode(5);
		ListNode g = new ListNode(6);
		a.next = b;
		b.next = c;
		c.next = d;
		d.next = e;
		e.next = f;
		f.next = g;
		g.next = null;
		ListNode l = s.removeElements(a, 6);
		System.out.println(l);
	}
}
