package RemoveLinkedListElements;

public class Solution {
	public ListNode removeElements(ListNode head, int val) {
		ListNode header = new ListNode(0);
		header.next = head;
		ListNode p = header;
		while(p != null && p.next != null){
			if(p.next.val != val) p = p.next;
			else{
				while(p.next != null && p.next.val == val){
					p.next = p.next.next;
				}
				p = p.next;
			}
		}
		return header.next;
    }
}
