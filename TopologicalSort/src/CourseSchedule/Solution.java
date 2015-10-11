package CourseSchedule;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Solution {
	private boolean canFinish = true;
    public boolean canFinish(int numCourses, int[][] prerequisites) {
    	Map<Integer, Set<Integer>> graph = buildMap(numCourses, prerequisites);
    	List<Integer> graphNode= new ArrayList<Integer>();
    	for(int i = 0; i < numCourses; i++) graphNode.add(i);
    	Map<Integer, Integer> status = new HashMap<Integer, Integer>();
    	for(int i = 0; i < numCourses; i++) status.put(i, 0);
    	while(hasUnvisited(status, graphNode)) {
    		for(int node: graphNode) {
    			search(status, graphNode, graph, node);
    		}
    	}
		return canFinish;
    }

	private void search(Map<Integer, Integer> status, List<Integer> graphNode, Map<Integer, Set<Integer>> graph, int node) {
		// TODO Auto-generated method stub
		if(status.get(node) == 1) {
			canFinish = false;
			return;
		}
		if(status.get(node) == 2) return;
		status.put(node, 1);
		for(int temp: graph.get(node)) {
			search(status, graphNode, graph, temp);
		}
		status.put(node, 2);
	}

	private boolean hasUnvisited(Map<Integer, Integer> status, List<Integer> graphNode) {
		// TODO Auto-generated method stub
		for(int i = 0; i < graphNode.size(); i++) {
			if(status.get(graphNode.get(i)) == 0) return true;
		}
		return false;
	}

	private Map<Integer, Set<Integer>> buildMap(int numCourses, int[][] prerequisites) {
		// TODO Auto-generated method stub
		Map<Integer, Set<Integer>> graph = new HashMap<Integer, Set<Integer>>();
		for(int i = 0; i < numCourses; i++) {
			graph.put(i, new HashSet<Integer>());
		}
		for(int i = 0; i < prerequisites.length; i++) {
			graph.get(prerequisites[i][1]).add(prerequisites[i][0]);
		}
		return graph;
	}
}
