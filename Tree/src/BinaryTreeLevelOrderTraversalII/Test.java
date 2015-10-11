package BinaryTreeLevelOrderTraversalII;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeNode a = new TreeNode(1);
		TreeNode b = new TreeNode(2);
		a.left = b;
		a.right = null;
		b.left = null;
		b.right = null;
		Solution s = new Solution();
		s.levelOrderBottom(a);
	}

}
