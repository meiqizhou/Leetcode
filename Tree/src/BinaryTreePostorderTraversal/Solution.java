package BinaryTreePostorderTraversal;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Solution {
	public List<Integer> postorderTraversal(TreeNode root) {
		List<Integer> res = new ArrayList<Integer>();
		if(root == null) return res;
		Stack<TreeNode> stack = new Stack<TreeNode>();
		stack.push(root);
		TreeNode pre = null;
		while(!stack.isEmpty()) {
			TreeNode cur = stack.peek();
			if(pre == null || pre.left == cur || pre.right == cur) {
				if(cur.left != null) stack.push(cur.left);
				else if(cur.right != null) stack.push(cur.right);
				else {
					stack.pop();
					res.add(cur.val);
				}
			}
			else if(cur.left == pre) {
				if(cur.right != null) stack.push(cur.right);
				else {
					stack.pop();
					res.add(cur.val);
				}
			}
			else if(cur.right == pre) {
				stack.pop();
				res.add(cur.val);
			}
			pre = cur;
		}
		return res;
	}
}
