package RecoverBinarySearchTree;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Solution {
    public void recoverTree(TreeNode root) {
    	List<TreeNode> list = inorderTraversal(root);
    	List<TreeNode> temp = new ArrayList<TreeNode>(list);
    	TreeNode p = new TreeNode(0), q = new TreeNode(0);
    	int flag = 0;
    	Collections.sort(temp, new ListComparator());
    	for(int i = 0; i < list.size(); i++) {
    		if(flag == 0 && list.get(i).val != temp.get(i).val) {
    			p = list.get(i);
    			flag = 1;
    		}
    		else if(flag == 1 && list.get(i).val != temp.get(i).val) {
    			q = list.get(i);
    			break;
    		}
    	}
    	flag = p.val;
    	p.val = q.val;
    	q.val = flag;
    }
    
    private List<TreeNode> inorderTraversal(TreeNode root) {
    	List<TreeNode> list = new ArrayList<TreeNode>();
    	if(root == null) return list;
    	inorderTraversal(root, list);
    	return list;
    }

	private void inorderTraversal(TreeNode root, List<TreeNode> list) {
		// TODO Auto-generated method stub
		if(root == null) return;
		inorderTraversal(root.left, list);
		list.add(root);
		inorderTraversal(root.right, list);
	}
}
