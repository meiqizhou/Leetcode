package LRUCache;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class LRUCache {
	private Stack<Integer> stack;
	//{3 = {3, 1}}
	private Map<Integer, int[]> map;
	private int size;
    public LRUCache(int capacity) {
        stack = new Stack<Integer>();
        map = new HashMap<Integer, int[]>();
    }
    
    public int get(int key) {
        int val = map.get(key)[0];
        map.put(key, new int[]{val, map.get(key)[1] + 1});
//        if(map.get(key)[1] > map.get(map.get(stack.get(stack.size() - 1)))[0]) {
//        	stack.add(key);
//        }
		return val;
    }
    
    public void set(int key, int value) {
    	if(map.containsKey(key)) {
    		map.put(key, new int[]{value, map.get(key)[1] + 1});
    	}
    }
}