package UniqueBinarySearchTreesII;

import java.util.ArrayList;
import java.util.List;

public class Solution {
	 public List<TreeNode> generateTrees(int n) {
		 return generateTrees(1, n);
	 }

	private List<TreeNode> generateTrees(int start, int end) {
		// TODO Auto-generated method stub
		List<TreeNode> list = new ArrayList<TreeNode>();
		if(start > end){
			list.add(null);
			return list;
		}
		for(int i = start; i <= end; i++){
			List<TreeNode> lefts = generateTrees(start, i - 1);
			List<TreeNode> rights = generateTrees(i + 1, end);
			for(int j = 0; j < lefts.size(); j++){
				TreeNode left = lefts.get(j);
				for(int k = 0; k < rights.size(); k++){
					TreeNode right = rights.get(k);
					TreeNode node = new TreeNode(i);
					node.left = left;
					node.right = right;
					list.add(node);
				}
			}
			
		}
		return list;
	}
}
