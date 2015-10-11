package CombinationSumII;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {
	public List<List<Integer>> combinationSum2(int[] candidates, int target) {
		List<List<Integer>> res = new ArrayList<List<Integer>>();
		if(candidates.length == 0) return res;
		Arrays.sort(candidates);
		helper(candidates, 0, target, new ArrayList<Integer>(), res);
		return res;
    }

	private void helper(int[] candidates, int start, int target, List<Integer> list, List<List<Integer>> res) {
		// TODO Auto-generated method stub
		if(target < 0) return;
		if(target == 0) {
			if(!res.contains(list)) 
			res.add(new ArrayList<Integer>(list));
			return;
		}
		for(int i = start; i < candidates.length; i++) {
			list.add(candidates[i]);
			helper(Arrays.copyOfRange(candidates, 1, candidates.length), i, target - candidates[i], list, res);
			list.remove(list.size() - 1);
		}
	}
}
