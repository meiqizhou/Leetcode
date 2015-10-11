package BinarySearchTreeIterator;

import java.util.ArrayList;
import java.util.List;

public class BSTIterator {
    private List<TreeNode> list;
    public BSTIterator(TreeNode root) {
        list = new ArrayList<TreeNode>();
        TreeNode p = root;
        while(p != null) {
            list.add(p);
            p = p.left;
        }
    }

    /** @return whether we have a next smallest number */
    public boolean hasNext() {
        return list.size() != 0;
    }

    /** @return the next smallest number */
    public int next() {
        TreeNode p = list.remove(list.size() - 1);
        TreeNode q = p.right;
        while(q != null){
            list.add(q);
            q = q.left;
        }
        return p.val;
    }
}
