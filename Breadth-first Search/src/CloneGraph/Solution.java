package CloneGraph;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;



public class Solution {

    public UndirectedGraphNode cloneGraph(UndirectedGraphNode node) {
    	if(node == null) return null;
    	return bfs(node);
    }

	private UndirectedGraphNode bfs(UndirectedGraphNode node) {
		// TODO Auto-generated method stub
		UndirectedGraphNode clone = new UndirectedGraphNode(node.label);
		Queue<UndirectedGraphNode> queue = new LinkedList<UndirectedGraphNode>();
		queue.add(node);
		while(!queue.isEmpty()) {
			List<UndirectedGraphNode> list = new ArrayList<UndirectedGraphNode>();
			while(!queue.isEmpty()) {
				list.add(queue.poll());
			}
		}
		return clone;
	}
}
