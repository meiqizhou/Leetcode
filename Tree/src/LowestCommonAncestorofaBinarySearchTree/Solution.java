package LowestCommonAncestorofaBinarySearchTree;

public class Solution {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
    	if(p.val > q.val) return lowestCommonAncestor(root, q, p);
        if(root == p) return p;
        if(root == q) return q;
        if(root.val > q.val) return lowestCommonAncestor(root.left, p, q);
        if(root.val < p.val) return lowestCommonAncestor(root.right, p, q);
		return root;
    }
}