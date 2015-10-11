package RemoveNthNodeFromEndofList;

public class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
    	ListNode p1 = new ListNode(0);
    	p1.next = head;
    	ListNode p2 = head;
    	while(n > 0){
    		p2 = p2.next;
    		if(p2 == null) return head.next;
    		n--;
    	}
    	while(p2 != null){
    		p1 = p1.next;
    		p2 = p2.next;
    	}
    	p1.next = p1.next.next;
    	return head;
    }
}
