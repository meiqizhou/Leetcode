package BinaryTreeInorderTraversal;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Solution {
	public List<Integer> inorderTraversal(TreeNode root) {
		List<Integer> list = new ArrayList<Integer>();
		Stack<TreeNode> stack = new Stack<TreeNode>();
		TreeNode p = root;
		while(!stack.isEmpty() || p != null) {
			if(p != null) {
				stack.add(p);
				p = p.left;
			}
			else {
				TreeNode temp = stack.pop();
				list.add(temp.val);
				p = temp.right;
			}
		}
		return list;
	}
}
