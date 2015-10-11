package Combinations;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {
    public List<List<Integer>> combine(int n, int k) {
    	List<List<Integer>> res = new ArrayList<List<Integer>>();
    	List<Integer> list = new ArrayList<Integer>();
    	if(n == 0 || k == 0) return res;
    	int[] arr = new int[n];
    	for(int i = 0; i < n; i++) {
    		arr[i] = i + 1;
    	}
    	helper(arr, 0, k, list, res);
		return res;
    }

	private void helper(int[] arr, int start, int k, List<Integer> list, List<List<Integer>> res) {
		// TODO Auto-generated method stub
		if(k < 0) return;
		if(k == 0) {
			res.add(new ArrayList<Integer>(list));
			return;
		}
		for(int i = start; i < arr.length; i++) {
			list.add(arr[i]);
			helper(Arrays.copyOfRange(arr, 1, arr.length), i, k - 1, list, res);
			list.remove(list.size() - 1);
		}
	}
}
