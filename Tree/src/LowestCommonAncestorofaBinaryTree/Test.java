package LowestCommonAncestorofaBinaryTree;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Solution s = new Solution();
		TreeNode one = new TreeNode(-1);
		TreeNode two = new TreeNode(0);
		TreeNode three = new TreeNode(3);
		TreeNode four = new TreeNode(-2);
		TreeNode five = new TreeNode(4);
		TreeNode six = new TreeNode(8);
//		TreeNode seven = new TreeNode(8);
//		TreeNode eight = new TreeNode(7);
//		TreeNode nine = new TreeNode(4);
		one.left = two;
		one.right = three;
		two.left = four;
		two.right = five;
		three.left = null;
		three.right = null;
		four.left = six;
		four.right = null;
		five.left = null;
		five.right = null;
		six.left = null;
		six.right = null;
//		seven.left = null;
//		seven.right = null;
//		eight.left = null;
//		eight.right = null;
//		nine.left = null;
//		nine.right = null;
		s.lowestCommonAncestor(one, six, five);
	}

}
