package Permutations;

import java.util.ArrayList;
import java.util.List;

public class Solution {
	public List<List<Integer>> permute(int[] num) {
		List<List<Integer>> res = new ArrayList<List<Integer>>();
		List<Integer> list = new ArrayList<Integer>();
		boolean[] marked = new boolean[num.length];
		helper(num, res, list, marked);
		return res;
    }

	private void helper(int[] num, List<List<Integer>> res, List<Integer> list, boolean[] marked) {
		if(list.size() == num.length) {
			res.add(new ArrayList<Integer>(list));
			return;
		}
		for(int i = 0; i < num.length; i++) {
			if(!marked[i]) {
				list.add(num[i]);
				marked[i] = true;
				helper(num, res, list, marked);
				list.remove(list.size() - 1);
				marked[i] = false;
			}
		}
	}
}
