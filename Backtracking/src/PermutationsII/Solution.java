package PermutationsII;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class Solution {
	public List<List<Integer>> permuteUnique(int[] num) {
		List<List<Integer>> res = new ArrayList<List<Integer>>();
		List<Integer> list = new ArrayList<Integer>();
		if(num.length == 0) return res;
		Arrays.sort(num);
		list.add(num[0]);
		res.add(list);
		for(int i = 1; i < num.length; i++) res = helper(res, num, i);
		return res;
	}

	private List<List<Integer>> helper(List<List<Integer>> res, int[] num, int j) {
		// TODO Auto-generated method stub
		List<List<Integer>> output = new ArrayList<List<Integer>>();
		for(int i = 0; i < res.size(); i++) {
			List<Integer> list = res.get(i);
			List<List<Integer>> tempRes = addAllIndex(list, num[j]);
			output.addAll(tempRes);
		}
		return removeDuplicate(output);
	}

	private List<List<Integer>> removeDuplicate(List<List<Integer>> output) {
		// TODO Auto-generated method stub
		List<List<Integer>> res = new ArrayList<List<Integer>>();
		HashSet<List<Integer>> set = new HashSet<List<Integer>>();
		for(int i = 0; i < output.size(); i++) {
			if(set.contains(output.get(i))) continue;
			else {
				set.add(output.get(i));
				res.add(output.get(i));
			}
		}
		return res;
	}

	private List<List<Integer>> addAllIndex(List<Integer> list, int a) {
		// TODO Auto-generated method stub
		List<List<Integer>> res = new ArrayList<List<Integer>>();
		for(int i = 0; i <= list.size(); i++) {
			List<Integer> temp = new ArrayList<Integer>(list);
			temp.add(i, a);
			if(!res.contains(temp)) res.add(temp);
		}
		return res;
	}
}
