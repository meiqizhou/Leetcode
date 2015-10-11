package RotateArray;


public class Solution {
	public void rotate(int[] nums, int k) {
		int n = nums.length;
		k = k % n;
		reverse(nums, 0, n - 1);
		reverse(nums, 0, k - 1);
		reverse(nums, k, n - 1);
	}
	public void reverse(int[] nums, int lo, int hi){
		int i = lo, j = hi;
		while(i <= j){
			exch(nums, i, j);
			i++;
			j--;
		}
	}
	private void exch(int[] nums, int i, int j) {
		// TODO Auto-generated method stub
		int temp = nums[i];
		nums[i] = nums[j];
		nums[j] = temp;
	}
}
