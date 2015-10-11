package InvertBinaryTree;



public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeNode one = new TreeNode(4);
		TreeNode two = new TreeNode(2);
		TreeNode three = new TreeNode(7);
		TreeNode four = new TreeNode(1);
		TreeNode five = new TreeNode(3);
		TreeNode six = new TreeNode(6);
		TreeNode seven = new TreeNode(9);
		one.left = two;
		one.right = three;
		two.left = four;
		two.right = five;
		three.left = six;
		three.right = seven;
		four.left = null;
		four.right = null;
		five.left = null;
		five.right = null;
		six.left = null;
		six.right = null;
		seven.left = null;
		seven.right = null;
		Solution s = new Solution();
		TreeNode t = s.invertTree(one);
		System.out.println(t);
	}

}
