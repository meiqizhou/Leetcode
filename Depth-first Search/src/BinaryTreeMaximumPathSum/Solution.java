package BinaryTreeMaximumPathSum;

public class Solution {
    private int sum;
    public int maxPathSum(TreeNode root) {
        sum = root == null ? 0 : root.val;
        findMax(root);
        return sum;
    }
	private int findMax(TreeNode root) {
		// TODO Auto-generated method stub
		if(root == null) return 0;
		int left = Math.max(findMax(root.left), 0);
		int right = Math.max(findMax(root.right), 0);
		sum = Math.max(sum, left + right + root.val);
		return Math.max(left, right) + root.val;
	}
}
