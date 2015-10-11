package ValidPalindrome;

public class Solution {
    public boolean isPalindrome(String s) {
    	StringBuilder sb = new StringBuilder();
    	for(int i = 0; i < s.length(); i++) {
    		if(Character.isAlphabetic(s.charAt(i)) || Character.isDigit(s.charAt(i))) sb.append(s.substring(i, i + 1).toLowerCase());
    	}
    	s = sb.toString();
    	int i = 0, j = s.length() - 1;
    	while(i < j) {
    		if(s.charAt(i) != s.charAt(j)) return false;
    		i++;
    		j--;
    	}
    	return true;
    }
}
