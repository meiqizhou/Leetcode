package ClosestBinarySearchTreeValue;

import java.util.ArrayList;
import java.util.List;

/**
 * Given a non-empty binary search tree and a target value, find the value in the BST that is closest to the target.
 * @author lby
 *
 */
public class Solution {
	private double min = Double.MAX_VALUE; int res; 
    public int closestValue(TreeNode root, double target) {
    	List<Integer> list = inorderTraversal(root);
    	res = root.val;
    	for(int i = 0; i < list.size(); i++) {
    		if(Math.abs(list.get(i) - target) < min) {
    			min = Math.abs(list.get(i) - target);
    			res = list.get(i);
    		}
    	}
    	return res;
    }
    
    private List<Integer> inorderTraversal(TreeNode root) {
    	List<Integer> res = new ArrayList<Integer>();
    	if(root == null) return res;
    	inorderTraversal(root, res);
    	return res;
    }

	private void inorderTraversal(TreeNode root, List<Integer> res) {
		// TODO Auto-generated method stub
		if(root == null) return;
		inorderTraversal(root.left, res);
		res.add(root.val);
		inorderTraversal(root.right, res);
	}
}
