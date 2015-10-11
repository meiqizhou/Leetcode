package ConstructBinaryTreefromInorderandPostorderTraversal;

public class Solution {
    public TreeNode buildTree(int[] inorder, int[] postorder) {
    	if(inorder.length == 0 || postorder.length == 0 || inorder.length != postorder.length) return null;
    	int n = inorder.length;
    	return buildTree(inorder, postorder, 0, n - 1, 0, n - 1);
    }

	private TreeNode buildTree(int[] inorder, int[] postorder, int s1, int e1, int s2, int e2) {
		// TODO Auto-generated method stub
		if(s1 > inorder.length - 1 || s2 > inorder.length - 1) return null;
		if(s1 == e1) return new TreeNode(postorder[e2]);
		if(s1 > e1 || s2 > e2) return null;
		TreeNode root = new TreeNode(postorder[e2]);
		int i;
		for(i = s1; s1 <= e1; i++) if(inorder[i] == postorder[e2]) break;
		int leftLen = i - s1, rightLen = e1 - i;
		root.left = buildTree(inorder, postorder, s1, i - 1, s2, s2 + leftLen - 1);
		root.right = buildTree(inorder, postorder, i + 1, e1, s2 + leftLen, s2 + leftLen + rightLen - 1);
		return root;
	}
}
