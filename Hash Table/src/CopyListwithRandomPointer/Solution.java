package CopyListwithRandomPointer;

import java.util.HashMap;
import java.util.Map;

public class Solution {
    public RandomListNode copyRandomList(RandomListNode head) {
    	Map<RandomListNode, RandomListNode> map = new HashMap<RandomListNode, RandomListNode>();
    	return dfs(head, map);
    }

	private RandomListNode dfs(RandomListNode head, Map<RandomListNode, RandomListNode> map) {
		// TODO Auto-generated method stub
		if(head == null) return null;
		if(map.containsKey(head)) return map.get(head);
		RandomListNode copy = new RandomListNode(head.label);
		map.put(head, copy);
		copy.next = dfs(head.next, map);
		copy.random = dfs(head.random, map);
		return copy;
	}
}
