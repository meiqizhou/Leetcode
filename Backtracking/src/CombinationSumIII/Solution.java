package CombinationSumIII;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {
    public List<List<Integer>> combinationSum3(int k, int n) {
    	int[] candidates = {1, 2, 3, 4, 5, 6, 7, 8, 9};
    	return combinationSum(candidates, k, n);
    }

	private List<List<Integer>> combinationSum(int[] candidates, int k, int target) {
		List<List<Integer>> res = new ArrayList<List<Integer>>();
		if(candidates.length == 0 || candidates == null || k == 0) return res;
		helper(candidates, 0, target, k, new ArrayList<Integer>(), res);
		return res;
	}

	private void helper(int[] candidates, int start, int target, int count, List<Integer> list, List<List<Integer>> res) {
		// TODO Auto-generated method stub
		if(target < 0) return;
		if(count < 0) return;
		if(target == 0 && count == 0) {
			if(!res.contains(list)) 
			res.add(new ArrayList<Integer>(list));
			return;
		}
		for(int i = start; i < candidates.length; i++) {
			list.add(candidates[i]);
			helper(Arrays.copyOfRange(candidates, 1, candidates.length), i, target - candidates[i], count - 1, list, res);
			list.remove(list.size() - 1);
		}
	}
}
