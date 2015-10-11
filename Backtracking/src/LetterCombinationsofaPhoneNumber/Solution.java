package LetterCombinationsofaPhoneNumber;

import java.util.LinkedList;
import java.util.List;

public class Solution {
    public List<String> letterCombinations(String digits) {
    	LinkedList<String> list = new LinkedList<String>();
    	if(digits.length() == 0) return list;
        String[] letters = {"abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
        list.push("");
        for(int i = 0; i < digits.length(); i++) {
        	int num = digits.charAt(i) - '2';
        	int size = list.size();
        	for(int k = 0; k < size; k++) {
        		String temp = list.pop();
        		for(int j = 0; j < letters[num].length(); j++) {
        			list.add(temp + letters[num].charAt(j));
        		}
        	}
        }
        return list;
    }
}
