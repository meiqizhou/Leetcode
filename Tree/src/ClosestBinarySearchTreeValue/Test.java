package ClosestBinarySearchTreeValue;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeNode a = new TreeNode(1);
		TreeNode b = new TreeNode(2);
		a.left = null;
		a.right = b;
		Solution s = new Solution();
		System.out.println(s.closestValue(a, 3.428571));
	}

}
