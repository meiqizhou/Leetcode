package CourseScheduleII;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Solution {
	private boolean DAG = false;
    public int[] findOrder(int numCourses, int[][] prerequisites) {
    	List<Integer> resList = new ArrayList<Integer>();
    	Map<Integer, Set<Integer>> graph = buildGraph(numCourses, prerequisites);
    	Map<Integer, Integer> status = new HashMap<Integer, Integer>();
    	List<Integer> graphNode = new ArrayList<Integer>();
    	for(int i = 0; i < numCourses; i++) {
    		status.put(i, 0);
    		graphNode.add(i);
    	}
    	while(hasUnvisited(status, graphNode)) {
    		for(int node: graphNode) {
    			search(status, graphNode, graph, resList, node);
    		}
    	}
    	if(DAG) return new int[0];
    	int[] res = new int[resList.size()];
    	for(int i = 0; i < res.length; i++) res[i] = resList.get(i);
    	return res;
    }

	private void search(Map<Integer, Integer> status, List<Integer> graphNode, Map<Integer, Set<Integer>> graph, List<Integer> res, int node) {
		// TODO Auto-generated method stub
		if(status.get(node) == 1) {
			DAG = true;
			return;
		}
		if(status.get(node) == 2) return;
		status.put(node, 1);
		for(int temp: graph.get(node)) {
			search(status, graphNode, graph, res, temp);
		}
		status.put(node, 2);
		res.add(0, node);
	}

	private boolean hasUnvisited(Map<Integer, Integer> status, List<Integer> graphNode) {
		for(int node: graphNode) {
			if(status.get(node) == 0) return true;
		}
		return false;
	}

	private Map<Integer, Set<Integer>> buildGraph(int numCourses, int[][] prerequisites) {
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
