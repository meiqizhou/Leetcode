package SymmetricTree;

public class Solution {
	public boolean isSymmetric(TreeNode root) {
		if(root == null) return true;
		return isSymmetric(root.left, root.right);
    }

	private boolean isSymmetric(TreeNode a, TreeNode b) {
		if(a == null) return b == null;
		if(b == null) return a == null;
		if(a.val != b.val) return false;
		return isSymmetric(a.left, b.right) && isSymmetric(a.right, b.left);
	}
}
