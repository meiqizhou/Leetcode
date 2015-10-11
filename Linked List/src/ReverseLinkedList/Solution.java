package ReverseLinkedList;
public class Solution {
	public ListNode reverseList(ListNode head) {
		if(head == null) return head;
		ListNode first = head, second = head.next;
		while(second != null) {
			ListNode temp = second.next;
			second.next = first;
			first = second;
			second = temp;
		}
		head = null;
		return first;
	}
}