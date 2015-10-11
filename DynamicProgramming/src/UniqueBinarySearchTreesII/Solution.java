package UniqueBinarySearchTreesII;

import java.util.ArrayList;
import java.util.List;

public class Solution {
	 public List<TreeNode> generateTrees(int n) {
		 return generateTrees(1, n);
	 }

	private List<TreeNode> generateTrees(int L, int R) {
		List<TreeNode> res = new ArrayList<TreeNode>();
		if(L > R) {
			res.add(null);
			return res;
		}
		for(int i = L; i <= R; i++) {
			List<TreeNode> left = generateTrees(L, i - 1);
			List<TreeNode> right = generateTrees(i + 1, R);
			for(int j = 0; j < left.size(); j++) {
				for(int k = 0; k < right.size(); k++) {
					TreeNode t = new TreeNode(i);
					t.left = left.get(j);
					t.right = right.get(k);
					res.add(t);
				}
			}
		}
		return res;
	}
}
