package RotateList;

public class Solution {
    public ListNode rotateRight(ListNode head, int n) {
    	if(head == null || n == 0) return head;
    	ListNode header = new ListNode(0);
    	header.next = head;
    	ListNode p1 = header, p2 = head;
    	int len = 0;
    	while(p2 != null) {
    		p1 = p1.next;
    		p2 = p2.next;
    		len++;
    	}
    	n = n % len;
    	if(n == len || n == 0) return head;
    	int t = len - n;
    	ListNode p3 = header, p4 = head;
    	while(t > 0) {
    		p3 = p3.next;
    		p4 = p4.next;
    		t--;
    	}
    	p1.next = head;
    	p3.next = null;
    	return p4;
    }
}