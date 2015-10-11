package DifferentWaystoAddParentheses;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Solution {
    public List<Integer> diffWaysToCompute(String input) {
    	List<Integer> res = new ArrayList<Integer>();
    	if(input.length() == 0) return res;
    	if(!input.contains("+") && !input.contains("-") && !input.contains("*")) {
    		res.add(Integer.parseInt(input));
    		return res;
    	}
    	for(int i = 0; i < input.length(); i++) {
    		if(input.charAt(i) == '+' || input.charAt(i) == '-' || input.charAt(i) == '*') {
    			List<Integer> left = diffWaysToCompute(input.substring(0, i));
    			List<Integer> right = diffWaysToCompute(input.substring(i + 1, input.length()));
    			for(int j = 0; j < left.size(); j++) {
    				for(int k = 0; k < right.size(); k++) {
    					if(input.charAt(i) == '+') res.add(left.get(j) + right.get(k));
    					else if(input.charAt(i) == '-') res.add(left.get(j) - right.get(k));
    					else res.add(left.get(j) * right.get(k));
    				}
    			}
    		}
    	}
    	Collections.sort(res);
		return res;
    }
}
