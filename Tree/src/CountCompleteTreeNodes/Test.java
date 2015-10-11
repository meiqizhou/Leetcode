package CountCompleteTreeNodes;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeNode one = new TreeNode(1);
		TreeNode two = new TreeNode(2);
		TreeNode three = new TreeNode(3);
		TreeNode four = new TreeNode(4);
		TreeNode five = new TreeNode(5);
		TreeNode six = new TreeNode(6);
		TreeNode seven = new TreeNode(7);
		TreeNode eight = new TreeNode(8);
		TreeNode nine = new TreeNode(9);
		TreeNode ten = new TreeNode(10);
		one.left = two;
		one.right = three;
		two.left = four;
		two.right = five;
		three.left = six;
		three.right = seven;
		four.left = eight;
		four.right = nine;
		five.left = ten;
		five.right = null;
		six.left = null;
		six.right = null;
		seven.left = null;
		seven.right = null;
		eight.left = null;
		eight.right = null;
		nine.left = null;
		nine.right = null;
		ten.left = null;
		ten.right = null;
		Solution s = new Solution();
		int res = s.countNodes(one);
		System.out.println(res);
	}

}
