package FractiontoRecurringDecimal;

import java.util.HashMap;

public class Solution {
    public String fractionToDecimal(int numerator, int denominator) {
    	StringBuilder sb = new StringBuilder();
    	if((numerator > 0 && denominator < 0) || (numerator < 0 && denominator > 0)) sb.append("-");
    	long a = numerator, b = denominator;
    	a = Math.abs(a);
    	b = Math.abs(b);
    	HashMap<Long, Integer> map = new HashMap<Long, Integer>();
    	long res = a / b;
    	sb.append(res);
    	a = a % b * 10;
    	if(a != 0) sb.append(".");
    	while(a != 0){
    		res = a / b;
    		if(map.containsKey(a)){
    			sb.insert(map.get(a), "(");
    			sb.append(")");
    			break;
    		}
    		map.put(a, sb.length());
    		sb.append(res);
    		a = a % b * 10;
    	}
    	return sb.toString();
    }
}