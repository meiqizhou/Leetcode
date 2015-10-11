package BinaryTreeInorderTraversal;

import java.util.ArrayList;
import java.util.List;

public class Solution {
	public List<Integer> inorderTraversal(TreeNode root) {
		List<Integer> list = new ArrayList<Integer>();
		if(root == null) return list;
		inorderTraversal(root, list);
		return list;
	}

	private void inorderTraversal(TreeNode root, List<Integer> list) {
		// TODO Auto-generated method stub
		if(root == null) return;
		inorderTraversal(root.left, list);
		list.add(root.val);
		inorderTraversal(root.right, list);
	}
}
