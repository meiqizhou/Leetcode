package PascalsTriangle;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public List<List<Integer>> generate(int numRows) {
    	List<List<Integer>> res = new ArrayList<List<Integer>>();
    	if(numRows == 0) return res;
    	List<Integer> one = new ArrayList<Integer>();
    	one.add(1);
    	res.add(one);
    	if(numRows == 1) return res;
    	List<Integer> two = new ArrayList<Integer>();
    	two.add(1);
    	two.add(1);
    	res.add(two);
    	if(numRows == 2) return res;
    	for(int i = 2; i < numRows; i++){
    		List<Integer> list = new ArrayList<Integer>();
    		list.add(1);
    		List<Integer> pre = res.get(i - 1);
    		int j = 1;
    		while(j < pre.size()){
    			list.add(res.get(i - 1).get(j - 1) +res.get(i - 1).get(j));
    			j++;
    		}
    		list.add(1);
    		res.add(list);
    	}
    	return res;
    }
}
