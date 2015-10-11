package ReverseNodesinkGroup;

import java.util.Stack;

//注意List的长度等于n的情况下，也要换
public class Solution {
	public ListNode reverseKGroup(ListNode head, int k) {
		if(k == 0 || k == 1 || lengthOfList(head) < k) return head;
		ListNode res = reverseOfLengthK(head, k); //最后要返回的值
		ListNode cur = getKthListNode(res, k), post;
		if(cur.next != null) post = cur.next;
		else return res;
		while(lengthOfList(post) >= k) {
			ListNode temp = reverseOfLengthK(post, k);
			cur.next = temp;
			cur = getKthListNode(temp, k);
			post = cur.next;
		}
		return res;
    }
	
	private int lengthOfList(ListNode head) {
		int count = 0;
		while(head != null) {
			head = head.next;
			count++;
		}
		return count;
	}
	
	private ListNode reverseOfLengthK(ListNode head, int k) {
		if(lengthOfList(head) < k) return head;
		Stack<ListNode> stack = new Stack<ListNode>();
		while(k > 0) {
			stack.push(head);
			head = head.next;
			k--;
		}
		ListNode temp = head, res = stack.peek();
		while(!stack.isEmpty()) {
			ListNode first = stack.pop();
			if(stack.isEmpty()){
				first.next = temp;
				break;
			}
			first.next = stack.peek();
		}
		return res;
	}
	
	private ListNode getKthListNode(ListNode head, int k) {
		while(lengthOfList(head) < k) return null;
		int count = 1;
		while(count < k) {
			head = head.next;
			count++;
		}
		return head;
	}
}
