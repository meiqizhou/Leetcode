package CountCompleteTreeNodes;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Solution {
    public int countNodes(TreeNode root) {
    	if(root == null) return 0;
    	return bfs(root);
    }
    
	private int bfs(TreeNode root) {
		// TODO Auto-generated method stub
		int count = 1;
		Queue<TreeNode> queue = new LinkedList<TreeNode>();
		queue.add(root);
		while(!queue.isEmpty()) {
			List<TreeNode> list = new ArrayList<TreeNode>();
			while(!queue.isEmpty()) list.add(queue.poll());
			for(int i = 0; i < list.size(); i++) {
				TreeNode temp = list.get(i);
				if(temp.left != null && temp.right != null) {
					queue.add(temp.left);
					queue.add(temp.right);
					count += 2;
				}
				else if(temp.left != null && temp.right == null) {
					return ++count;
				}
				else return count;
			}
		}
		return count;
	}
}
