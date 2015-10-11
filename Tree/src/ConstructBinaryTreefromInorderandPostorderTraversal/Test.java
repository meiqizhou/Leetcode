package ConstructBinaryTreefromInorderandPostorderTraversal;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Solution s = new Solution();
		TreeNode t = s.buildTree(new int[]{1,2,3,4}, new int[]{3,2,4,1});
		System.out.println(t);
	}

}
