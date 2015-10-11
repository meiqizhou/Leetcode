package SubsetsII;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {
    public List<List<Integer>> subsetsWithDup(int[] num) {
    	List<List<Integer>> res = new ArrayList<List<Integer>>();
    	res.add(new ArrayList<Integer>());
    	if(num == null || num.length == 0) return res;
    	Arrays.sort(num);
    	for(int i = 0; i < num.length; i++){
    		int size = res.size();
    		for(int j = 0; j < size; j++){
    			List<Integer> elem = new ArrayList<Integer>(res.get(j));
    			elem.add(num[i]);
    			if(!contains(res, elem)) res.add(elem);
    		}
    	}
    	return res;
    }

	private boolean contains(List<List<Integer>> res, List<Integer> elem) {
		boolean contains = false;
		for(int i = 0; i < res.size(); i++){
			List<Integer> temp = res.get(i);
			if(temp.equals(elem)){
				contains = true;
				break;
			}
		}
		return contains;
	}
}