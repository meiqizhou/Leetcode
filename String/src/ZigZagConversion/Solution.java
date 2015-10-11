package ZigZagConversion;


public class Solution {
    public String convert(String s, int nRows) {
    	if(s == null || s.length()==0 || nRows <=0)  
            return "";  
        if(nRows == 1)  
            return s; 
    	StringBuilder sb = new StringBuilder();
    	int N = s.length();
    	int size = 2 * nRows - 2;
    	for(int j = 0; j < nRows; j++){
    		for(int i = j; i < N; i += size)
    		{
    			sb.append(s.charAt(i));
    			if(j != 0 && j != nRows - 1 && (i + size - 2 * j) < N){
    				sb.append(s.charAt(i + size - 2 * j));
    			}
    		}
    	}
    	return sb.toString();
    }
}
