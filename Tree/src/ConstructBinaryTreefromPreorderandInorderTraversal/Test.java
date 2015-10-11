package ConstructBinaryTreefromPreorderandInorderTraversal;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Solution s = new Solution();
		TreeNode t = s.buildTree(new int[]{1,2,4,5,6,7,3,8,10,9}, new int[]{4,2,6,5,7,1,8,10,3,9});
		System.out.println(t);
	}
}
