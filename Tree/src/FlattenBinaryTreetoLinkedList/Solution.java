package FlattenBinaryTreetoLinkedList;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public void flatten(TreeNode root) {
    	List<TreeNode> list = preorder(root);
    	for(int i = 1; i < list.size(); i++) {
    		root.left = null;
    		root.right = list.get(i);
    		root = root.right;
    	}
    }
    
    public List<TreeNode> preorder(TreeNode root) {
    	List<TreeNode> list = new ArrayList<TreeNode>();
    	if(root == null) return list;
    	preorder(root, list);
    	return list;
    }

	private void preorder(TreeNode root, List<TreeNode> list) {
		// TODO Auto-generated method stub
		if(root == null) return;
		list.add(root);
		preorder(root.left, list);
		preorder(root.right, list);
	}
}

