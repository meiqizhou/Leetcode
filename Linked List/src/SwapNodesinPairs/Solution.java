package SwapNodesinPairs;

public class Solution {
    public ListNode swapPairs(ListNode head) {
    	if(head == null || head.next == null) return head;
    	ListNode first = head, second = head.next, res = second;
    	while(second.next != null && second.next.next != null) {
    		ListNode temp1 = second.next, temp2 = temp1.next;
    		second.next = first;
    		first.next = temp2;
    		first = temp1;
    		second = temp2;
    	}
    	if(second.next == null) {
    		second.next = first;
    		first.next = null;
    	}
    	else {
    		ListNode temp = second.next;
    		second.next = first;
    		first.next = temp;
    	}
    	return res;
    }
}
