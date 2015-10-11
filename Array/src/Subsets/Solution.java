package Subsets;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class Solution {
	public List<List<Integer>> subsets(int[] S) {
		List<List<Integer>> res = new ArrayList<List<Integer>>();
		res.add(new ArrayList<Integer>());
		if(S == null || S.length == 0) return res;
		Arrays.sort(S);
		for(int i = 0; i < S.length; i++){
			int size = res.size();
			for(int j = 0; j < size; j++){
				List<Integer> elem = new ArrayList<Integer>(res.get(j));
				elem.add(S[i]);
				res.add(elem);
			}
		}
		return res;
	}
}

//public List<List<Integer>> subsets(int[] S) {
//if(S == null) return null;
//Arrays.sort(S);
//return helper(S, S.length-1); 
//}
//
//private List<List<Integer>> helper(int[] num, int index) {
//if(index == -1)
//{
//    List<List<Integer>> res = new ArrayList<List<Integer>>();
//    List<Integer> elem = new ArrayList<Integer>();
//    res.add(elem);
//    return res;
//}
//List<List<Integer>> res = helper(num,index-1);
//int size = res.size();
//for(int i = 0; i < size; i++)
//{
//    List<Integer> elem = new ArrayList<Integer>(res.get(i));
//    elem.add(num[index]);
//    res.add(elem);
//}
//return res;
//}
