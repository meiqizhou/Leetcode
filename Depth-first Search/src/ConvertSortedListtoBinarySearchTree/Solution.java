package ConvertSortedListtoBinarySearchTree;

import java.util.Arrays;

public class Solution {
	public TreeNode sortedListToBST(ListNode head) {
		int[] arr = listToArray(head);
		return sortedArrayToBST(arr, 0, arr.length - 1);
    }
	
	private TreeNode sortedArrayToBST(int[] arr, int lo, int hi) {
		// TODO Auto-generated method stub
		if(hi < lo) return null;
		int mid = lo + (hi - lo) / 2;
		TreeNode node = new TreeNode(arr[mid]);
		node.left = sortedArrayToBST(arr, lo, mid - 1);
		node.right = sortedArrayToBST(arr, mid + 1, hi);
		return node;
	}

	private int[] listToArray(ListNode head) {
		int[] arr = new int[100000];
		int i = 0;
		while(head != null) {
			arr[i++] = head.val;
			head = head.next;
		}
		return Arrays.copyOfRange(arr, 0, i);
	}
}
