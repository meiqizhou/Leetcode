package BinaryTreeZigzagLevelOrderTraversal;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Solution {
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
    	List<List<Integer>> res = new ArrayList<List<Integer>>();
    	if(root == null) return res;
    	int flag = 0;
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
    		if(flag == 0) res.add(valList);
    		else {
    			reverse(valList);
    			res.add(valList);
    		}
    		flag = Math.abs(flag - 1);
    		for(int i = 0; i < treeList.size(); i++) {
    			TreeNode t = treeList.get(i);
    			if(t.left != null) queue.add(t.left);
    			if(t.right != null) queue.add(t.right);
    		}
    	}
    	return res;
    }

	private void reverse(List<Integer> list) {
		// TODO Auto-generated method stub
		int i = 0, j = list.size() - 1;
		while(i < j) {
			int k = list.get(i);
			list.set(i, list.get(j));
			list.set(j, k);
			i++;
			j--;
		}
	}
}
