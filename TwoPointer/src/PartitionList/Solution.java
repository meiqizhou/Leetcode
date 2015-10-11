package PartitionList;

public class Solution {
    public ListNode partition(ListNode head, int x) {
    	ListNode p1 = head;
    	ListNode p2 = head;
    	ListNode p3 = head;
    	ListNode l1 = new ListNode(0);
    	ListNode start = l1.next;
    	ListNode l2 = new ListNode(0);
    	ListNode end = l2.next;
    	ListNode l3 = new ListNode(0);
    	ListNode mid = l3.next;
    	while(p1 != null && p1.val < x){
    		l1.next = p1;
    		l1 = l1.next;
    		p1 = p1.next;
    	}
    	while(p2 != null && p2.val > x){
    		l2.next = p2;
    		l2 = l2.next;
    		p2 = p2.next;
    	}
    	while(p3 != null && p3.val == x){
    		l3.next = p3;
    		l3 = l3.next;
    		p3 = p3.next;
    	}
    	start.next = mid;
    	mid.next = end;
    	return start;
    }
}
