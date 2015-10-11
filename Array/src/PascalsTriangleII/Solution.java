
package PascalsTriangleII;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public List<Integer> getRow(int rowIndex) {
    	List<Integer> list = new ArrayList<Integer>();
    	list.add(1);
    	if(rowIndex == 0) return list;
    	list.add(1);
    	if(rowIndex == 1) return list;
    	
    	for(int i = 2; i <= rowIndex; i++){
    		int j = 0, sz = list.size();
    		while(j < sz - 1){
    			list.add(list.get(j) + list.get(j + 1));
    			j++;
    		}
    		list.add(1);
    		while(list.size() > i + 1) list.remove(1);
    	}
		return list;
    }
}
