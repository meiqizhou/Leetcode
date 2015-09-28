package BinaryTreePaths;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public List<String> binaryTreePaths(TreeNode root) {
        List<List<String>> result = new ArrayList<List<String>>();
        List<String> res = new ArrayList<String>();
        helper(root, new ArrayList<String>(), result);
        res = getPath(result);
        return res;
    }
    private void helper(TreeNode root, List<String> list, List<List<String>> res) {
        if(root == null) return;
        list.add(root.val + "");
        if(root.left == null && root.right == null) {
            res.add(new ArrayList<String>(list));
            return;
        }
        helper(root.left, list, res);
        helper(root.right, list, res);
        list.remove(list.size() - 1);
    }
    private List<String> getPath(List<List<String>> result) {
        List<String> res = new ArrayList<String>();
        for(int i = 0; i < result.size(); i++) {
            List<String> temp = result.get(i);
            StringBuilder sb = new StringBuilder();
            for(int j = 0; j < temp.size() - 1; j++) {
                sb.append(temp.get(j) + "->");
            }
            sb.append(temp.get(temp.size() - 1));
            res.add(sb.toString());
        }
        return res;
    }
}
