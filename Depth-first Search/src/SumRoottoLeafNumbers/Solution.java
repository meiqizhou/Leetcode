package SumRoottoLeafNumbers;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public int sumNumbers(TreeNode root) {
    	if(root == null);
    	List<List<Integer>> res = new ArrayList<List<Integer>>();
    	List<Integer> list = new ArrayList<Integer>();
    	helper(root, list, res);
    	return calculate(res);
    }
    
	private int calculate(List<List<Integer>> res) {
		// TODO Auto-generated method stub
		int sum = 0;
		for(int i = 0; i < res.size(); i++) {
			sum += getVal(res.get(i));
		}
		return sum;
	}
	
	private int getVal(List<Integer> list) {
		// TODO Auto-generated method stub
		StringBuilder sb = new StringBuilder();
		for(int i = 0; i < list.size(); i++) {
			sb.append(list.get(i));
		}
		return Integer.parseInt(sb.toString());
	}
	
	private void helper(TreeNode root, List<Integer> list, List<List<Integer>> res) {
		// TODO Auto-generated method stub
		if(root == null) return;
		list.add(root.val);
		if(root.left == null && root.right == null) {
			res.add(new ArrayList<Integer>(list));
		}
		helper(root.left, list, res);
		helper(root.right, list, res);
		list.remove(list.size() - 1);
	}
}
