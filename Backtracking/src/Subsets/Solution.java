package Subsets;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class Solution {
	public List<List<Integer>> subsets(int[] S) {
		List<List<Integer>> res = new ArrayList<List<Integer>>();
		res.add(new ArrayList<Integer>());
		Arrays.sort(S);
		for(int i = 0; i < S.length; i++) {
			res = getNextSubsets(res, S[i]);
		}
		return res;
	}
	
	private List<List<Integer>> getNextSubsets(List<List<Integer>> res, int next) {
		List<List<Integer>> list = new ArrayList<List<Integer>>();
		for(int i = 0; i < res.size(); i++) list.add(new ArrayList<Integer>(res.get(i)));
		for(int i = 0; i < res.size(); i++) res.get(i).add(next);
		list.addAll(res);
		return list;
	}
}

