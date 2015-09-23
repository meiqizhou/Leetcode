package PalindromePermutationII;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
/**
 * Given a string s, return all the palindromic permutations (without duplicates) of it. Return an empty list if no palindromic permutation could be form.
 * @author lby
 *
 */
public class Solution {
	private char single = 'a';
    public List<String> generatePalindromes(String s) {
    	List<String> res = new ArrayList<String>();
    	Map<Character, Integer> map = new HashMap<Character, Integer>();
    	for(int i = 0; i < s.length(); i++) {
    		if(!map.containsKey(s.charAt(i))) map.put(s.charAt(i), 1);
    		else map.put(s.charAt(i), map.get(s.charAt(i)) + 1);
    	}
    	if(!isPalindromes(map)) return res;
    	else {
    		if(s.length() % 2 == 0) {
    			char[] arr = new char[s.length() / 2];
    			boolean[] visited = new boolean[arr.length];
    			int i = 0;
    			for(char c: map.keySet()) {
    				int j = 0;
    				while(j < map.get(c) / 2) {
    					arr[i++] = c;
    					j++;
    				}
    			}
    			helper(arr, visited, "", res, 0);
    		}
    		else {
    			char[] arr = new char[s.length() / 2];
    			boolean[] visited = new boolean[arr.length];
    			int i = 0;
    			for(char c: map.keySet()) {
    				int j = 0, num = map.get(c);
    				if(num % 2 == 0) {
        				while(j < map.get(c) / 2) {
        					arr[i++] = c;
        					j++;
        				}
    				}
    				else if(num == 1) continue;
    				else {
    					while(j < (num - 1) / 2) {
    						arr[i++] = c;
    						j++;
    					}
    				}
    			}
    			helper(arr, visited, "", res, 1);
    		}
    		return res;
    	}
    }
    
    private void helper(char[] arr, boolean[] visited, String s, List<String> res, int even) {
		// TODO Auto-generated method stub
    	if(s.length() == arr.length && even == 0) {
    		StringBuilder sb = new StringBuilder(s);
    		String temp = s + sb.reverse().toString();
    		if(!res.contains(temp)) res.add(temp);
    		return;
    	}
    	else if(s.length() == arr.length && even == 1) {
    		StringBuilder sb = new StringBuilder(s);
    		res.add(s + single + sb.reverse().toString());
    		return;
    	}
    	for(int i = 0; i < arr.length; i++) {
    		if(!visited[i]) {
    			s += arr[i];
        		visited[i] = true;
        		helper(arr, visited, s, res, even);
        		s = s.substring(0, s.length() - 1);
        		visited[i] = false;
    		}
    	}
	}

	private boolean isPalindromes(Map<Character, Integer> map) {
    	int count = 0;
    	for(Character c: map.keySet()) {
    		if(map.get(c) % 2 == 1) {
    			count++;
    			single = c;
    		}
    	}
    	return count <= 1;
    }
}

