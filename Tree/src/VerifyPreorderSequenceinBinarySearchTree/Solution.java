package VerifyPreorderSequenceinBinarySearchTree;

public class Solution {
    public boolean verifyPreorder(int[] preorder) {
    	return verifyPreorder(preorder, 0, preorder.length - 1);
    }

	private boolean verifyPreorder(int[] preorder, int start, int end) {
		// TODO Auto-generated method stub
		if(start >= end) return true;
		int rootVal = preorder[start], i = start + 1;
		while(i <= end && preorder[i] < rootVal){
			i++;
		} 
		boolean b = i == end + 1 ? true : AllLarger(preorder, i, end, rootVal);
		return b && verifyPreorder(preorder, start + 1, i - 1) && verifyPreorder(preorder, i, end);
	}

	private boolean AllLarger(int[] preorder, int start, int end, int target) {
		// TODO Auto-generated method stub
		for(int i = start; i <= end; i++) {
			if(preorder[i] <= target) return false;
		}
		return true;
	}
}
