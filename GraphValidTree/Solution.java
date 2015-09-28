package GraphValidTree;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Solution {
    public boolean validTree(int n, int[][] edges) {
    	List<int[]> list = new ArrayList<int[]>();
    	for(int i = 0; i < edges.length; i++) {
    		list.add(edges[i]);
    	}
    	return validTree(n, list);
    }
    
    private boolean validTree(int n, List<int[]> edges) {
    	int count = 0, j = edges.size() - 1;
    	if(n == 1) return true;
    	if(edges.size() == 0) return n == 1;
    	Map<Integer, Integer> map = new HashMap<Integer, Integer>();
    	int i = 0, flag = 0;
    	while(i < edges.size()) {
    		if(!map.containsKey(edges.get(i)[0]) && !map.containsKey(edges.get(i)[1]) && flag == 0) {
    			map.put(edges.get(i)[0], count++);
    			map.put(edges.get(i)[1], count);
    			flag = 1;
    			i++;
    		}
    		else if(!map.containsKey(edges.get(i)[0]) && !map.containsKey(edges.get(i)[1]) && flag == 1 && i != j) {
    			exch(edges, i, j--);
    		}
    		else if(!map.containsKey(edges.get(i)[0]) && map.containsKey(edges.get(i)[1])) {
    			map.put(edges.get(i)[0], map.get(edges.get(i)[1]));
    			i++;
    		}
    		else if(map.containsKey(edges.get(i)[0]) && !map.containsKey(edges.get(i)[1])) {
    			map.put(edges.get(i)[1], map.get(edges.get(i)[0]));
    			i++;
    		}
    		else return false;
    	}
    	return count == 1 && containsAll(n, map);
    }
    
    private void exch(List<int[]> edges, int i, int j) {
		// TODO Auto-generated method stub
    	int[] temp = edges.get(i);
    	edges.set(i, edges.get(j));
    	edges.set(j, temp);
	}

	private boolean containsAll(int n, Map<Integer, Integer> map) {
    	for(int i = 0; i < n; i++) {
    		if(!map.containsKey(i)) return false;
    	}
    	return true;
    }
}