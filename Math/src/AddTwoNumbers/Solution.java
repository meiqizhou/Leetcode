package AddTwoNumbers;

public class Solution {
	public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
		ListNode p1 = l1, p2 = l2;
		ListNode pre1 = new ListNode(0);
		ListNode pre2 = new ListNode(0);
		pre1.next = p1;
		pre2.next = p2;
		int carry = 0;
		while(p1 != null && p2 != null) {
			int digit = (p1.val + p2.val + carry) % 10;
			carry = (p1.val + p2.val + carry) / 10;
			p1.val = digit;
			pre1 = pre1.next;
			pre2 = pre2.next;
			p1 = p1.next;
			p2 = p2.next;
		}
		if(p1 == null && p2 != null) {
			pre1.next = p2;
			while(p2 != null) {
				int digit = (p2.val + carry) % 10;
				carry = (p2.val + carry) / 10;
				p2.val = digit;
				p2 = p2.next;
				pre1 = pre1.next;
			}
			if(carry == 1) {
				ListNode temp = new ListNode(carry);
				pre1.next = temp;
				temp.next = null;
			}
		}
		else if(p2 == null && p1 != null) {
			while(p1 != null) {
				int digit = (p1.val + carry) % 10;
				carry = (p1.val + carry) / 10;
				p1.val = digit;
				pre1 = pre1.next;
				p1 = p1.next;
			}
			if(carry == 1) {
				ListNode temp = new ListNode(carry);
				pre1.next = temp;
				temp.next = null;
			}
		}
		else {
			if(carry == 1) {
				ListNode temp = new ListNode(carry);
				pre1.next = temp;
				temp.next = null;
			}
		}
		return l1;
    }
}
