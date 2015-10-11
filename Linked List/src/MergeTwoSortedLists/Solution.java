package MergeTwoSortedLists;

public class Solution {
	public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
		ListNode l3 = new ListNode(0);
		ListNode p1 = l1, p2 = l2, p3 = l3;
		while(p1 != null || p2 != null) {
			if(p1 == null) p3.next = p2;
			else if(p2 == null) p3.next = p1;
			else if(p1.val > p2.val) {
				p3.next = p2;
				p3 = p3.next;
				p2 = p2.next;
			}
			else {
				p3.next = p1;
				p3 = p3.next;
				p1 = p1.next;
			}
		}
		return l3;
    }
}