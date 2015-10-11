package ConstructBinaryTreefromPreorderandInorderTraversal;

public class Solution {
    public TreeNode buildTree(int[] preorder, int[] inorder) {
    	if(preorder.length == 0 || inorder.length == 0 || preorder.length != inorder.length) return null;
    	int n = inorder.length;
    	return buildTree(preorder, inorder, 0, n - 1, 0, n - 1);
    }

	private TreeNode buildTree(int[] preorder, int[] inorder, int s1, int e1, int s2, int e2) {
		// TODO Auto-generated method stub
		if(s1 > preorder.length - 1 || s2 > preorder.length - 1) return null;
		if(s1 == e1) return new TreeNode(preorder[s1]);
		if(s1 > e1 || s2 > e2) return null;
		TreeNode root = new TreeNode(preorder[s1]);
		int i;
		for(i = s2; i <= e2; i++) if(inorder[i] == root.val) break;
		int leftlength = i - s2;
        root.left = buildTree(preorder, inorder, s1 + 1, s1 + leftlength, s2, i - 1);
        root.right = buildTree(preorder, inorder, s1 + leftlength + 1, e1, i + 1, e2);
        return root;
	}
}