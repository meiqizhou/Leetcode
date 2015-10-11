package ReverseWordsinaStringII;

import java.util.Stack;

public class Solution {
    public void reverseWords(char[] s) {
    	int i = 0, j = s.length - 1;
    	while(i <= j){
    		exch(s, i, j);
    		i++;
    		j--;
    	}
    	int slow = 0, fast = 0;
    	while(fast < s.length && slow < s.length){
    		while(fast < s.length && s[fast] != ' ') fast++;
    		int temp = fast;
    		fast--;
    		while(slow <= fast){
    			exch(s, slow, fast);
    			slow++;
    			fast--;
    		}
    		slow = temp + 1;
    		fast = temp + 1;
    	}
    	
    }
    public void exch(char[] s, int i, int j){
    	char c = s[i];
    	s[i] = s[j];
    	s[j] = c;
    }
}