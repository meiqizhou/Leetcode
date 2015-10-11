package AlienDictionary;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Solution {
	String res = "";
	boolean DAG = false;
    public String alienOrder(String[] words) {
    	Map<Character, Integer> status = new HashMap<Character, Integer>();
    	List<Character> graphNode = new ArrayList<Character>();
    	for(String str: words) {
    		for(int i = 0; i < str.length(); i++) {
    			status.put(str.charAt(i), 0);
    			if(!graphNode.contains(str.charAt(i))) graphNode.add(str.charAt(i));
    		}
    	}
    	Map<Character, Set<Character>> graph = buildGraph(words, graphNode);
    	while(hasUnvisited(status, graphNode)) {
    		for(char node: graphNode) search(status, graph, graphNode, node);
    	}
    	return DAG ? "" : res;
    }

	private void search(Map<Character, Integer> status, Map<Character, Set<Character>> graph, List<Character> graphNode, char node) {
		// TODO Auto-generated method stub
		if(status.get(node) == 1) {
			DAG = true;
			return;
		}
		if(status.get(node) == 2) return;
		status.put(node, 1);
		for(char next: graph.get(node)) {
			search(status, graph, graphNode, next);
		}
		status.put(node, 2);
		res = node + res;
	}

	private boolean hasUnvisited(Map<Character, Integer> status, List<Character> graphNode) {
		// TODO Auto-generated method stub
		for(int i = 0; i < graphNode.size(); i++) {
			if(status.get(graphNode.get(i)) == 0) return true;
		}
		return false;
	}

	private Map<Character, Set<Character>> buildGraph(String[] words, List<Character> graphNode) {
		Map<Character, Set<Character>> graph = new HashMap<Character, Set<Character>>();
		for(char c: graphNode) graph.put(c, new HashSet<Character>());
		for(int i = 0; i < words.length - 1; i++) {
			String s1 = words[i], s2 = words[i + 1];
			int j = 0;
			while(j < Math.min(s1.length(), s2.length()) && s1.charAt(j) == s2.charAt(j)) j++;
			if(j < Math.min(s1.length(), s2.length()) && s1.charAt(j) != s2.charAt(j)) graph.get(s1.charAt(j)).add(s2.charAt(j));
		}
		return graph;
	}
}
