package LowestCommonAncestorofaBinaryTree;

import java.util.ArrayList;
import java.util.List;

public class Solution {
	private List<List<TreeNode>> res = new ArrayList<List<TreeNode>>();
	public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
		List<TreeNode> l1 = new ArrayList<TreeNode>();
		List<TreeNode> l2 = new ArrayList<TreeNode>();
		helper(root, p, l1, res);
		helper(root, q, l2, res);
		l1 = res.get(0);
		l2 = res.get(1);
		for(int i = 0; i < Math.min(l1.size(), l2.size()); i++) {
			if(l1.get(i) == l2.get(i)) continue;
			else return l1.get(i - 1);
		}
		return l1.get(Math.min(l1.size(), l2.size()) - 1);
    }

	private void helper(TreeNode root, TreeNode t, List<TreeNode> list, List<List<TreeNode>> res) {
		// TODO Auto-generated method stub
		if(root == null) {
			return;
		}
		list.add(root);
		if(root == t) {
			res.add(new ArrayList<TreeNode>(list));
			return;
		}
		helper(root.left, t, list, res);
		helper(root.right, t, list, res);
		list.remove(list.size() - 1);
	}
}
