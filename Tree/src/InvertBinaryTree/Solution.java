package InvertBinaryTree;

public class Solution {
    public TreeNode invertTree(TreeNode root) {
    	if(root == null) return null;
    	TreeNode head = new TreeNode(root.val);
    	head.left = invertTree(root.right);
    	head.right = invertTree(root.left);
    	return head;
    }
}
