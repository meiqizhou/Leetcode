package SortList;

public class Solution {
    public ListNode sortList(ListNode head) {
        return merge(head);
    }
    
    private ListNode merge(ListNode head) {
		if(head == null || head.next == null) return head;
		ListNode slow = head, fast = head, p1 = head;
		while(fast != null && fast.next != null) {
			slow = slow.next;
			fast = fast.next.next;
		}
		ListNode p2 = slow;
		slow = head;
		while(slow.next != p2) slow = slow.next;
		slow.next = null;
		ListNode head1 = merge(p1);
		ListNode head2 = merge(p2);
		return mergeTwoList(head1, head2);
	}
    
    private ListNode mergeTwoList(ListNode head1, ListNode head2) {
        ListNode head3 = new ListNode(0);
        ListNode p1 = head1, p2 = head2, p3 = head3;
        while(p1 != null && p2 != null) {
            if(p1.val <= p2.val) {
                p3.next = p1;
                p1 = p1.next;
            }
            else {
                p3.next = p2;
                p2 = p2.next;
            }
            p3 = p3.next;
        }
        if(p1 != null) p3.next = p1;
        else p3.next = p2;
        return head3.next;
    }
}