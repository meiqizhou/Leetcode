package ConvertSortedArraytoBinarySearchTree;

public class Solution {
    public TreeNode sortedArrayToBST(int[] num) {
    	return sortedArrayToBST(num, 0, num.length - 1);
    }

	private TreeNode sortedArrayToBST(int[] num, int lo, int hi) {
		// TODO Auto-generated method stub
		if(lo > hi) return null;
		int mid = lo + (hi - lo) / 2;
		TreeNode node = new TreeNode(num[mid]);
		node.left = sortedArrayToBST(num, lo, mid - 1);
		node.right = sortedArrayToBST(num, mid + 1, hi);
		return node;
	}
}