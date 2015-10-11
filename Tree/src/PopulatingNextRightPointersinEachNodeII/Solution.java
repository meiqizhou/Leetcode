package PopulatingNextRightPointersinEachNodeII;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;


public class Solution {
    public void connect(TreeLinkNode root) {
    	if(root == null) return;
    	Queue<TreeLinkNode> queue = new LinkedList<TreeLinkNode>();
    	queue.add(root);
    	while(!queue.isEmpty()){
    		List<TreeLinkNode> temps = new ArrayList<TreeLinkNode>();
    		while(!queue.isEmpty()){
    			TreeLinkNode temp = queue.remove();
    			temps.add(temp);
    		}
    		for(int i = 0; i < temps.size() - 1; i++){
    			temps.get(i).next = temps.get(i + 1);
    		}
    		temps.get(temps.size() - 1).next = null;
    		for(int i = 0; i < temps.size(); i++){
    			TreeLinkNode node = temps.get(i);
    			if(node.left != null) queue.add(node.left);
    			if(node.right != null) queue.add(node.right);
    		}
    	}
    }
}

