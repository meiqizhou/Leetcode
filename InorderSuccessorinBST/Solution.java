package InorderSuccessorinBST;

import java.util.ArrayList;
import java.util.List;
/**
 * Q:Given a binary search tree and a node in it, find the in-order successor of that node in the BST.
 * @author lby
 *
 */
public class Solution {
    public TreeNode inorderSuccessor(TreeNode root, TreeNode p) {
    	if(p.right != null) return findMin(p.right);
    	List<TreeNode> list = getAncenssor(root, p);
    	 int i = 2;
         while (list.size() - i > -1) {
                 TreeNode parent = list.get(list.size() - i);
                 if(parent.left == p) return parent;
                 p = parent;
                 i++;
         }
         return null;
    }

	private List<TreeNode> getAncenssor(TreeNode root, TreeNode p) {
		// TODO Auto-generated method stub
		List<TreeNode> res = new ArrayList<TreeNode>();
		helper(root, p, new ArrayList<TreeNode>(), res);
		return res;
	}

	private void helper(TreeNode root, TreeNode p, List<TreeNode> list, List<TreeNode> res) {
		// TODO Auto-generated method stub
		if(root == null) return;
		list.add(root);
		if(root == p) {
			res.addAll(new ArrayList<TreeNode>(list));
			return;
		}
		helper(root.left, p, list, res);
		helper(root.right, p, list, res);
		list.remove(list.size() - 1);
	}

	private TreeNode findMin(TreeNode node) {
		// TODO Auto-generated method stub
		while(node.left != null) {
			node = node.left;
		}
		return node;
	}
}
