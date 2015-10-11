package RemoveNthNodeFromEndofList;

public class Solution {
	public ListNode removeNthFromEnd(ListNode head, int n) {
		ListNode header = new ListNode(0);
		header.next = head;
		ListNode p1 = header, p2 = head;
		int count = 0;
		while(p2 != null && count < n) {
			p2 = p2.next;
			count++;
			if(p2 == null && count == n) return head.next;
			else if(p2 == null && count < n) return head;
		}
		while(p2 != null) {
			p1 = p1.next;
			p2 = p2.next;
		}
		p1.next = p1.next.next;
		return head;
    }
}
