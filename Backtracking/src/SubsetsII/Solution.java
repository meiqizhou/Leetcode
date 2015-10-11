package SubsetsII;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Solution {
    public List<List<Integer>> subsetsWithDup(int[] num) {
    	List<List<Integer>> res = new ArrayList<List<Integer>>();
		res.add(new ArrayList<Integer>());
		Arrays.sort(num);
		for(int i = 0; i < num.length; i++) {
			res = getNextSubsets(res, num[i]);
		}
		return res;
    }

	private List<List<Integer>> getNextSubsets(List<List<Integer>> res, int next) {
		List<List<Integer>> list = new ArrayList<List<Integer>>();
		for(int i = 0; i < res.size(); i++) list.add(new ArrayList<Integer>(res.get(i)));
		for(int i = 0; i < res.size(); i++) res.get(i).add(next);
		list.addAll(res);
		list = removeDup(list);
		return list;
	}

	private List<List<Integer>> removeDup(List<List<Integer>> list) {
		// TODO Auto-generated method stub
		List<List<Integer>> res = new ArrayList<List<Integer>>();
		Set<List<Integer>> set = new HashSet<List<Integer>>();
		for(int i = 0; i < list.size(); i++) {
			if(!set.contains(list.get(i))) {
				set.add(list.get(i));
				res.add(list.get(i));
			}
			else continue;
		}
		return res;
	}
}