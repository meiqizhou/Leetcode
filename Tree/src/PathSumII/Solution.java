package PathSumII;

import java.util.ArrayList;
import java.util.List;

public class Solution{
	public List<List<Integer>> pathSum(TreeNode root, int sum) {
		List<List<Integer>> res = new ArrayList<List<Integer>>();
		if(root == null) return res;
		List<Integer> list = new ArrayList<Integer>();
		helper(root, sum, list, res);
		return res;
	}

	private void helper(TreeNode root, int sum, List<Integer> list, List<List<Integer>> res) {
		// TODO Auto-generated method stub
		if(root == null) return;
		list.add(root.val);
		if(sum == root.val && root.left == null && root.right == null) res.add(new ArrayList<Integer>(list));
		helper(root.left, sum - root.val, list, res);
		helper(root.right, sum - root.val, list, res);
		list.remove(list.size() - 1);
	}
}
