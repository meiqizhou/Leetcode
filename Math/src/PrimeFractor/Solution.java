package PrimeFractor;

import java.util.ArrayList;
import java.util.List;

public class Solution {
	public List<Integer> getPrimeFactor(int n) {
		List<Integer> res = new ArrayList<Integer>();
		if(n <= 1) return res;
		int i = 2;
        while(i <= n) {
        	if(n % i == 0) {
        		res.add(i);
        		n = n / i;
        	}
        	else i++;
        }
        return res;
	}
}
