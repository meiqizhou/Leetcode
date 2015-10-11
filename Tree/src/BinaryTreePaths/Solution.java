package BinaryTreePaths;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public List<String> binaryTreePaths(TreeNode root) {
        List<String> res = new ArrayList<String>();
        List<String> list = new ArrayList<String>();
        helper(root, list, res);
        return res;
    }
    
    private void helper(TreeNode root, List<String> list, List<String> res) {
        if(root == null) return;
        list.add(root.val + "");
        if(root.left == null && root.right == null) {
            String str = getString(list);
            res.add(str);
        }
        helper(root.left, list, res);
        helper(root.right, list, res);
        list.remove(list.size() - 1);
    }
    
    private String getString(List<String> list) {
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < list.size() - 1; i++) {
            sb.append(list.get(i));
            sb.append("->");
        }
        sb.append(list.get(list.size() - 1));
        return sb.toString();
    }
}