package ReverseWordsinaString;

public class Solution {
    public String reverseWords(String s) {
    	String[] tokens = s.split(" ");
    	StringBuilder sb = new StringBuilder();
    	for(int i = tokens.length - 1; i > -1; i--) {
    		if(tokens[i].length() != 0) sb.append(tokens[i] + " ");
    	}
    	return sb.toString().trim();
    }
}