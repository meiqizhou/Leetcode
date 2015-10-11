package PathSumII;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeNode one = new TreeNode(5);
		TreeNode two= new TreeNode(4);
		TreeNode three = new TreeNode(8);
		TreeNode four = new TreeNode(11);
		TreeNode five = new TreeNode(13);
		TreeNode six = new TreeNode(4);
		TreeNode seven = new TreeNode(7);
		TreeNode eight = new TreeNode(2);
		TreeNode nine = new TreeNode(1);
		one.left = two;
		one.right = three;
		two.left = four;
		two.right = null;
		three.left = five;
		three.right = six;
		four.left = seven;
		four.right = eight;
		five.left = null;
		five.right = null;
		six.left = null;
		six.right = nine;
		seven.left = null;
		seven.right = null;
		eight.left = null;
		eight.right = null;
		nine.left = null;
		nine.right = null;
//		ten.left = null;
//		ten.right = null;
//		one.left = null;
//		one.right = two;
		Solution s = new Solution();
		s.pathSum(one, 22);
	}

}
