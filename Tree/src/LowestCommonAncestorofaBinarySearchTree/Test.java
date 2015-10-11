package LowestCommonAncestorofaBinarySearchTree;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeNode root = new TreeNode(2);
		TreeNode left = new TreeNode(1);
		TreeNode right = new TreeNode(3);
		root.left = left;
		root.right = right;
		left.left = null;
		left.right = null;
		right.left = null;
		right.right = null;
		Solution s = new Solution();
		s.lowestCommonAncestor(root, right, left);
	}

}
