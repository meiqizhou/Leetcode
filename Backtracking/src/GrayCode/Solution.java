package GrayCode;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public List<Integer> grayCode(int n) {
    	List<Integer> list = new ArrayList<Integer>();
    	if(n == 0) {
    		list.add(0);
    		return list;
    	}
    	List<Integer> preList = grayCode(n - 1);
    	list.addAll(preList);
    	for(int i = preList.size() - 1; i > -1; i--) {
    		list.add(preList.get(i) + (int) Math.pow(2, n - 1));
    	}
    	return list;
    }
}
