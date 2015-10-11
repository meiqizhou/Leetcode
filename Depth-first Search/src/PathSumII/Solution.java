package PathSumII;

import java.util.ArrayList;
import java.util.List;

public class Solution{
	public List<List<Integer>> pathSum(TreeNode root, int sum) {
	    List<List<Integer>> res = new ArrayList<List<Integer>>();
	    if(root==null)
	        return res;
	    List<Integer> item = new ArrayList<Integer>();
	    helper(root, 0, sum, item, res);
	    return res;
	}

	private void helper(TreeNode root, int cur, int sum, List<Integer> item, List<List<Integer>> res) {
		// TODO Auto-generated method stub
		cur += root.val;
		item.add(root.val);
		if(root.left == null && root.right == null && cur != sum) {
			item.remove(item.size() - 1);
			return;
		}
		if(cur == sum && root.left == null && root.right == null) {
			res.add(new ArrayList<Integer>(item));
			item.remove(item.size() - 1);
			return;
		}
		if(root.left != null) helper(root.left, cur, sum, item, res);
		if(root.right != null) helper(root.right, cur, sum, item, res);
		item.remove(item.size() - 1);
	}
}
