package BinaryTreePostorderTraversal;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeNode one = new TreeNode(1);
		TreeNode two = new TreeNode(2);
		TreeNode three = new TreeNode(3);
		TreeNode four = new TreeNode(4);
		TreeNode five = new TreeNode(5);
		TreeNode six = new TreeNode(6);
		one.left = two;
		one.right = three;
		two.left = four;
		two.right = five;
		four.left = null;
		four.right = null;
		five.left = null;
		five.right = null;
		three.left = six;
		three.right = null;
		six.left = null;
		six.right = null;
		Solution s = new Solution();
		s.postorderTraversal(one);
	}
}
