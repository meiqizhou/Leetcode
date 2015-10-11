package ReverseLinkedListII;

public class Solution {
    public ListNode reverseBetween(ListNode head, int m, int n) {
    	ListNode header = new ListNode(0);
    	header.next = head;
    	ListNode p1 = header, p2 = header;
    	int count = 0;
    	while(count < m - 1) {
    		p1 = p1.next;
    		p2 = p2.next;
    		count++;
    	}
    	ListNode start = p1;
    	p1 = p1.next;
    	while(count < n) {
    		p2 = p2.next;
    		count++;
    	}
    	ListNode end = p2.next;
    	reverse(p1, p2.next);
    	start.next = p2;
    	p1.next = end;
    	return header.next;
    }

	private void reverse(ListNode p1, ListNode p2) {
		// TODO Auto-generated method stub
		ListNode first = p1, second = p1.next;
		while(second != p2) {
			ListNode temp = second.next;
			second.next = first;
			first = second;
			second = temp;
		}
	}
}
