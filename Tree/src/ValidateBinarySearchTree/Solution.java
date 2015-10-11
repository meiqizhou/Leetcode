package ValidateBinarySearchTree;
public class Solution {
    public boolean isValidBST(TreeNode root) {
    	if(root == null) return true;
    	return isValidBST(root.left) && isValidBST(root.right)
    		&&isSubTreeLessThan(root.left, root.val) && isSubTreeMoreThan(root.right, root.val);
    }

	private boolean isSubTreeLessThan(TreeNode left, int val) {
		// TODO Auto-generated method stub
		if(left == null) return true;
		return left.val < val && isSubTreeLessThan(left.right, val);
	}

	private boolean isSubTreeMoreThan(TreeNode right, int val) {
		// TODO Auto-generated method stub
		if(right == null) return true;
		return right.val > val && isSubTreeMoreThan(right.left, val);
	}
}
