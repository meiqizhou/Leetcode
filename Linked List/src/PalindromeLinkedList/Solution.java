package PalindromeLinkedList;

public class Solution {
    public boolean isPalindrome(ListNode head) {
    	int N = 0;
    	ListNode p = head;
    	while(p != null) {
    		N++;
    		p = p.next;
    	}
    	ListNode header = new ListNode(0);
    	header.next = head;
    	ListNode p1 = head, p2 = head, pre = header;
    	ListNode reve = new ListNode(0);
    	if(N % 2 == 0) {
    		while(p2 != null) {
    			p2 = p2.next.next;
    			p1 = p1.next;
    			pre = pre.next;
    		}
    		pre.next = null;
    		reve = reverse(p1);
    	}
    	else {
    		while(p2.next != null) {
    			p2 = p2.next.next;
    			p1 = p1.next;
    			pre = pre.next;
    		}
    		pre.next = null;
    		reve = reverse(p1.next);
    	}
    	while(reve != null && head != null) {
    		if(reve.val != head.val) return false;
    		reve = reve.next;
    		head = head.next;
    	}
    	return true;
    }

	private ListNode reverse(ListNode p) {
		// TODO Auto-generated method stub
		if(p == null) return p;
		ListNode first = p, second = p.next;
		while(second != null) {
			ListNode temp = second.next;
			second.next = first;
			first = second;
			second = temp;
		}
		p.next = null;
		return first;
	}
}
