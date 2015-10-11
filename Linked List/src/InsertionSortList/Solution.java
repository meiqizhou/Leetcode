package InsertionSortList;
/**
 * 
 * @author lby
 * 两个指针cur 和 temp最初为head.next 和 head
 * 如果temp < cur, temp往后移，重合了则cur往后移，temp移回head
 * 如果temp　> cur 且 不重合，先交换值，然后temp往后移，直到重合
 */

public class Solution {
	public ListNode insertionSortList(ListNode head) {
		if(head == null || head.next == null) return head;
		ListNode cur = head.next;
		while(cur != null) {
			ListNode temp = head;
			while(temp.val < cur.val && temp != cur) temp = temp.next;
			while(temp != cur) {
				int tempVal = temp.val;
				temp.val = cur.val;
				cur.val = tempVal;
				temp = temp.next;
			}
			cur = cur.next;
		}
		return head;
    }
}
