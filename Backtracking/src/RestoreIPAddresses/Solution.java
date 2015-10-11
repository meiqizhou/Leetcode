package RestoreIPAddresses;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public List<String> restoreIpAddresses(String s) {
    	List<String> res = new ArrayList<String>();
    	if(s.length() < 4 || s.length() > 12) return res;
    	helper(s, "", res, 0);
    	return res;
    }
    
    public void helper(String s, String tmp, List<String> res, int count){
    	if(count == 3 && isValid(s)) {
    		res.add(tmp + s);
    		return;
    	}
    	for(int i = 1; i < 4 && i < s.length(); i++) {
    		String str = s.substring(0, i);
    		if(isValid(str)) helper(s.substring(i), tmp + str + ".", res, count + 1); 
    	}
    }
    
    public boolean isValid(String s){
    	if(s.charAt(0) == '0') return s.equals("0");  
    	else return Integer.parseInt(s) > 0 && Integer.parseInt(s) <= 255;
    }
}

