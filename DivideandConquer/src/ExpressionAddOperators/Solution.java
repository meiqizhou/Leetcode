package ExpressionAddOperators;

import java.util.ArrayList;
import java.util.List;

public class Solution {
	private String str = "";
    public List<String> addOperators(String num, int target) {
        List<String> list = new ArrayList<String>();
        helper(toList(num), 0, "", list);
        List<String> res = new ArrayList<String>();
        for(String string: list) {
        	int temp = calculate(string);
        	if(string.equals("1*2*3*4*5-6-78+9")) {
        		System.out.println(string);
        	}
        	str = "";
        	if(temp == target) res.add(string);
        }
        return res;
    }
    
    private List<String> toList(String num) {
		// TODO Auto-generated method stub
		List<String> list = new ArrayList<String>();
		for(int i = 0; i < num.length(); i++) {
			list.add(num.substring(i, i + 1));
		}
		return list;
	}

	private void helper(List<String> num, int i, String string, List<String> list) {
		// TODO Auto-generated method stub
	}
    
	public int calculate(String s) {
    	int start = 0;
    	for(int i = 0; i < s.length(); i++) {
    		char ch = s.charAt(i);
    		if(ch == '*' || ch == '/') {
    			int[] arr = expand(s, i);
    			String temp = calculateVal(s, arr[0], arr[1]);
    			str += s.substring(start, arr[0]) + temp;
    			i = arr[1];
    			start = arr[1] + 1;
    		}
    		else if(i == s.length() - 1) str += s.substring(start, s.length());
    	}
    	return str.length() == 0 ? calculateWithoutSpace(s) : calculateWithoutSpace(str);
    }

	private int[] expand(String s, int i) {
		// TODO Auto-generated method stub
		int j = i;
		while(i > -1 && s.charAt(i) != '+' && s.charAt(i) != '-') i--;
		while(j < s.length() && s.charAt(j) != '+' && s.charAt(j) != '-') j++;
		return new int[]{i + 1, j - 1};
	}
	
	public String calculateVal(String s, int lo, int hi) {
		int k = lo, flag = 0;
		String s1 = "", s2 = "";
		boolean mul = true;
		while(k <= hi) {
			char ch = s.charAt(k);
			if(Character.isDigit(ch) && flag == 0) s1 += ch;
			else if(flag == 0 && ch == '/') {
				mul = false;
				flag = 1;
			}
			else if(flag == 0 && ch == '*') flag = 1;
			else if(Character.isDigit(ch) && flag == 1) s2 += ch;
			else if(flag == 1 && (k == hi || ch == '*' || ch == '/')) {
				if(mul) {
					s1 = Integer.valueOf(s1).intValue() * Integer.valueOf(s2).intValue() + "";
					s2 = "";
					mul = true;
				}
				else {
					s1 = Integer.valueOf(s1).intValue() / Integer.valueOf(s2).intValue() + "";
					s2 = "";
					mul = true;
				}
			}
			k++;
		}
		if(mul) return s2.length() != 0 ? Integer.valueOf(s1).intValue() * Integer.valueOf(s2).intValue() + "" : s1;
		else return s2.length() != 0 ? Integer.valueOf(s1).intValue() / Integer.valueOf(s2).intValue() + "" : s1;
	}
	
	public int calculateWithoutSpace(String s) {
    	int sum = 0;
    	String temp = "";
    	s = s.trim();
    	for(int k = 0; k < s.length(); k++) {
    		if(s.charAt(k) == ' ') continue;
    		else if(Character.isDigit(s.charAt(k))) {
    			temp += s.charAt(k);
    			if(k == s.length() - 1) sum += Integer.valueOf(temp).intValue();
    		}
    		else if(temp.length() == 0 && (s.charAt(k) == '-' || s.charAt(k) == '+')) {
    			temp += s.charAt(k);
    		}
    		else if(temp.length() != 0 && (s.charAt(k) == '-' || s.charAt(k) == '+')) {
    			if(temp == "") continue;
    			else {
    				sum += Integer.valueOf(temp).intValue();
    				temp = "" + s.charAt(k);
    			}
    		}
    	}
    	return sum;
    }
}
