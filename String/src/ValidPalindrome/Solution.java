package ValidPalindrome;

public class Solution {
    public boolean isPalindrome(String s) {
    	s = s.toLowerCase();
    	int i = 0, j = s.length() - 1;
    	while(i <= j){
    		while(i < s.length() && !Character.isAlphabetic(s.charAt(i)) && !Character.isDigit(s.charAt(i))) i++;
    		while(j > -1 && !Character.isAlphabetic(s.charAt(j)) && !Character.isDigit(s.charAt(j))) j--;
    		if(i == s.length() || j == -1) return true;
    		if(s.charAt(i) == s.charAt(j)){
    			i++;
    			j--;
    		}
    		else return false;
    	}
    	return true;
    }
}
