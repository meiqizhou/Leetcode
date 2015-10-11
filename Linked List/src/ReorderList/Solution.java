package ReorderList;

public class Solution {
	public void reorderList(ListNode head){
		if(head == null || head.next == null) return;
		ListNode header = new ListNode(0);
		header.next = head;
		ListNode fast = header, slow = header;
		while(fast != null && fast.next != null) {
			fast = fast.next.next;
			slow = slow.next;
		}
		ListNode l2 = slow.next;
		slow.next = null;
		l2 = reverse(l2);
		merge(head, l2);
		return;
	}


	private void merge(ListNode l1, ListNode l2) {
		// TODO Auto-generated method stub
		while(l1 != null && l2 != null) {
			ListNode t1 = l1.next;
			ListNode t2 = l2.next;
			l1.next = l2;
			l1 = t1;
			l2.next = t1;
			l2 = t2;
		}
		if(l1 != null) l1.next = null;
	}


	private ListNode reverse(ListNode head) {
		if(head == null) return null;
		ListNode first = head, second = head.next;
		while(second != null) {
			ListNode temp = second.next;
			second.next = first;
			first = second;
			second = temp;
		}
		head.next = null;
		return first;
	}
}