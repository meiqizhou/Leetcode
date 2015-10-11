package GraphValidTree;

import java.util.HashMap;
import java.util.Map;


public class Solution {
    public boolean validTree(int n, int[][] edges) {
    	int count = 0;
    	Map<Integer, Integer> map = new HashMap<Integer, Integer>();
    	for(int i = 0; i < edges.length; i++) {
    		if(!map.containsKey(edges[i][0]) && !map.containsKey(edges[i][1])) {
    			map.put(edges[i][0], count++);
    			map.put(edges[i][1], count);
    		}
    		else if(!map.containsKey(edges[i][0]) && map.containsKey(edges[i][1])) {
    			map.put(edges[i][0], map.get(edges[i][1]));
    		}
    		else if(map.containsKey(edges[i][0]) && !map.containsKey(edges[i][1])) {
    			map.put(edges[i][1], map.get(edges[i][0]));
    		}
    		else return false;
    	}
    	return count <= 1 && containsAll(n, map);
    }
    
    private boolean containsAll(int n, Map<Integer, Integer> map) {
    	for(int i = 0; i < n; i++) {
    		if(!map.containsKey(i)) return false;
    	}
    	return true;
    }
}
