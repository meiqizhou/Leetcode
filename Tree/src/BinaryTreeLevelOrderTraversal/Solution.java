package BinaryTreeLevelOrderTraversal;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Solution {
	public List<List<Integer>> levelOrder(TreeNode root) {
		List<List<Integer>> res = new ArrayList<List<Integer>>();
		if(root == null) return res;
		Queue<TreeNode> queue = new LinkedList<TreeNode>();
		queue.add(root);
		while(!queue.isEmpty()) {
			List<TreeNode> treeList = new ArrayList<TreeNode>();
			List<Integer> valList = new ArrayList<Integer>();
			while(!queue.isEmpty()) {
				TreeNode t = queue.poll();
				treeList.add(t);
				valList.add(t.val);
			}
			res.add(valList);
			for(int i = 0; i < treeList.size(); i++) {
				TreeNode t = treeList.get(i);
				if(t.left != null) queue.add(t.left);
				if(t.right != null) queue.add(t.right);
			}
		}
		return res;
	}
}
