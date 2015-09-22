package ClosestBinarySearchTreeValueII;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public List<Integer> closestKValues(TreeNode root, double target, int k) {
    	List<Integer> inorder = inorderTravelsal(root);
    	List<Integer> res = new ArrayList<Integer>();
    	for(int i = 0; i < inorder.size(); i++) {
    		if(res.size() == 0) res.add(inorder.get(i));
    		else {
    			int j = 0;
    			for(j = 0; j < res.size(); j++) {
    				if(Math.abs(res.get(j) - target) < Math.abs(inorder.get(i) - target)) break;
    			}
    			res.add(j, inorder.get(i));
    		}
    	}
    	return res.subList(res.size() - k, res.size());
    }

	private List<Integer> inorderTravelsal(TreeNode root) {
		// TODO Auto-generated method stub
		List<Integer> res = new ArrayList<Integer>();
		if(root == null) return res;
		inorderTravelsal(root, res);
		return res;
	}

	private void inorderTravelsal(TreeNode root, List<Integer> res) {
		// TODO Auto-generated method stub
		if(root == null) return;
		inorderTravelsal(root.left, res);
		res.add(root.val);
		inorderTravelsal(root.right, res);
	}
}

