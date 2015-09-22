package ClosestBinarySearchTreeValue;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Solution s = new Solution();
		TreeNode root = new TreeNode(1);
		TreeNode R = new TreeNode(2);
		root.left = null;
		root.right = R;
		s.closestValue(root, 3.428571);
	}

}
