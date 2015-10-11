package BinaryTreeMaximumPathSum;

public class Solution {
	//store max value
		int max; 
	 
		public int maxPathSum(TreeNode root) {
//			max = (root == null) ? 0 : root.val;
			if(root == null) max = 0;
			else max = root.val;
			findMax(root);
			return max;
		}

		private int findMax(TreeNode root) {
			// TODO Auto-generated method stub
			if(root == null) return 0;
			int left = Math.max(findMax(root.left), 0);
			int right = Math.max(findMax(root.right), 0);
			max = Math.max(left + right + root.val, max);
			return root.val + Math.max(left, right);
		}
}
