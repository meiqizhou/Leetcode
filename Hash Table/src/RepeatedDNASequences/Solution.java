package RepeatedDNASequences;

import java.util.ArrayList;
import java.util.Deque;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class Solution {
    public List<String> findRepeatedDnaSequences(String s) {
    	List<String> res = new ArrayList<String>();
    	if(s.length() < 11) return res;
    	Deque<Character> deque = new LinkedList<Character>();
    	Set<String> set = new HashSet<String>();
    	String first = "";
    	for(int i = 0; i <= 9; i++) {
    		deque.add(s.charAt(i));
    		first += s.charAt(i) + ", ";
    	}
    	set.add(first.substring(0, first.length() - 2));
    	for(int i = 10; i < s.length(); i++) {
    		deque.removeFirst();
    		deque.addLast(s.charAt(i));
    		String temp = deque.toString().substring(1, deque.toString().length() - 1);
    		if(set.contains(temp) && !res.contains(temp)) res.add(getString(temp));
    		else if(!set.contains(temp)) set.add(temp);
    	}
		return res;
    }

	private String getString(String s) {
		// TODO Auto-generated method stub
		String res = "";
		for(int i = 0; i < s.length(); i++) {
			if(s.charAt(i) == 'A' || s.charAt(i) == 'C' || s.charAt(i) == 'G' || s.charAt(i) == 'T') res += s.charAt(i);
		}
		return res;
	}
}
