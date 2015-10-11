package BinaryTreeRightSideView;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

import BinaryTreeLevelOrderTraversalII.TreeNode;

public class Solution {
    public List<Integer> rightSideView(TreeNode root) {
    	List<List<Integer>> res = levelOrder(root);
    	List<Integer> list = new ArrayList<Integer>();
    	for(int i = 0; i < res.size(); i++){
    		list.add(res.get(i).get(res.get(i).size() - 1));
    	}
		return list;   	
    }
    
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> res = new ArrayList<List<Integer>>();
        if(root == null) return res;
        Queue<TreeNode> queue = new LinkedList<TreeNode>();
        queue.add(root);
        while(!queue.isEmpty()){
            List<TreeNode> tempNode = new ArrayList<TreeNode>();
            List<Integer> tempValue = new ArrayList<Integer>();
            while(!queue.isEmpty()){
                TreeNode node = queue.remove();
                tempNode.add(node);
                tempValue.add(node.val);
            }
            res.add(tempValue);
            for(int i = 0; i < tempNode.size(); i++){
            	TreeNode node = tempNode.get(i);
                if(node.left != null) queue.add(node.left);
                if(node.right != null) queue.add(node.right);
            }
        }
        return res;
  }
}
