package PathSumII;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeNode one = new TreeNode(1);
		TreeNode two= new TreeNode(-2);
		TreeNode three = new TreeNode(-3);
		TreeNode four = new TreeNode(1);
		TreeNode five = new TreeNode(3);
		TreeNode six = new TreeNode(-2);
		TreeNode seven = new TreeNode(-1);
//		TreeNode eight = new TreeNode(2);
//		TreeNode nine = new TreeNode(5);
//		TreeNode ten = new TreeNode(1);
		one.left = two;
		one.right = three;
		two.left = four;
		two.right = five;
		three.left = six;
		three.right = null;
		four.left = seven;
		four.right = null;
		five.left = null;
		five.right = null;
		six.left = null;
		six.right = null;
		seven.left = null;
		seven.right = null;
//		eight.left = null;
//		eight.right = null;
//		nine.left = null;
//		nine.right = null;
//		ten.left = null;
//		ten.right = null;
//		one.left = null;
//		one.right = two;
		Solution s = new Solution();
		s.pathSum(one, 2);
	}

}
