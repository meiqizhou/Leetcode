package BinaryTreePreorderTraversal;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Solution {
	public List<Integer> preorderTraversal(TreeNode root) {
		List<Integer> list = new ArrayList<Integer>();
		if(root == null) return list;
		Stack<TreeNode> stack = new Stack<TreeNode>();
		stack.push(root);
		while(!stack.isEmpty()) {
			TreeNode t = stack.pop();
			list.add(t.val);
			if(t.right != null) stack.push(t.right);			
			if(t.left != null) stack.push(t.left);
		}
		return list;
    }
}
