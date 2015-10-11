package RemoveDuplicatesfromSortedList;


public class Solution {
    public ListNode deleteDuplicates(ListNode head) {
    	ListNode header = new ListNode(head.val - 1);
    	header.next = head;
    	ListNode p = head, pre = header;
    	while(p != null && p.next != null) {
    		while(p.next != null && p.val != p.next.val) {
    			pre = pre.next;
    			p = p.next;
    		}
    		if(p.next != null && p.val == p.next.val) {
    			while(p.next != null && p.val == p.next.val) p = p.next;
        		pre.next = p.next;
        		p = p.next;
    		}
    	}
    	return header.next;
    }
}
