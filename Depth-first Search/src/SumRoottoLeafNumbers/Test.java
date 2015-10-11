package SumRoottoLeafNumbers;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeNode one = new TreeNode(1);
		TreeNode two = new TreeNode(2);
		TreeNode three = new TreeNode(3);
		one.left = two;
		one.right = three;
		two.left = null;
		two.right = null;
		three.left = null;
		three.right = null;
		Solution s = new Solution();
		int res = s.sumNumbers(one);
		System.out.println(res);
	}

}
