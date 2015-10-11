package RecoverBinarySearchTree;

import java.util.Comparator;

public class ListComparator implements Comparator<TreeNode>{

	@Override
	public int compare(TreeNode t1, TreeNode t2) {
		// TODO Auto-generated method stub
		if(t1.val < t2.val) return -1;
		else if(t1.val == t2.val) return 0;
		else return 1;
	}	
}
