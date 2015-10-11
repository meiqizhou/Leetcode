package PopulatingNextRightPointersinEachNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Solution {
    public void connect(TreeLinkNode root) {
    	if(root == null) return;
    	Queue<TreeLinkNode> queue = new LinkedList<TreeLinkNode>();
    	queue.add(root);
    	while(!queue.isEmpty()) {
    		List<TreeLinkNode> list = new ArrayList<TreeLinkNode>();
    		while(!queue.isEmpty()) {
    			list.add(queue.poll());
    		}
    		for(int i = 0; i < list.size() - 1; i++) {
    			list.get(i).next = list.get(i + 1);
    		}
    		list.get(list.size() - 1).next = null;
    		for(int i = 0; i < list.size(); i++) {
    			TreeLinkNode t = list.get(i);
    			if(t.left != null) queue.add(t.left);
    			if(t.right != null) queue.add(t.right);
    		}
    	}
    }
}
