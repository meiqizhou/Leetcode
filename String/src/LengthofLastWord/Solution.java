package LengthofLastWord;

public class Solution {
    public int lengthOfLastWord(String s) {
    	int flag = 0, i = s.length() - 1, count = 0;
    	while(i > -1){
    		if(s.charAt(i) == ' ' && flag == 0){
    			i--;
    		}
    		else if(s.charAt(i) != ' '){
    			count++;
    			i--;
    			flag = 1;
    		}
    		else break;
    	}
    	return count;
    }
}
